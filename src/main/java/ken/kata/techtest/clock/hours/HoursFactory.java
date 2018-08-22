package ken.kata.techtest.clock.hours;

import ken.kata.techtest.clock.TimeUnit;
import ken.kata.techtest.clock.TimeUnitPart;
import ken.kata.techtest.view.Color;
import ken.kata.techtest.view.Lamp;

import java.util.List;

import static java.util.Arrays.asList;

public class HoursFactory {
	
	/*
	 * Utility classes, which are a collection of static members, are not meant to be instantiated. Even abstract utility classes, which can be extended, 
	 * should not have public constructors.Java adds an implicit public constructor to every class which does not define at least one explicitly. 
	 * Hence, at least one non-public constructor should be defined.
	 */
	private HoursFactory() {
		
	}
	
    public static List<? extends TimeUnit> createParts() {
        return asList(
                createTopPart(),
                createBottomPart());
    }

    public static TimeUnitPart createTopPart() {
        return new TimeUnitPart(
                asList(new Lamp(Color.RED),
                        new Lamp(Color.RED),
                        new Lamp(Color.RED),
                        new Lamp(Color.RED)),
                (units) -> units / 5);
    }

    public static TimeUnitPart createBottomPart() {
        return new TimeUnitPart(
                asList(new Lamp(Color.RED),
                        new Lamp(Color.RED),
                        new Lamp(Color.RED),
                        new Lamp(Color.RED)),
                (units) -> units % 5);
    }
}
