# Heroes-Squad App

## Project Description 

Heroes-Squad App is an App that enables a user to recruit a team of superheroes.
The user may create as many heroes as possible and also create squads and assign heroes to these squads.
A hero can however not belong to more than one squad but a squad can contain as many heroes as the user sets.
In a Hero Squad game, players typically have the following objectives and gameplay elements:
Recruit Heroes: Players have the ability to select and recruit different heroes into their squad.
Each hero possesses their own special powers, skills, and weaknesses. The players must strategically 
choose heroes with complementary abilities to form a strong and balanced team.
Squad Formation: Players need to strategically assign heroes to their squad, considering factors such 
as team synergy, tactical advantages, and mission requirements. The squad formation plays a crucial role
in determining the overall effectiveness and success of the team.
Overall, Hero Squad games provide an immersive and engaging experience, allowing players to immerse themselves in
a world of superheroes, teamwork, and strategic decision-making. The game combines elements of role-playing, strategy,
and action to create an exciting and dynamic gameplay experience.

## Behaviour -driven development
-Feature: Recruit Heroes
scenario: Successfully recruit a hero into the squad Given the player is logged in and on the recruit page When
the player selects a hero from the available options Then the hero is added to the squad roster And the player 
receives a success message confirming the hero recruitment
-Scenario: Cannot recruit the same hero twice Given the player is logged in and on the recruit page And the hero is
already in the squad roster When the player tries to recruit the same hero again Then the player receives an error 
message indicating that the hero is already recruited
Feature: Squad Formation
-Scenario: Assign heroes to the squad Given the player is logged in and on the squad formation page When the
player selects heroes from the available roster And assigns them to the squad slots Then the heroes are successfully
assigned to the squad And the player can see the updated squad formation

Scenario: Squad size restriction Given the player is logged in and on the squad formation page And the squad has reached
the maximum size limit When the player tries to assign another hero to the squad Then the player receives an error message
indicating that the squad is already full

Feature: Missions and Challenges
Scenario: Complete a mission successfully Given the player is on the mission page And the squad is prepared for the mission When the
player initiates the mission Then the player receives mission details and objectives And the squad engages in battles and completes the
objectives And the player receives rewards upon successful completion
Scenario: Fail a mission Given the player is on the mission page And the squad is not adequately prepared for the mission When th
e player initiates the mission Then the player receives mission details and objectives And the squad struggles in battles and fails
to complete the objectives And the player receives a failure message.

## Author's Information
This project was developed by lucy ololchike
## Demo

Here is a working live demo : 
## Build  

Run `gradle build` to build the project.

## Known bugs

There are no known bugs in this project.

## Technologies used
Java programming language
IntelliJ IDEA
- Gradle.
## To  view the project, visit the GitHub repository:

https://github.com/lololchike/JavaSparkWeek2_IP.git

## Contact Information

- Email : lucyololchike@gmail.com
- Phone : +254 706717834


