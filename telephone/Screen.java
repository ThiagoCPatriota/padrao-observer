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
        model.addObserver(new Observer() {
            @Override
            public void update(int newDigit) {
                if (model.getDigits().size() == 12) {
                    StringBuilder phoneNumber = new StringBuilder();
                    for (int digit : model.getDigits()) {
                        phoneNumber.append(digit);
                    }
                    System.out.println("Agora discando " + phoneNumber + "...");
                }
            }
        });
    }
}
