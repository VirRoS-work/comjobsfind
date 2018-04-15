package modules.base.service;

import modules.base.model.Contact;

import java.util.List;

public interface ContactService {

    void save(Contact contact);

    Contact getById(int id);

    void removeById(int id);

    List<Contact> getList();
}
