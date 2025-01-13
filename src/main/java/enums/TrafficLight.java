package enums;

public enum TrafficLight {
  // Enum constants with custom implementation for abstract method
  RED(30, "Stop") {
    @Override
    public String getAdvice() {
      return "Stop immediately.";
    }
  },
  YELLOW(5, "Caution") {
    @Override
    public String getAdvice() {
      return "Prepare to stop.";
    }
  },
  GREEN(60, "Go") {
    @Override
    public String getAdvice() {
      return "Proceed with caution.";
    }
  };

  // Instance fields
  private final int durationInSeconds;
  private final String action;

  // Constructor for enum
  TrafficLight(int durationInSeconds, String action) {
    this.durationInSeconds = durationInSeconds;
    this.action = action;
  }

  // Getter methods
  public int getDurationInSeconds() {
    return durationInSeconds;
  }

  public String getAction() {
    return action;
  }

  // Abstract method must be implemented by all constants
  public abstract String getAdvice();

  // Overriding toString
  @Override
  public String toString() {
    return String.format("%s (%d seconds): %s", name(), durationInSeconds, action);
  }

  // Static method to find TrafficLight by action
  public static TrafficLight fromAction(String action) {
    for (TrafficLight light : values()) {
      if (light.getAction().equalsIgnoreCase(action)) {
        return light;
      }
    }
    throw new IllegalArgumentException("No TrafficLight with action: " + action);
  }
}
