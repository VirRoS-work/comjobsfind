package modules.base.dao;

import modules.base.model.ContactType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContactTypeDAO extends JpaRepository<ContactType, Integer> {
}
