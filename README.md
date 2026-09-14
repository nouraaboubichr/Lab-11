# Exercice 1 — Gestionnaire de Liste de Courses avec List

* L’objectif est de découvrir la collection `List` en Java à travers son implémentation `ArrayList`.
* Le programme `ShoppingList` permet de gérer dynamiquement une liste d’articles.
* La classe `ShoppingList` utilise un `List<String>` pour stocker les articles.
* Les principales opérations utilisées sont `add`, `remove`, `contains`, `get` et `size`.
* La méthode `display()` permet d’afficher les articles de manière numérotée.
* La classe `Main` utilise `Scanner` pour permettre à l’utilisateur d’ajouter, supprimer, rechercher et afficher les articles.
* Cet exercice permet de comprendre la manipulation d’une liste et l’interaction avec l’utilisateur via la console.

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-14 230039.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-14 230106.png" />

# Exercice 2 — Gestionnaire de Tâches avec List

* L’objectif est de créer un gestionnaire de tâches `TaskManager` en utilisant `List` et `ArrayList`.
* La classe `Task` représente une tâche avec un identifiant, une description, une priorité et un statut.
* La classe `TaskManager` utilise un `List<Task>` pour stocker les différentes tâches.
* Le gestionnaire permet d’ajouter, supprimer et mettre à jour le statut des tâches.
* Les tâches peuvent être filtrées par statut ou par priorité grâce aux Streams.
* La méthode `sortByPriority()` permet de trier les tâches selon leur niveau de priorité.
* Le programme `Main` permet de tester les différentes opérations sur la liste des tâches.

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-14 230119.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-14 230135.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-14 230219.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-14 230238.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-14 230246.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-14 230314.png" />


# Exercice 3 — Maîtrise des Set : Gestionnaire de Mots Uniques

* L’objectif est de découvrir les principales implémentations de l’interface `Set` en Java.
* Le programme `WordManager` utilise simultanément un `HashSet`, un `LinkedHashSet` et un `TreeSet`.
* Le texte est transformé en mots minuscules et les doublons sont automatiquement éliminés.
* `HashSet` permet de stocker les mots sans ordre garanti, `LinkedHashSet` conserve l’ordre d’insertion et `TreeSet` maintient les mots dans l’ordre alphabétique.
* Le gestionnaire permet de rechercher la présence d’un mot et de supprimer un mot dans les trois ensembles.
* Le programme `Main` utilise `Scanner` pour permettre à l’utilisateur de rechercher et supprimer des mots.
* Cet exercice permet de comparer les comportements et les performances des différentes implémentations de `Set`.

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-14 231320.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-14 231354.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-14 231403.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-14 231411.png" />

# Exercice 4 — Gestion d’un Dictionnaire Bilingue avec Map

* L’objectif est de découvrir l’utilisation de l’interface `Map` à travers `HashMap`, `LinkedHashMap` et `TreeMap`.
* Le programme `DictionaryManager` représente un dictionnaire anglais-français sous forme de paires mot → traduction.
* `HashMap` permet des accès rapides sans ordre garanti, `LinkedHashMap` conserve l’ordre d’insertion et `TreeMap` trie automatiquement les clés.
* Le gestionnaire permet d’ajouter ou mettre à jour une traduction, rechercher un mot et supprimer une entrée.
* La méthode `displayAll()` permet de comparer le contenu et l’ordre des trois maps.
* La recherche par préfixe permet de trouver plusieurs mots correspondants afin de simuler une autocomplétion.
* Le programme `Main` utilise `Scanner` pour tester la recherche, l’autocomplétion et la suppression d’entrées.

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-14 231434.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-14 231453.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-14 231503.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-14 231513.png" />

# Exercice 5 — Maîtrise des Collections : Gestion d’une bibliothèque

* L’objectif est de mettre en pratique les principales collections Java : `List`, `Set` et `Map`.
* La classe `Book` représente un livre identifié par son ISBN, son titre et son auteur.
* La classe `User` représente un usager identifié par un ID et un nom.
* La classe `Library` utilise une `List<Book>` pour stocker les livres et une `Map<Book,Integer>` pour gérer les quantités disponibles.
* Les emprunts sont enregistrés avec une `Map<User,List<Book>>` associant chaque usager à ses livres empruntés.
* La bibliothèque permet d’ajouter des livres, effectuer des prêts, retourner des livres et afficher les disponibilités.
* Les méthodes `equals()` et `hashCode()` permettent d’identifier correctement les livres et les usagers dans les collections.
* Cet exercice permet de comprendre comment plusieurs types de collections peuvent collaborer dans une même application Java.

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040018.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040044.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040058.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 050915.png" />
