# AI Tarot Reading App

## 📌 Project Overview
The **AI Tarot Reading App** is an interactive mobile application that allows users to receive Tarot readings and insights through AI-generated interpretations. Users can select Tarot cards, ask questions, and view past readings. The app also provides an intuitive UI for an engaging experience.

## 🎯 Features (Level 1 - MVP)
### ✅ Core Functionalities:
- **Tarot Card Selection**: Users can shuffle and select 3 Tarot cards.
- **AI-Generated Interpretations**: After selecting cards, the app displays predefined interpretations.
- **User Question Input**: Users can ask questions related to their Tarot reading.
- **Past Readings Storage**: Readings are stored using Room DB, allowing users to view them later.
- **Simple & Functional UI**: A user-friendly interface with essential interactions.

### 📂 Additional Functionalities:
- **RecyclerView/GridView for Tarot Deck**: Displays 72 Tarot cards in an interactive layout.
- **Navigation Between Activities**:
  - **Main Activity**: Users select Tarot cards and ask questions.
  - **Result Activity**: Displays selected cards and their interpretations.
  - **Past Readings Activity**: Shows stored readings from Room DB.
- **SQLite & Room Database Integration**: Enables offline storage of past readings.

## 🛠️ Tech Stack
- **Programming Language**: Kotlin
- **UI Design**: XML-based layouts
- **Data Management**:
  - Room Database (SQLite) for offline storage
- **Android Components**:
  - `RecyclerView` / `GridView` for displaying Tarot cards
  - `Room DB` for storing past readings
  - `ViewBinding` for efficient UI updates
  - `LiveData` & `LifecycleScope` for asynchronous data handling

## 📌 How to Use
1. **Ask a question** in the input field.
2. **Select 3 Tarot cards** from the deck.
3. **View the interpretation** generated for your selection.
4. **View past readings** in the "Past Readings" section.
