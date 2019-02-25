### Ćwiczenia z dockerów dla JA

Ćwiczenie 0;
  -   Instalacja Dockera korzystając z dokumentacji https://docs.docker.com/install/linux/docker-ce/ubuntu/
  -  $ docker run hello-world
 
Cwiczenie 0.2
 
 - Na swoich maszynach postawcie sobie dockera z ubuntu np. 16.04
 
          docker run -it ubuntu 16.04 /bin/bash

Cwiczenie 0.5
 - w repo znajduje się projekt majler
 - zbuduj go mavenem
 - dodaj do niego Dockerfile
 
 na przykład taki:
 
         FROM openjdk:7
         MAINTAINER oskar <oskar_dzioch@epam.com>
         
         ENV ENVIRONMENT=production
         
         COPY target/mailer-0.0.1-SNAPSHOT.jar /
         
         EXPOSE 8080
         
         ENTRYPOINT ["java", "-jar", "mailer-0.0.1-SNAPSHOT.jar"]
       
   
   - zbuduj obraz dockera
    
         $sudo docker build . --tag mejler
         
   - uruchom go na przekierowując port z kontenera na swój lokalny

         $sudo docker run -d -p 8000:8081 mejler2
      
 - wejdz do kontenera
 
       sudo docker exec -it <container name> /bin/bash
       
       
-   zapauzuj kontener     
-   zastopuj kontener
-   usuń kontener   
      
Ćwiczenie 1.
 - wejdz na hub.docker.com
 - znajdz sobie jakąś bazę danych i uruchom ją w kontenerze u siebie
 
Cwiczenie 2.
  -  Pobierz z huba Tomcata, 
  -  postaw jego obraz u siebie wrzucając na niego apke sample.war
 
Cwiczenie 2.1.
  - Postaw u siebie kontener z rocketChatem

Ćwiczenie 2.2
W tym ćwiczeniu zainstaluj webową aplikacje PHP.

    https://hub.docker.com/r/kanboard/kanboard
    https://hub.docker.com/r/webhippie/kanboard
  
Ćwiczenie 4. 
  - Jeżeli Masz ochotę przeczytaj artykuł o zabezpieczaniu
  -  https://prefetch.net/blog/2017/09/30/using-docker-volumes-on-selinux-enabled-servers/

Ćwiczenie ekstra: Dockercraft
https://www.youtube.com/watch?v=eZDlJgJf55o









