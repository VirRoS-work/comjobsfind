package modules.base.service;

import modules.base.model.ContactType;

import java.util.List;

public interface ContactTypeService {

    void save(ContactType contactType);

    ContactType getById(int id);

    void removeById(int id);

    List<ContactType> getList();
}
