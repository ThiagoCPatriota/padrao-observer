/**
 * Prints things out to the screen, when needed
 * Printing to the screen:
 * System.out.println("hello");
 */
public class Screen {
    private final PhoneModel model;

    public Screen(PhoneModel model) {
        this.model = model;
        model.addObserver(new Observer() {
            @Override
            public void update(int newDigit) {
                System.out.println("Latest digit: " + newDigit);
            }
        });
    }
}
