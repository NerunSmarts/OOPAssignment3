## CHANGE OF PLANS EVERYONE

Welp, this is kinda dumb. We got told to engineer a solution and then got told to just throw it out afterwards and use the teacher's solution... which isn't the best by a long stretch imo.

WITH THAT BEING SAID, THIS DOCS PAGE WILL NOT BE ACCURATE ANYMORE FOR A WHILE. OR EVER. IDK.

## getting started with my mess of a coding project

So I feel like this shouldn't really need to be said, but main.java is the main executable for the project.

## Using the Classes

There are a lot of classes in this project, here are some of them with a quick explanation of what they do.

- `main`: you gotta be stupid if you don't know what this is and you say you know Java.
- `student`: This is an object that gets assigned a first and last name and a UUID on startup. You can also give it up to 5 different schedules in an array when you create the object or assign them later.
- `schedule`: These are assignable to the student objects, and cannot exist without being assigned to a student. They collect the student's UUID and also have their own so you can distinguish them. Contains up to 50 `course` entries in the form of the container object `scheduleObject`.
- `scheduleObject`: Speaking of, this is literally just a container that gets put in an array for the `schedule` class. Has a String for semester, int for year, and accepts `course` objects.
- `course`: These are probably the toughest part of this damn thing. Courses have a String courseName, an int courseNumber, String program, int credits, and accepts an array of courses as prerequisites. This is where it gets complex, because it needs to check that the prereqs don't make a loop and a bunch of other stuff. Gotta be careful writing this so I don't make a logic bomb lol.

> It's technically not a logic bomb, it'll just burn a lot of CPU similar to the chess AI Stockfish: by checking every available prereq for every prereq. Just gotta be careful.

## Using this stupid program

The main way to do anything in it right now is just download and change the damn `main` class. Stupid solution, I know, i'm not done writing it.

## What I still need to do

I really don't know! Well, I kinda do, but I don't really think the documentation i've recieved quite covers the ins and outs of what this is supposed to do.
