package hw10.factories;

import hw10.models.Coupe;
import hw10.models.Sedan;

public interface CarFactory {
    Sedan createSedan();

    Coupe createCoupe();
}
