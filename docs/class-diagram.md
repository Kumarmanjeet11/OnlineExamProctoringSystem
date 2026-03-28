# Class Diagram – Online Exam Proctoring System

## Classes and Structure

### 1. User (Base Class)
Attributes:
- username : String
- password : String

Methods:
- login() : boolean

---

### 2. Student (inherits User)
Methods:
- takeExam()
- viewResult()

---

### 3. Admin (inherits User)
Methods:
- addQuestion()
- monitorExam()
- manageStudents()

---

### 4. Question
Attributes:
- questionText : String
- options : String[]
- correctAnswer : int

Methods:
- checkAnswer(int answer) : boolean

---

### 5. Exam
Attributes:
- questions : List<Question>
- score : int

Methods:
- startExam()
- calculateScore()

---

## Relationships:

- Student → takes → Exam
- Exam → contains → Question
- Admin → manages → Questions and Students
- Student and Admin both inherit from User