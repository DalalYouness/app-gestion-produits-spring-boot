# 🧾 Application Web JEE - Gestion des Produits

Cette application Web JEE permet la **gestion de produits** à travers une interface utilisateur conviviale. Elle est construite avec les frameworks **Spring Boot**, **Spring MVC**, **Spring Data JPA**, **Thymeleaf**, et **Spring Security**, offrant à la fois une bonne structuration technique et une expérience utilisateur fluide.

---

## 🎯 Objectif de l'application

Développer une application complète permettant :

- L’affichage d’une liste de produits.
- L’ajout de nouveaux produits avec validation des champs.
- La suppression de produits existants.
- Une interface web esthétique avec mise en page réutilisable.
- Une sécurisation des accès via Spring Security.

---

## 🔧 Architecture & Technologies utilisées

L'application repose sur les couches suivantes :

- **Contrôleur Spring MVC** pour gérer les requêtes HTTP.
- **Thymeleaf** pour le rendu des vues côté client, avec un système de layouts basé sur Bootstrap.
- **Spring Data JPA + Hibernate** pour la gestion de la persistance des données.
- **Spring Security** pour la sécurisation de l’application.
- **Spring Validation** pour la vérification des champs de formulaire.
- **Base de données H2** pour le développement/test, avec la possibilité d’utiliser **MySQL** en production.

---

## 🔄 Fonctionnalités principales

### 1. Affichage des produits
- Visualisation de tous les produits enregistrés dans la base de données sous forme de liste.
- Interface simple et responsive.

### 2. Ajout d’un produit
- Formulaire de saisie avec validation côté serveur.
- Vérification automatique des champs obligatoires ou invalides.

### 3. Suppression d’un produit
- Chaque produit peut être supprimé individuellement depuis la liste.

### 4. Mise en page dynamique
- Utilisation de **Thymeleaf Layout Dialect** pour factoriser l’interface.
- Intégration de **Bootstrap** pour un design moderne.

### 5. Sécurité
- L’application est sécurisée avec **Spring Security**.
- Possibilité de désactiver la sécurité par défaut pour le développement ou d’ajouter des règles d’accès personnalisées.

---

## 📌 Remarques supplémentaires

- Le projet est conçu pour être facilement extensible.
- Les validations sont réalisées via des annotations JSR-303.
- L’architecture respecte les bonnes pratiques des applications Spring Boot MVC.

---

Projet réalisé dans le cadre d’un exercice pratique sur les technologies Spring Boot rendu html coté serveur.

