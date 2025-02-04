<img src="https://raw.githubusercontent.com/wysockif/BattleZone/master/docs/scr/logo.png" alt="Noticeboard" style="height: auto !important;width: 150px !important;" >

![GitHub tag (latest by date)](https://img.shields.io/github/v/tag/wysockif/BattleZone)

---

### Table of Contents
* [About](#about)
* [Motivation and project status](#motivation-and-project-status)
* [Technologies used](#technologies-used)
* [Requirements](#requirements)
* [Configuration](#configuration)
* [Setup and usage](#setup-and-usage)
* [Tests](#tests)
* [Screenshots](#screenshots)
* [Licence](#licence)

---

### About

BattleZone is a desktop multiplayer game in which two players are competing against each other, shooting the targets with the tanks. 

All the targets have specified values, which players can score after shooting them. There can also randomly appear some extra points. 

The targets reduce their size and their values are incremented by one every 'Y' seconds. Every 'X' seconds they bear children-targets with values 1.

To shoot the target you need to decrement its value to zero (current value is displayed on the target) - then you get its historical greatest value (the current color of the target and the legend below the board can help remind you what the max value was). The bullets speed up every 'Z' seconds. You can define all these variables in the configuration file.

How to play?
* left player: pressing W S A D keys to move and space to shoot;
* right player: pressing arrow keys to move and enter to shoot.

When is the game over?

* the time is up;
* the player scores the max number of points;
* the player shoots the unique target - Armageddon.

At the end of the game you can save the final stage to the png file.

<img src="https://raw.githubusercontent.com/wysockif/BattleZone/master/docs/scr/game_loop.gif" alt="drawing" style="width:900px; margin: 10px;"/>

---

### Motivation and project status

BattleZone was created during my first year of studying Computer Science in collaboration with Bartosz Zdybel. It was our first application in Java with graphical user interface. 

The project was completed successfully. 

Duration time: 14.04.2020 - 01.06.2020.

---

### Technologies used
* Java (13);
* Swing;
* Maven;
* Git;
* IntelliJ.

---

### Requirements

To run the game you need to have JRE 13 installed. 

To build a JAR by yourself you need also Maven.

---

### Configuration

You can use the default configuration or create your own and upload it in the main menu.

Examplary configuration file:

```txt
A=560
B=500
P=6
X=5
Y=12
Z=6
K=10
L=15
```
* A - width of the board (px);
* B - height of the board (px);
* P - max number of active bullets (per player);
* X - time to bore targets-children;
* Y - time to increment targets values and reduce their size;
* Z - time to speed up the bullets;
* K - how many percent speed up the bullets;
* L - how many percent reduce the targets size.
---

### Setup and usage

1.  Clone this repository:

    ```bash
    git clone git@github.com:wysockif/BattleZone.git
    ```

2.  Change your directory to `BattleZone/app` and build the JAR file:

    ```bash
    mvn clean install
    ```

3.  Run the application:

    ```bash
    java -jar target/BattleZone-1.0-SNAPSHOT.jar
    ```

You can also run it by double-clicking.

---

### Tests

1. Run all (39) tests:

    ```bash
    mvn test
    ```
    The tests were created with JUnit 4, AssertJ, Mockito.

---

### Screenshots

* Main menu:

    <img src="https://raw.githubusercontent.com/wysockif/BattleZone/master/docs/scr/main-menu.png" alt="drawing" style="width:900px; margin: 10px;"/>

* Game:

    <img src="https://raw.githubusercontent.com/wysockif/BattleZone/master/docs/scr/game.png" alt="drawing" style="width:900px; margin: 10px;"/>

* Game summary:

    <img src="https://raw.githubusercontent.com/wysockif/BattleZone/master/docs/scr/results.png" alt="drawing" style="width:900px; margin: 10px;"/>

---

### License
Usage is provided under the [MIT License](http://opensource.org/licenses/mit-license.php). See LICENSE for the full details.
