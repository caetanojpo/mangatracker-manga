## **Project Overview: MangaTracker**

The **MangaTracker** project was born out of a problem I faced in tracking my own manga readings. At first, I used a **Google Sheet** to organize and monitor my progress across different manga series. While functional, it quickly became clear that this approach was not practical or scalable. I needed a more efficient and intuitive solution to manage my manga collection, track my progress, and gain insights into my reading habits. This led to the creation of the **MangaTracker** platform.

This is a glimpse of how I was tracking my reading:
![image](https://github.com/user-attachments/assets/68775e97-a3ed-429f-afec-a8d1c81a09ba)

The goal of MangaTracker is to provide a comprehensive, easy-to-use platform for manga enthusiasts who want to track their ongoing series, discover new manga, and get personalized recommendations based on their reading history. The platform integrates several microservices, each focused on different aspects of the user journey: user management, manga data handling, recommendations, and notifications.

By creating this API, I’m not only solving my own problem but also improving my tracking experience while refining my development skills. It’s a win-win scenario!

---

## **Manga Tracker - Manga Service Overview**

The **Manga Tracker - Manga Service** is a core component of the MangaTracker platform that handles all the essential operations related to manga content. Built using **Spring Boot** (Java) and powered by **PostgreSQL** and **MongoDB** databases, this service manages tasks such as fetching manga data from external APIs, tracking user reading progress, and generating insightful statistics.

### Key Features:
1. **Importing Manga Data**  
   The service integrates with external public APIs to fetch metadata about available manga series, ensuring that users always have access to the latest manga information.

2. **Tracking Reading Progress**  
   Users can record their progress in various manga series, marking chapters they've read and managing their reading history, making it easy to pick up where they left off.

3. **Generating User Statistics**  
   The service tracks and generates detailed statistics about the user's reading habits, helping them visualize their progress and identify trends in their manga consumption.

4. **Managing Manga Metadata**  
   The service organizes manga metadata for users, enabling easy searching, filtering, and sorting of manga titles.

The Manga Service communicates with other components of the platform, including the **API Gateway** and **Message Broker** (RabbitMQ), ensuring efficient, asynchronous interactions with services like **Recommendations** and **Notifications**.

By centralizing manga management in this service, MangaTracker aims to provide users with a seamless and engaging experience for organizing and enjoying their manga collections.
