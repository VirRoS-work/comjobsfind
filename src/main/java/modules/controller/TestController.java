package modules.controller;

import modules.base.model.Contact;
import modules.base.model.ContactType;
import modules.base.service.ContactService;
import modules.base.service.ContactTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @Autowired
    ContactTypeService contactTypeService;

    @Autowired
    ContactService contactService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ModelAndView test(){
        return new ModelAndView("test", "contactType", new ContactType());
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public ModelAndView test2(@ModelAttribute("contactType")ContactType contactType){

        contactTypeService.save(contactType);

        return new ModelAndView("testOk");
    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public ModelAndView testContact(){

        ContactType contactType = contactTypeService.getById(1);

        Contact contact = new Contact();
        contact.setType(contactType);
        contact.setValue("test");

        contactService.save(contact);

        return new ModelAndView("testOk");
    }
}
