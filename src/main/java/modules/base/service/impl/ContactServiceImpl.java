package modules.base.service.impl;

import modules.base.dao.ContactDAO;
import modules.base.model.Contact;
import modules.base.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactDAO dao;

    @Override
    public void save(Contact contact) {
        dao.save(contact);
    }

    @Override
    public Contact getById(int id) {
        return dao.getOne(id);
    }

    @Override
    public void removeById(int id) {
        dao.deleteById(id);
    }

    @Override
    public List<Contact> getList() {
        return dao.findAll();
    }
}
