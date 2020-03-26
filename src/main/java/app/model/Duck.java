package app.model;

import org.springframework.stereotype.Component;

@Component
public class Duck extends Animal {
    @Override
    public String toString() {
        return "Im a Duck";
    }
}
