package springframework.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository{

    @Override
    public String getEnglishGreeting() {
        return "Hello from english and default Profile Service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hola Mundo - Spanish Greeting Service";
    }

    @Override
    public String getGermanGreeting() {
        return "Hallo Welt - German greeting Service";
    }
}
