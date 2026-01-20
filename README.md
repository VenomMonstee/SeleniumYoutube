# Selenium YouTube Automation Project

This repository contains an automated testing suite for YouTube using **Selenium WebDriver** with **Java**. The project follows the **Page Object Model (POM)** design pattern for better maintainability and scalability.

## 🚀 Technologies Used

- **Java 11**: Programming language.
- **Selenium WebDriver 4.16.1**: For browser automation.
- **TestNG 7.8.0**: Testing framework for assertions and test management.
- **WebDriverManager 5.6.2**: To manage browser drivers automatically.
- **Maven**: Build and dependency management tool.

## 📁 Project Structure

```text
SeleniumYoutube/
├── src/
│   ├── main/java/pages/            # Page Object classes
│   │   ├── BasePage.java           # Common page methods
│   │   ├── HomePage.java           # YouTube Home Page
│   │   ├── SearchResultsPage.java  # Search Results Page
│   │   └── VideoPage.java          # Video Player Page
│   ├── test/java/
│   │   ├── tests/                  # Test suites
│   │   │   ├── BaseTest.java       # Setup/Teardown logic
│   │   │   ├── SearchTest.java     # Search functionality tests
│   │   │   └── VideoPlayerTest.java # Video playback tests
│   │   └── utils/
│   │       └── DriverManager.java  # WebDriver initialization
├── pom.xml                         # Project dependencies
└── README.md                       # Project documentation
```

## 🛠️ Getting Started

### Prerequisites

- Java JDK 11 or higher
- Apache Maven
- Chrome Browser (or any supported browser by WebDriverManager)

### Installation

1.  **Clone the repository**:
    ```bash
    git clone https://github.com/VenomMonstee/SeleniumYoutube.git
    cd SeleniumYoutube
    ```

2.  **Install dependencies**:
    ```bash
    mvn clean install
    ```

## 🧪 Running Tests

You can run the tests using Maven:

```bash
mvn test
```

Or run individual test classes:

```bash
mvn test -Dtest=SearchTest
```

## ✨ Features Automated

- **Search Functionality**: Verifies that search results are correctly loaded for a given query.
- **Video Playback**: Tests video selection and playback features.
- **Responsive Navigation**: Basic handling of the YouTube interface.

## 🤝 Contribution

Contributions are welcome! Feel free to fork the repository and submit a pull request.
