class regle{
    // faire un txt à print

    final Char N = \n;

    String regles = "
        le but du jeu est d'obtenir plus de points que le croupier en ne sachant pas son score" + N +
        + N +
        "les differentes couleurs sont celles d'un packet de carte classique, c'est a dire" +N+
        "   -Pique" + N+
        "   -trèfle"+N+
        "   -carreau"+N+
        "   -coeur"+N+
        +N+
        "le packet est composé de cartes de 1 à 10 , de rois et de jockers"+N+
        "   -les cartes de 1 à 10 valent on la valeur du numéro de leur carte"+N+
        "   -les rois et les jockers valent 10 points"+N+
        +N+
        "votre compteur de point est affiché, mais pas celui du croupier"+N+
        +N+
        "Au début de la partie, le joueur et le croupier commencent avec 30 étoiles"+N+
        "deux cartes sont donné aux participants, puis les participants ont deux choix:"+N+
        "   -piocher un carte (avec une limite de 4 cartes en main)"+N+
        "   -montrer ses cartes"+N+
        "dans le second cas, l'adversaire doit être d'accord peut être d'accord pour montrer aussi les siennes"+ N+
        +N+
        "lorsque les deux joueurs montrent leurs cartes, le calculs des étoiles est fait:"+N+
        "si un joueur à un score strictement supérieur à 21:"+N+
        "   -le joueur adverse lui volent le nombre d' étoile correspondant à la valeur de sa main"+N+
        "sinon on calcule la différence entre les deux score, puis le joueur avec le score le plus élevé vole le nombre d'étoiles correspondant au score"+N+
        "si les deux joueurs dépassent 21, il y a une égalité et aucun joueurs ne gagnent ni perdent rien"+N+
        "la partie finie quand le nombre d'étoiles d'un joueur est inférieur ou égal a 0"+N+
        +N+
        "différentes questions choisi aléatoirement seront posés au joueur"+N+
        "   -quand le croupier choisit de montrer ses cartes"+N+
        "en cas de mauvaise réponse, le joueur est obligé de montrer ses cartes"+N+
        "   -toutes les trois manches"+N+
        "en cas de bonne réponse, le joueur gagne un bonus"+N+
        "   -lors de la première fois où le nombre d'étoiles est inférieur a 0"+N+
        "en cas de bonne réponse, il continue avec 10 étoiles"+N+
        "(1) : qqch, (2) : quitter";
}

void afficherRegle(Regle regle){
    println(regle);
}