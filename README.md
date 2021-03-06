# UltimateScoreboards

Official repository of UltimateScoreboards plugin. Get it on <https://www.spigotmc.org/>.

For the **official wiki** visit <https://github.com/frengor/UltimateScoreboardsAPI/wiki>.

UltimateScoreboards is a powerful and light plugin to manage scoreboards on your Minecraft server.  
It comes with a ton of features which allows you to easily customize your scoreboards. 

UltimateScoreboard is:
* **fast**: the plugin is written with efficiency in mind
* **easy to use**: the plugin is pretty straightforward to use
* **flexible**: every other team-based plugin out there is supported (obviously, not scoreboard ones)
* **extensive**: you can customize everything from the config
* **reliable**: scoreboards will never flick thanks to the built-in antiflicker
* **asynchronous**: the plugin is all packet-based, which means that it won't impact on the server performance
* **powerful**: you can create scoreboards with ~72 characters per line with only 1-tick update delay (this only on 1.8-1.12 servers, on 1.13+ mojang removed all limitations).

### Minecraft Limitations

There are some limitations regarding scoreboards on minecraft versions from 1.8 to 1.12. This is due to the fact that scoreboards were originally thought by Mojang  to contains per-player scores, like how many blocks every player mined, ect. Vanilla scoreboards do look like a list of players with red numbers at their right.  
From 1.13, Mojang removed those limitations, seeing how server were using scoreboards to contains more complicated things than a list of player names, like colored lines and texts.

***

### Developer API

In the repository you'll find the official API of the plugin.  
If you're a developer and you're intrested check out the [official Developer API Wiki](https://github.com/frengor/UltimateScoreboardsAPI/wiki/Developer-API).

**Javadocs:** <https://frengor.com/javadocs/UltimateScoreboardsAPI/build-server>  
**Maven:**
```xml
<repositories>
    <repository>
        <id>fren_gor</id>
        <url>https://nexus.frengor.com/repository/public/</url>
    </repository>
</repositories>
```
```xml
<dependency>
    <groupId>com.frengor</groupId>
    <artifactId>ultimatescoreboards-api</artifactId>
    <version>1.0</version>
    <scope>provided</scope>
</dependency>
```
API-Jar download for manual dependency addition: <https://jenkins.frengor.com/job/UltimateScoreboardsAPI/>
