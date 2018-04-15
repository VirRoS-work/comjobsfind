package modules.base.service.impl;

import modules.base.dao.ContactTypeDAO;
import modules.base.model.ContactType;
import modules.base.service.ContactTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactTypeServiceImpl implements ContactTypeService {

    @Autowired
    private ContactTypeDAO dao;

    @Override
    public void save(ContactType contactType) {
        dao.save(contactType);
    }

    @Override
    public ContactType getById(int id) {
        return dao.getOne(id);
    }

    @Override
    public void removeById(int id) {
        dao.deleteById(id);
    }

    @Override
    public List<ContactType> getList() {
        return dao.findAll();
    }
}
