package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {

    // @Autowired == BAD way to handle this
	private GreetingRepository greetingRepository;

	/* correct way to handle injection of the GreetingRepository */
    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}


	@Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
