package com.oskar.mailer.repository;

import com.oskar.mailer.model.Mail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MailRepository extends CrudRepository<Mail, Long> {
}