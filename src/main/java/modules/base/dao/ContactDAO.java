package modules.base.dao;

import modules.base.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ContactDAO extends JpaRepository<Contact, Integer> {
}
