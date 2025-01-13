package enums;

public class TrafficLightExample {
  public static void main(String[] args) {
    for (TrafficLight light : TrafficLight.values()) {
      System.out.println(light);
      System.out.println("Advice: " + light.getAdvice());
      System.out.println();
    }

    // Using static method
    try {
      TrafficLight lightFromAction = TrafficLight.fromAction("Go");
      System.out.println("From Action: " + lightFromAction);
    } catch (IllegalArgumentException e) {
      System.err.println(e.getMessage());
    }
  }
}
