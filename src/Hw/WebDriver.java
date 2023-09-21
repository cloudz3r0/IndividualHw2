package Hw;

interface WebDriver {
    void open();
    void close();
    String getTitle();
    interface RemoteWebDriver extends WebDriver {
        void navigate();
    }
    interface TakeScreenshot extends RemoteWebDriver {
        void getScreenshot();
    }
    class ChromeDriver implements RemoteWebDriver {

        @Override
        public void open() {
        }

        @Override
        public void close() {
        }
        @Override
        public String getTitle() {
            return null;}

        @Override
        public void navigate() {
        }
    }

    class FirefoxDriver implements RemoteWebDriver {

        @Override
        public void open() {
        }

        @Override
        public void close() {
        }

        @Override
        public String getTitle() {
            return null;}

        @Override
        public void navigate() {

        }
    }

    class SafariDriver implements RemoteWebDriver {
        @Override
        public void open() {
        }

        @Override
        public void close() {
        }

        @Override
        public String getTitle() {
            return null;
        }

        @Override
        public void navigate() {
        }
    }

    class tester {
        public static void main(String[] args) {
            ChromeDriver c1 = new ChromeDriver();
            c1.open();
            c1.close();
            c1.navigate();
            c1.getTitle();

            FirefoxDriver f1 = new FirefoxDriver();
            f1.open();
            f1.close();
            f1.navigate();
            f1.getTitle();

            SafariDriver s1 = new SafariDriver();
            s1.open();
            s1.close();
            s1.navigate();
            s1.getTitle();

        }
    }
}
