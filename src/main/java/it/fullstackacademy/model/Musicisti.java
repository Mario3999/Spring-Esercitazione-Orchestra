package it.fullstackacademy.model;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Musicisti {

	Logger logger = (Logger) LoggerFactory.getLogger(Musicisti.class);
}
