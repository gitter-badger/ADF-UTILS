# ADF-UTILS

Before, you should accept license:  
https://www.oracle.com/webapps/maven/register/license.html

<br/>

    $ mkdir -p /home/<user_name>/.m2/

    $ vi /home/<user_name>/.m2/settings.xml

<br/>  

    <settings>
    <profiles>
        <profile>
          <id>main</id>
          <activation>
            <activeByDefault>true</activeByDefault>
          </activation>
          <repositories>
            <repository>
              <id>maven.oracle.com</id>
              <url>https://maven.oracle.com</url>
              <layout>default</layout>
              <releases>
                <enabled>true</enabled>
              </releases>
            </repository>
          </repositories>
          <pluginRepositories>
            <pluginRepository>
              <id>maven.oracle.com</id>
              <url>https://maven.oracle.com</url>
            </pluginRepository>
          </pluginRepositories>
        </profile>
      </profiles>
        <servers>
            <server>
               <id>maven.oracle.com</id>
               <username>username</username>
               <password>password</password>
               <configuration>
                 <basicAuthScope>
                   <host>ANY</host>
                   <port>ANY</port>
                   <realm>OAM 11g</realm>
                 </basicAuthScope>
                 <httpConfiguration>
                   <all>
                     <params>
                       <property>
                         <name>http.protocol.allow-circular-redirects</name>
                         <value>%b,true</value>
                       </property>
                     </params>
                   </all>
                 </httpConfiguration>
               </configuration>
             </server>
        </servers>
    </settings>
    
<br/>

    username - your oracle login  
    password - your oracle password

<br/>

    $ mvn package
