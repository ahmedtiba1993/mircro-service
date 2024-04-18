![micro_service](https://github.com/ahmedtiba1993/mircro-service/assets/72476268/f479ba74-36b8-4112-88af-a6ff903784d0)

Ce dépôt contient un projet de démonstration présentant une application basée sur une architecture de microservices, conçue pour fournir une compréhension pratique de l'architecture et de la mise en œuvre des microservices. Le projet se compose d'une API Gateway, d'un serveur de configuration, d'un serveur de découverte ( Discovery Server ) et de deux microservices : Étudiant et École.

# Prérequis
Assurez-vous d'avoir installé les logiciels suivants sur votre système avant de continuer :
- Kit de développement Java (JDK) 17 ou version ultérieure
- Maven
- Docker (facultatif, pour la conteneurisation)

# Composants du projet
API Gateway
API Gateway sert de point d'entrée unique pour toutes les demandes des clients, les gérant et les routant vers les microservices appropriés.

### Serveur de configuration
Le serveur de configuration centralise la gestion de la configuration pour tous les microservices, simplifiant la maintenance de l'application et assurant la cohérence à travers les environnements.

### Serveur de découverte
Le serveur de découverte fournit l'enregistrement et la découverte des services, permettant une communication transparente entre les services au sein de l'écosystème des microservices.

### Microservice Étudiant
Le microservice Étudiant est responsable de la gestion des données et des opérations liées aux étudiants, telles que l'ajout, la mise à jour et la récupération des dossiers des étudiants.

### Microservice École
Le microservice École gère les données et les opérations liées à l'école, notamment l'ajout, la mise à jour et la récupération des dossiers scolaires.

# Communication inter-services
### Utilisation de OpenFeign
Ce projet démontre la communication inter-services en utilisant OpenFeign, un client REST déclaratif qui simplifie la communication entre les services au sein de l'écosystème des microservices.

# Traçage distribué
### Utilisation de Zipkin
Le projet présente l'utilisation de Zipkin pour le traçage distribué, améliorant l'observabilité de l'application et permettant la visualisation et le dépannage des problèmes de latence.
