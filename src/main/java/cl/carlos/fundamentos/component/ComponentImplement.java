package cl.carlos.fundamentos.component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ComponentImplement implements ComponentDependency{

    @Override
    public void Saludar() {
        System.out.println("Hola mundo desde un @Component");
    }
}
