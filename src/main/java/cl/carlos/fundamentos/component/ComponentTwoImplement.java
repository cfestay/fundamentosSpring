package cl.carlos.fundamentos.component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ComponentTwoImplement implements ComponentDependency{

    @Override
    public void Saludar() {
        System.out.println("Hola mundo desde el componente dos!!");

    }
}
