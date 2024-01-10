# Nasa APOD Viewer

An Android application that retrieves and displays NASA's Astronomy Picture of the Day (APOD). This project is designed to demonstrate the ability to consume APIs, handle image loading, and implement clean architecture on Android.

## Getting Started

To run this project, you will need to add your own NASA API key. Follow the instructions below:

1. Obtain an API key from [NASA API](https://api.nasa.gov).
2. Clone this repository to your local machine.
3. Open the project in Android Studio or your preferred IDE.
4. Create a file named `local.properties` (if it does not already exist) in the root directory.
5. Add the following line to `local.properties`, replacing `YOUR_API_KEY_HERE` with your actual API key:
```
NASA_API_KEY = YOUR_API_KEY_HERE
```
6. Sync your project with Gradle files and run the app.

## Architecture

This project adheres to the MVP (Model-View-Presenter) architecture, separating the application into three interconnected components.

The project uses a single Activity architecture, represents a View in the MVP pattern. The communication between View and Presenter is handled through interfaces to ensure a clear separation of concerns and easier testing.

## Libraries

- [Retrofit](https://square.github.io/retrofit/) - A type-safe HTTP client for Android and Java.
- [Glide](https://github.com/bumptech/glide) - For image loading.
- [Coroutines](https://developer.android.com/kotlin/coroutines) - For managing background threads with simplified code and reducing needs for callbacks.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- This project utilizes the [NASA API](https://api.nasa.gov), which is publicly available to use.
- Thanks to NASA for providing such a wonderful API and all the amazing imagery.

---

*Note: This project was built as part of a coding challenge for a job interview and is maintained for demonstration purposes.*

