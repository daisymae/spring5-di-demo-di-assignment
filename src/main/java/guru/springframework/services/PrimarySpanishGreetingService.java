package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService {

	/* 
	 * bad Cheryl!
	 * While just adding autowired to the property will work, it is
	 * bad coding style.
	 * Instead, create a constructor and let Spring autowire and inject it there. 
	 */
//	@Autowired -- BAD
    private GreetingRepository greetingRepository;

    
    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}


	@Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
