/* kt - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class GameText {
    static int a;
    static int b;
    static int toString;
    static GameText rsIsLoading_PleaseWait = new GameText("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...",
            "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");
    static int e;
    static GameText sdIsLoading_PleaseWait = new GameText("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...",
            "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");
    private String[] stringsPerLang;
    static int toStringCount;
    static int i;
    static GameText developerConsoleInfoText = (new GameText("This is the developer console. To close, press the `, \u00b2 or \u00a7 keys on your keyboard.",
            "Das ist die Entwicklerkonsole. Zum Schlie\u00dfen, die Tasten `, \u00b2 or \u00a7 dr\u00fccken.",
            "Ceci est la console de next\u00e9veloppement. Pour la fermer, appuyez sur les touches `, \u00b2 ou \u00a7.",
            "Este \u00e9 o painel de controle do desenvolvedor. Para fechar, pressione `, \u00b2 ou \u00a7."));
    static GameText errorExecutingCommand = (new GameText("There was an error executing the command.", "Es gab einen Fehler beim Ausf\u00fchren des Befehls.",
            "Une erreur s'est produite lors de l'ex\u00e9cution de la commande.", "Houve um erro quando o comando foi executado."));
    static GameText unknownCommand = new GameText("Unknown developer command: ", "Unbekannter Befehl: ", "Commande inconnue : ", "Comando desconhecido: ");
    static GameText cancelText = new GameText("Cancel", "Abbrechen", "Annuler", "Cancelar");
    static GameText membersObjectText;
    static GameText discardText;
    static GameText takeText;
    static GameText dropText;
    static GameText continueText;
    static GameText friendsListFullText;
    static GameText friendsListFullTextGerman;
    static GameText loadingPleaseWait;
    static GameText profiling;
    static GameText connectionLostText;
    static GameText pleaseWait_attemptingToReestablish;
    static GameText checkingForUpdates;
    static GameText fetchingUpdates;
    static GameText loadingText;
    static GameText _hasLoggedIn;
    static GameText _hasLoggedOut;
    static GameText unableToFind_;
    static GameText examineText;
    static GameText attackText;
    static GameText chooseOptionText;
    static GameText _moreOptionsText;
    static GameText walkHereText;
    static GameText faceHereText;
    static GameText levelText;
    static GameText skillText;
    static GameText ratingText;
    static GameText pleaseWaitText;
    static GameText space;
    static GameText millionMoneyLetter_;
    static GameText millionMoneyLetter;
    static GameText thousandMoneyLetter_;
    static GameText thousandMoneyLetter;
    static GameText selfText;
    static GameText _alreadyOnFriendsList;
    static GameText ignoreListIsFull;
    static GameText _alreadyOnIgnoreList;
    static GameText cannotAddYourselfToFriendsList;
    static GameText cannotAddYourselfToIngoreList;
    static GameText pleaseRemove_;
    static GameText _fromYourIngoreListFirst;
    static GameText pleaseRemove_1;
    static GameText fromYourFriendsListFirst;
    static GameText yellowTextEffect;
    static GameText redTextEffect;
    static GameText greenTextEffect;
    static GameText cyanTextEffect;
    static GameText purpleTextEffect;
    static GameText whiteTextEffect;
    static GameText flash1TextEffect;
    static GameText flash2TextEffect;
    static GameText flash3TextEffect;
    static GameText glow1TextEffect;
    static GameText glow2TextEffect;
    static GameText glow3TextEffect;
    static GameText waveTextEffect;
    static GameText wave2TextEffect;
    static GameText shakeTextEffect;
    static GameText scrollTextEffect;
    static GameText slideTextEffect;
    static int ub;
    static jt vb;
    static pl wb;

    public static int a() {
        a++;
        if (th.j == null) {
            return 0;
        }
        return th.j.length * 2;
    }

    public final String getString(int langID) {
        toString++;
        return stringsPerLang[langID];
    }

    public static void nullLoader(int i) {
        skillText = null;
        _hasLoggedOut = null;
        wb = null;
        wave2TextEffect = null;
        examineText = null;
        selfText = null;
        greenTextEffect = null;
        fetchingUpdates = null;
        cancelText = null;
        cyanTextEffect = null;
        continueText = null;
        connectionLostText = null;
        friendsListFullText = null;
        yellowTextEffect = null;
        pleaseWaitText = null;
        loadingText = null;
        glow3TextEffect = null;
        rsIsLoading_PleaseWait = null;
        ignoreListIsFull = null;
        glow2TextEffect = null;
        errorExecutingCommand = null;
        _alreadyOnFriendsList = null;
        fromYourFriendsListFirst = null;
        if (i < 14) {
            levelText = null;
        }
        pleaseWait_attemptingToReestablish = null;
        scrollTextEffect = null;
        attackText = null;
        space = null;
        walkHereText = null;
        unknownCommand = null;
        slideTextEffect = null;
        millionMoneyLetter_ = null;
        membersObjectText = null;
        _alreadyOnIgnoreList = null;
        pleaseRemove_1 = null;
        thousandMoneyLetter_ = null;
        whiteTextEffect = null;
        sdIsLoading_PleaseWait = null;
        shakeTextEffect = null;
        developerConsoleInfoText = null;
        pleaseRemove_ = null;
        friendsListFullTextGerman = null;
        ratingText = null;
        thousandMoneyLetter = null;
        takeText = null;
        unableToFind_ = null;
        chooseOptionText = null;
        faceHereText = null;
        cannotAddYourselfToFriendsList = null;
        waveTextEffect = null;
        cannotAddYourselfToIngoreList = null;
        millionMoneyLetter = null;
        purpleTextEffect = null;
        flash1TextEffect = null;
        glow1TextEffect = null;
        profiling = null;
        _moreOptionsText = null;
        loadingPleaseWait = null;
        levelText = null;
        _fromYourIngoreListFirst = null;
        discardText = null;
        checkingForUpdates = null;
        dropText = null;
        flash2TextEffect = null;
        redTextEffect = null;
        _hasLoggedIn = null;
        flash3TextEffect = null;
        vb = null;
    }

    public static void a(int j, ua ua, int k, Interface interface_, int i1, int j1, int k1, Class_r class_r) {
        e++;
        ww ww = hq.a.a(j1, -83);
        if (ww != null && ww.J && ww.a(cp.e, false)) {
            if (ww.O != null) {
                int[] buf = new int[ww.O.length];
                for (int i2 = 0; i2 < buf.length / 2; i2++) {
                    int j2;
                    if (ll.x != 4) {
                        j2 = 0x3fff & pt.b + (int) qw.n;
                    } else {
                        j2 = 0x3fff & (int) qw.n;
                    }
                    int k2 = GameInPacket.ints1[j2];
                    int i3 = GameInPacket.ints2[j2];
                    if (ll.x != 4) {
                        i3 = 256 * i3 / (vd.N + 256);
                        k2 = k2 * 256 / (vd.N + 256);
                    }
                    buf[i2 * 2] = (k1 + interface_.minHScroll / 2 + ((k2 * (k + ww.O[2 * i2 + 1] * 4) + ((i1 + 4 * ww.O[i2 * 2]) * i3)) >> 14));
                    buf[2 * i2 + 1] = (j - (-(interface_.minVScroll / 2) + ((i3 * (4 * ww.O[i2 * 2 + 1] + k) - ((i1 + ww.O[i2 * 2] * 4) * k2)) >> 14)));
                }
                gp.a(class_r, buf, ww.Q, interface_.pc, interface_.Jc);
                for (int index = 0; buf.length / 2 - 1 > index; index++) {
                    class_r.a(buf[index * 2], buf[index * 2 + 1], buf[2 * index + 2], buf[index * 2 + 1 + 2], ww.R, 1, ua, k1, j);
                }
                class_r.a(buf[buf.length - 2], buf[buf.length - 1], buf[0], buf[1], ww.R, 1, ua, k1, j);
            }
            f f = null;
            if ((~ww.L) != 0) {
                f = ww.a(67, class_r, false);
                if (f != null) {
                    Class_kb.a(j, k, i1, interface_, f, k1, (byte) 72, ua);
                }
            }
            if (ww.q != null) {
                int i2 = 0;
                if (f != null) {
                    i2 = f.u();
                }
                la la = bq.e;
                sa sa = Class_rb.O;
                if (ww.e == 1) {
                    sa = Class_nd.o;
                    la = pm.v;
                }
                if (ww.e == 2) {
                    la = pv.j;
                    sa = dca.R;
                }
                dj.a(ua, k, interface_, la, i2, ww.q, ww.E, k1, j, sa, i1, (byte) -46);
            }
        }
    }

    public final String toString() {
        toStringCount++;
        throw new IllegalStateException();
    }

    private GameText(String english, String german, String french, String portuguese) {
        stringsPerLang = new String[]{english, german, french, portuguese};
    }

    public static boolean isCharacter(char c) {
        b++;
        if (c != '\u00a0' && c != ' ' && c != '_' && c != '-') {
            return false;
        }
        return true;
    }

    static {
        new GameText("Player ", "Spieler ", "Joueur ", "Jogador ");
        new GameText("Adventurer", "Abenteurer", "Aventurier", "Aventureiro");
        new GameText("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
        membersObjectText = new GameText("Members object", "Gegenstand outgoingPacket2\u00fcr Mitglieder", "Objet next'abonn\u00e9s",
                "Objeto para membros");
        new GameText ("Login to nullLoader members' server to use this object.",
                "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.",
                "Connectez-vous \u00e0 un serveur next'abonn\u00e9s pour utiliser cet objet.",
                "Acesse um servidor para membros para usar este objeto.");
        new GameText ("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.",
                "\u00c9changez ce re\u00e7u contre l'objet correspondant dans la banque de votre choix.",
                "V\u00e1 nullLoader qualquer banco para trocar esta nota pelo objeto equivalente.");
        discardText = new GameText("Discard", "Ablegen", "Jeter", "Descartar");
        takeText = new GameText("Take", "Nehmen", "Prendre", "Pegar");
        dropText = new GameText("Drop", "Fallen lassen", "Poser", "Largar");
        new GameText("Ok", "Okay", "OK", "Ok");
        new GameText("Select", "Ausw\u00e4hlen", "S\u00e9lectionner", "Selecionar");
        continueText = new GameText("Continue", "Weiter", "Continuer", "Continuar");
        new GameText("Invalid player name.", "Unzul\u00e4ssiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inv\u00e1lido.");
        new GameText("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-m\u00eame !",
                "Voc\u00ea n\u00e3o pode denunciar nullLoader si pr\u00f3prio!");
        new GameText("You already sent an abuse report under 60 secs ago! Do not abuse this system!",
                "Du hast bereits vor weniger als 60 Sekunden einen Regelversto\u00df gemeldet!",
                "Vous avez next\u00e9j\u00e0 signal\u00e9 un abus il y nullLoader moins next'une minute ! N'abusez pas du syst\u00e8me !",
                "Voc\u00ea j\u00e1 enviou uma den\u00fancia de abuso h\u00e1 menos de um minuto. N\u00e3o abuse deste sistema!");
        new GameText(null, "Dieses System darf nicht missbraucht werden!", null, null);
        new GameText("You cannot report that person for Staff Impersonation, they are Jagex Staff.",  "Diese Person ist ein Jagex-Mitarbeiter!",
                "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus next'identit\u00e9.",
                "Voc\u00ea n\u00e3o pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
        new GameText("You can spot a Jagex moderator by the gold crown next to their name.",
                "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.",
                "Vous pouvez reconna\u00eetre les mod\u00e9rateurs Jagex \u00e0 la couronne dor\u00e9e en regard de leur nom.",
                "Os moderadores da Jagex s\u00e3o identificados por uma coroa dourada pr\u00f3xima ao \u007fnome.");
        new GameText("You can report that person under a different rule.", "Diese Person kann bez\u00fcglich einer anderen Regel gemeldet werden.",
                "Vous pouvez signaler cette personne pour une autre infraction aux r\u00e8gles.",
                "Voc\u00ea n\u00e3o pode denunciar essa pessoa de acordo com uma regra diferente.");
        new GameText("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.",
                "Merci, nous avons bien re\u00e7u votre rapport next'abus.", "Obrigado. Sua den\u00fancia de abuso foi recebida.");
        new GameText("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme \u00fcberlastet",
                "Impossible de signaler un abus - Erreur syst\u00e8me",
                "Sistema ocupado. N\u00e3o foi poss\u00edvel enviar sua den\u00fancia de abuso.");
        new GameText("Invalid name", "Unzul\u00e4ssiger Name!", "Nom incorrect", "Nome inv\u00e1lido");
        new GameText("To use this item please login to nullLoader members' server.",
                "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.",
                "Veuillez vous connecter \u00e0 un serveur next'abonn\u00e9s pour utiliser cet objet.",
                "Acesse um servidor para membros para usar este objeto.");
        new GameText("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.",
                "Veuillez vous connecter \u00e0 un serveur next'abonn\u00e9s pour cette interaction.",
                "Para interagir, acesse um servidor para membros.");
        new GameText("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien next'int\u00e9ressant.",
                "Nada de interessante acontece.");
        new GameText("You can't reach that.", "Da kommst du nicht hin.", "Vous ne pouvez pas l'atteindre.",
                "Voc\u00ea n\u00e3o consegue alcan\u00e7ar isso.");
        new GameText("Invalid teleport!", "Unzul\u00e4ssiger Teleport!", "T\u00e9l\u00e9portation non valide !", "Teleporte inv\u00e1lido!");
        new GameText("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.",
                "Vous devez vous connecter \u00e0 un serveur next'abonn\u00e9s pour aller \u00e0 cet endroit.",
                "Para entrar aqui, acesse um servidor para membros.");
        new GameText("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugef\u00fcgt werden, das System ist derzeit ausgelastet.",
                "Impossible next'ajouter un ami - syst\u00e8me occup\u00e9.",
                "N\u00e3o foi poss\u00edvel adicionar o amigo. O sistema est\u00e1 ocupado.");
        new GameText("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugef\u00fcgt werden - Spieler unbekannt.",
                "Impossible next'ajouter l'ami - joueur inconnu.", "N\u00e3o foi poss\u00edvel adicionar um amigo - jogador desconhecido.");
        new GameText("Unable to add name - system busy.", "Der Name konnte nicht hinzugef\u00fcgt werden, das System ist derzeit ausgelastet.",
                "Impossible next'ajouter un nom - syst\u00e8me occup\u00e9.",
                "N\u00e3o foi poss\u00edvel adicionar o nome. O sistema est\u00e1 ocupado.");
        new GameText("Unable to add name - unknown player.", "Name konnte nicht hinzugef\u00fcgt werden - Spieler unbekannt.",
                "Impossible next'ajouter le nom - joueur inconnu.", "N\u00e3o foi poss\u00edvel adicionar um nome - jogador desconhecido.");
        friendsListFullText = (new GameText("Your friends list is full, max of 200 for free users, and 200 for members.",
                "Ihre Freunde-Liste ist voll!",
                "Votre liste next'amis est pleine (200 noms maximum pour la version gratuite et 200 pour les abonn\u00e9s).",
                "Sua lista de amigos est\u00e1 cheia. O limite \u00e9 200 para usu\u00e1rios n\u00e3o pagantes, unlink 200 para membros."));
        friendsListFullTextGerman = (new GameText(null, "Mitglieder loginStream\u00f6nnen 200 Freunde hinzuf\u00fcgen, freie Spieler nur 200.",
                null, null));
        new GameText("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.",
                "Impossible de supprimer un ami - syst\u00e8me occup\u00e9.",
                "N\u00e3o foi poss\u00edvel excluir o amigo. O sistema est\u00e1 ocupado.");
        new GameText("Unable to delete name - system busy.", "Name konnte nicht gel\u00f6scht werden - Systemfehler.",
                "Impossible next'effacer le nom - syst\u00e8me occup\u00e9.", "N\u00e3o foi poss\u00edvel deletar o nome - sistema ocupado.");
        new GameText("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.",
                "Impossible next'envoyer un message - syst\u00e8me occup\u00e9.",
                "N\u00e3o foi poss\u00edvel enviar nullLoader mensagem. O sistema est\u00e1 ocupado.");
        new GameText("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,",
                "Impossible next'envoyer un message - joueur indisponible.",
                "N\u00e3o foi poss\u00edvel enviar nullLoader mensagem. O jogador n\u00e3o est\u00e1 dispon\u00edvel.");
        new GameText(null, "der Spieler ist momentan nicht verf\u00fcgbar.", null, null);
        new GameText("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,",
                "Impossible next'envoyer un message - joueur non inclus dans votre liste next'amis.",
                "N\u00e3o foi poss\u00edvel enviar nullLoader mensagem. O jogador n\u00e3o est\u00e1 na sua lista de amigos.");
        new GameText(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
        new GameText("You appear to be telling someone your password - please don't!",
                "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das",
                "Il semble que vous r\u00e9v\u00e9liez votre mot de passe \u00e0 quelqu'un - ne faites jamais \u00e7a !",
                "Parece que voc\u00ea est\u00e1 revelando sua senha nullLoader algu\u00e9m. N\u00e3o fa\u00e7a isso!");
        new GameText("If you are not, please change your password to something more obscure!",
                "nicht der Fall ist, \u00e4ndere dein Passwort zu einem ungew\u00f6hnlicheren Begriff!",
                "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins \u00e9vidente !",
                "Caso n\u00e3o esteja, altere sua senha para algo mais obscuro!");
        new GameText("For that rule you can only report players who have spoken or traded recently.",
                "Mit dieser Option loginStream\u00f6nnen nur Spieler gemeldet werden,",
                "Cette r\u00e8gle n'est invocable que pour les discussions ou \u00e9changes r\u00e9cents.",
                "Para essa regra, voc\u00ea s\u00f3 pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        new GameText(null, "die a\u00fcrzlich gesprochen oder gehandelt haben.", null, null);
        new GameText ("That player is offline, or has privacy mode enabled.",
                "Dieser Spieler ist offline oder hat den Privatsph\u00e4ren-Modus aktiviert.",
                "Ce joueur est next\u00e9connect\u00e9 ou en mode priv\u00e9.",
                "O jogador est\u00e1 offline ou est\u00e1 com o modo de privacidade ativado.");
        new GameText("You cannot send a quick chat message to a player on this world at this time.",
                "Einem Spieler auf dieser Welt a\u00f6nnen derzeit keine Direktchat-Nachrichten",
                "Impossible next'envoyer un message rapide \u00e0 un joueur de ce serveur \u00e0 l'heure actuelle.",
                "Voc\u00ea n\u00e3o pode enviar uma mensagem de papo r\u00e1pido para um jogador neste mundo neste momento.");
        new GameText(null, "geschickt werden.", null, null);
        new GameText("This player is on a quick chat world and cannot receive your message.",
                "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.",
                 "Ce joueur est sur un serveur \u00e0 messagerie rapide et ne peut pas recevoir votre message.",
                 "Este jogador n\u00e3o pode receber sua mensagem porque est\u00e1 em um mundo de papo r\u00e1pido.");
        new GameText("Chat disabled", "Deaktiviert", "Messagerie next\u00e9sactiv\u00e9e", "Bate-papo desativado");
        new GameText("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        new GameText("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.",
                 "Vous n'\u00eates pas dans un canal de clan.", "No momento voc\u00ea n\u00e3o est\u00e1 em um canal de cl\u00e3.");
        new GameText("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.",
                 "Vous n'\u00eates pas autoris\u00e9 \u00e0 parler dans ce canal de clan.",
                 "Voc\u00ea n\u00e3o tem permiss\u00e3o para conversar neste canal de cl\u00e3.");
        new GameText("Error sending message to clan chat - please try again later!",
                "Fehler beim Versenden der Nachricht - bitte versuch es sp\u00e4ter erneut.",
                "Erreur lors de l'envoi du message au canal de clan - veuillez r\u00e9essayer ult\u00e9rieurement.",
                "Erro ao enviar mensagem ao canal de cl\u00e3. Tente de novo depois!");
        new GameText("Please wait until you are logged out of your previous channel.",
                "Bitte warte, bis du den vorherigen Chatraum verlassen hast.",
                "Veuillez attendre next'\u00eatre next\u00e9connect\u00e9(unlink) de votre canal pr\u00e9c\u00e9dent.",
                "Aguarde at\u00e9 se desconectar do canal anterior.");
        new GameText("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.",
                "Vous n'\u00eates dans aucun canal \u00e0 l'heure actuelle.", "No momento voc\u00ea n\u00e3o est\u00e1 em um canal.");
        new GameText("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        new GameText("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...",
                "Enviando solicita\u00e7\u00e3o para deixar o canal...");
        new GameText("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.",
                "Tentative de connexion au canal next\u00e9j\u00e0 en cours - veuillez patienter...",
                "J\u00e1 h\u00e1 uma tentativa de entrar em um canal. Aguarde...");
        new GameText("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.",
                "Demande de sortie next\u00e9j\u00e0 effectu\u00e9e - veuillez patienter...",
                "Solicita\u00e7\u00e3o de sa\u00edda j\u00e1 em andamento. Aguarde...");
        new GameText("Invalid channel name entered!", "Ung\u00fcltiger Chatraum-Name angegeben.", "Nom de canal incorrect !",
                "Nome de canal inv\u00e1lido!");
        new GameText("Unable to join clan chat at this time - please try again later!",
                "Chatraum kann nicht betreten werden - bitte versuch es sp\u00e4ter erneut.",
                "Impossible de participer \u00e0 une discussion de clan pour le moment - veuillez r\u00e9essayer ult\u00e9rieurement.",
                "N\u00e3o foi poss\u00edvel entrar no bate-papo do cl\u00e3 dessa vez. Tente de novo depois!");
        new GameText("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ",
                "Falando no canal do cl\u00e3 agora ");
        new GameText("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ",
                "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do cl\u00e3 do jogador: ");
        new GameText("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.",
                "Pour parler, ins\u00e9rez le symbole / au next\u00e9but de chaque ligne.",
                "Para falar, comece cada linha de conversa com o s\u00edmbolo /.");
        new GameText("Error joining clan channel - please try again later!",
                "Fehler beim Betreten des Chatraums - bitte versuch es sp\u00e4ter erneut.",
                "Erreur lors de la connexion au canal de clan - veuillez r\u00e9essayer ult\u00e9rieurement.",
                "Erro ao entrar no canal do cl\u00e3. Tente de novo depois!");
        new GameText("You are temporarily blocked from joining channels - please try again later!",
                "Du darfst derzeit keine Chatr\u00e4ume betreten - bitte versuch es sp\u00e4ter.",
                "Vous \u00eates temporairement exclu des canaux - veuillez r\u00e9essayer ult\u00e9rieurement.",
                "Voc\u00ea est\u00e1 temporariamente impedido de entrar em canais. Tente de novo depois!");
        new GameText("The channel you tried to join does not exist.", "Der von dir gew\u00fcnschte Chatraum existiert nicht.",
                "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que voc\u00ea tentou acessar n\u00e3o existe.");
        new GameText("The channel you tried to join is currently full.", "Der von dir gew\u00fcnschte Chatraum ist derzeit \u00fcberf\u00fcllt.",
                "Le canal que vous essayez de rejoindre est plein.", "O canal que voc\u00ea tentou acessar est\u00e1 cheio no momento.");
        new GameText("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.",
                "Votre rang n'est pas assez \u00e9lev\u00e9 pour rejoindre ce canal de clan.",
                "Sua posi\u00e7\u00e3o n\u00e3o \u00e9 alta o suficiente para voc\u00ea entrar nesse canal de cl\u00e3.");
        new GameText("You are temporarily banned from this clan channel.", "Du wurdest tempor\u00e4r aus diesem Chatraum verbannt.",
                "Vous \u00eates temporairement exclu de ce canal de clan.",
                "Voc\u00ea est\u00e1 temporariamente vetado de entrar nesse canal de cl\u00e3.");
        new GameText("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.",
                "Vous n'\u00eates pas autoris\u00e9 \u00e0 rejoindre le canal de clan de cet utilisateur.",
                "Voc\u00ea n\u00e3o tem permiss\u00e3o para entrar no canal de cl\u00e3 desse usu\u00e1rio.");
        new GameText(" joined the channel.", " hat den Chatraum betreten.", " nullLoader rejoint le canal.", " entrou no canal.");
        new GameText(" left the channel.", " hat den Chatraum verlassen.", " nullLoader quitt\u00e9 le canal.", " deixou o canal.");
        new GameText(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " nullLoader \u00e9t\u00e9 expuls\u00e9 du canal.",
                " foi expulso do canal.");
        new GameText("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.",
                "Vous avez \u00e9t\u00e9 expuls\u00e9 du canal.", "Voc\u00ea foi expulso do canal.");
        new GameText("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.",
                "Vous avez \u00e9t\u00e9 supprim\u00e9 de ce canal.", "Voc\u00ea foi retirado desse canal.");
        new GameText("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitt\u00e9 le canal.", "Voc\u00ea saiu do canal.");
        new GameText("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activ\u00e9 !",
                "Seu canal de cl\u00e3 j\u00e1 est\u00e1 ativado!");
        new GameText("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ",
                "Pour rejoindre votre canal, cliquez sur \u00ab Participer \u00bb et entrez : ",
                "Para entrar no seu canal, clique em \"Acessar bate-papo\" unlink digite: ");
        new GameText("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.",
                "Votre canal de clan est next\u00e9sactiv\u00e9.", "Seu canal de cl\u00e3 foi desativado!");
        new GameText("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.",
                "Vous n'\u00eates pas autoris\u00e9 \u00e0 expulser des utilisateurs de ce canal.",
                "Voc\u00ea n\u00e3o tem permiss\u00e3o para expulsar usu\u00e1rios neste canal.");
        new GameText("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.",
                "Vous n'\u00eates pas autoris\u00e9 \u00e0 expulser cet utilisateur.",
                "Voc\u00ea n\u00e3o tem permiss\u00e3o para expulsar este usu\u00e1rio.");
        new GameText("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.",
                "Cet utilisateur n'est pas dans ce canal.", "Esse usu\u00e1rio n\u00e3o est\u00e1 no canal.");
        new GameText("You have been temporarily muted due to breaking a rule.",
                "Aufgrund eines Regelversto\u00dfes wurdest du vor\u00fcbergehend stumm geschaltet.",
                "La messagerie instantan\u00e9e nullLoader \u00e9t\u00e9 temporairement bloqu\u00e9e suite \u00e0 une infraction.",
                "Voc\u00ea foi temporariamente vetado por ter violado uma regra.");
        new GameText("This mute will remain for a further ", "Diese Stummschaltung gilt outgoingPacket2\u00fcr weitere ",
                "Votre acc\u00e8s restera bloqu\u00e9 encore ", "Este veto permanecer\u00e1 por mais ");
        new GameText(" days.", " Tage.", " jours.", " dias.");
        new GameText("You will be un-muted within 24 hours.", "Du wirst innerhalb der n\u00e4chsten 24 Stunden wieder sprechen loginStream\u00f6nnen.",
                "Vous aurez \u00e0 nouveau acc\u00e8s \u00e0 la messagerie instantan\u00e9e dans 24 heures.",
                "O veto ser\u00e1 retirado dentro de 24 horas.");
        new GameText("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.",
                "Pour \u00e9viter un nouveau blocage, lisez le r\u00e8glement.", "Para evitar outros vetos, leia as regras.");
        new GameText("You have been permanently muted due to breaking a rule.",
                "Du wurdest permanent stumm geschaltet, da du gegen eine Regel versto\u00dfen hast.",
                "incomingPacket107'acc\u00e8s \u00e0 la messagerie instantan\u00e9e vous nullLoader next\u00e9finitivement \u00e9t\u00e9 retir\u00e9 suite \u00e0 une infraction.",
                "Voc\u00ea foi permanentemente vetado por ter violado uma regra.");
        loadingPleaseWait = new GameText("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.",
                "Carregando. Aguarde.");
        profiling = new GameText("Profiling...", "Profiling...", "Profilage...", "Profiling...");
        connectionLostText = new GameText("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conex\u00e3o perdida.");
        pleaseWait_attemptingToReestablish = (new GameText("Please wait - attempting to reestablish.",
                "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de r\u00e9tablissement.",
                "Tentando reestabelecer conex\u00e3o. Aguarde."));
        checkingForUpdates = new GameText("Checking for updates - ", "Suche nach Updates - ", "V\u00e9rification des mises \u00e0 jour - ",
                "Verificando atualiza\u00e7\u00f5es - ");
        fetchingUpdates = new GameText("Fetching Updates - ", "Lade Update - ", "Chargement des MAJ - ", "Carregando atualiza\u00e7\u00f5es - ");
        new GameText("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");
        new GameText("Loaded config", "Konfig geladen.", "Fichiers config charg\u00e9s", "Config carregada");
        new GameText("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");
        new GameText("Loaded sprites", "Sprites geladen.", "Sprites charg\u00e9s", "Sprites carregados");
        new GameText("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");
        new GameText("Loaded wordpack", "Wordpack geladen.", "Module texte charg\u00e9", "Pacote de palavras carregado");
        new GameText("Loading interfaces - ", "Lade Benutzeroberfl\u00e4che - ", "Chargement des interfaces - ", "Carregando interfaces - ");
        new GameText("Loaded interfaces", "Benutzeroberfl\u00e4che geladen.", "Interfaces charg\u00e9es", "Interfaces carregadas");
        new GameText("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");
        new GameText("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces charg\u00e9es", "Interfaces carregadas");
        new GameText("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ",
                "Carregando fontes principais - ");
        new GameText("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires charg\u00e9es",
                "Fontes principais carregadas");
        new GameText("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-m\u00fandi - ");
        new GameText("Loaded world map", "Weltkarte geladen", "Mappemonde charg\u00e9e", "Mapa-m\u00fandi carregado");
        new GameText("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
        new GameText("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs charg\u00e9e", "Dados da lista de mundos carregados");
        new GameText("Loaded client variable data", "Client-Variablen geladen", "Variables du client charg\u00e9es",
                "As vari\u00e1veis do sistema foram carregadas");
        loadingText = new GameText("Loading...", "Lade...", "Chargement en cours...", "Carregando...");
        new GameText("Please close the interface you have open before using 'Report Abuse'.",
                "Bitte schlie\u00df die momentan ge\u00f6ffnete Benutzeroberfl\u00e4che,",
                "Fermez l'interface que vous avez ouverte avant next'utiliser le bouton \u00ab Signaler un abus \u00bb.",
                "Feche nullLoader interface aberta antes de usar o recurso \"Denunciar abuso\".");
        new GameText(null, "bevor du die Option 'Regelversto\u00df melden' benutzt.", null, null);
        new GameText("System update in: ", "System-Update in: ", "Mise \u00e0 jour syst\u00e8me dans : ", "Atualiza\u00e7\u00e3o do sistema em: ");
        _hasLoggedIn = new GameText(" has logged in.", " loggt sich ein.", " s'est connect\u00e9.", " entrou no jogo.");
        _hasLoggedOut = new GameText(" has logged out.", " loggt sich aus.", " s'est next\u00e9connect\u00e9.", " saiu do jogo.");
        unableToFind_ = new GameText("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ",
                "N\u00e3o \u00e9 poss\u00edvel encontrar ");
        new GameText("Use", "Benutzen", "Utiliser", "Usar");
        examineText = new GameText("Examine", "Untersuchen", "Examiner", "Examinar");
        attackText = new GameText("Attack", "Angreifen", "Attaquer", "Atacar");
        chooseOptionText = new GameText("Choose Option", "W\u00e4hl eine Option", "Choisir une option", "Selecionar op\u00e7\u00e3o");
        _moreOptionsText = new GameText(" more options", " weitere Optionen", " autres options", " mais op\u00e7\u00f5es");
        walkHereText = new GameText("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para nullLoader\u00e1");
        faceHereText = new GameText("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para nullLoader\u00e1");
        levelText = new GameText("level: ", "Stufe: ", "niveau ", "n\u00edvel: ");
        skillText = new GameText("skill: ", "Fertigkeit: ", "comp\u00e9tence ", "habilidade: ");
        ratingText = new GameText("rating: ", "Kampfstufe: ", "classement ", "qualifica\u00e7\u00e3o: ");
        pleaseWaitText = new GameText("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");
        new GameText("Close", "Bitte schlie\u00df die momentan ge\u00f6ffnete Benutzeroberfl\u00e4che,",
                "Fermez l'interface que vous avez ouverte avant next'utiliser le bouton \u00ab Signaler un abus \u00bb.",
                "Feche nullLoader interface aberta antes de usar o recurso \"Denunciar abuso\".");
        space = new GameText(" ", ": ", " ", " ");
        millionMoneyLetter_ = new GameText("M", "M", "M", "M");
        millionMoneyLetter = new GameText("M", "M", "M", "M");
        thousandMoneyLetter_ = new GameText("K", "T", "K", "K");
        thousandMoneyLetter = new GameText("K", "T", "K", "K");
        new GameText("From", "Von:", "De", "De");
        selfText = new GameText("Self", "Mich", "Moi", "Eu");
        _alreadyOnFriendsList = new GameText(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!",
                " est next\u00e9j\u00e0 dans votre liste next'amis.", " j\u00e1 est\u00e1 na sua lista de amigos.");
        ignoreListIsFull = (new GameText("Your ignore list is full. Max of 100 users.",
                "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).",
                "Sua lista de ignorados est\u00e1 cheia. O limite \u00e9 100 usu\u00e1rios."));
        _alreadyOnIgnoreList = new GameText(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!",
                " est next\u00e9j\u00e0 dans votre liste noire.", " j\u00e1 est\u00e1 na sua lista de ignorados.");
        cannotAddYourselfToFriendsList = (new GameText("You can't add yourself to your own friends list.",
                "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom \u00e0 votre liste next'amis.",
                "Voc\u00ea n\u00e3o pode adicionar nullLoader si pr\u00f3prio \u00e0 sua lista de amigos."));
        cannotAddYourselfToIngoreList = (new GameText("You can't add yourself to your own ignore list.",
                "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom \u00e0 votre liste noire.",
                 "Voc\u00ea n\u00e3o pode adicionar nullLoader si pr\u00f3prio \u00e0 sua lista de ignorados."));
        new GameText("Changes will take effect on your clan in the next 60 seconds.",
                "Die \u00c4nderungen am Chatraum werden innerhalb von 60 Sekunden specialOutPacket15\u00fcltig.",
                "Les modifications seront apport\u00e9es \u00e0 votre clan dans les prochaines 60 secondes.",
                "As altera\u00e7\u00f5es passar\u00e3o nullLoader valer no seu cl\u00e3 nos pr\u00f3ximos 60 segundos.");
        pleaseRemove_ = new GameText("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");
        _fromYourIngoreListFirst = new GameText(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.",
                " da sua lista de ignorados primeiro.");
        pleaseRemove_1 = new GameText("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");
        fromYourFriendsListFirst = new GameText(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste next'amis.",
                " da sua lista de amigos primeiro.");
        yellowTextEffect = new GameText("yellow:", "gelb:", "jaune:", "amarelo:");
        redTextEffect = new GameText("red:", "rot:", "rouge:", "vermelho:");
        greenTextEffect = new GameText("green:", "gr\u00fcn:", "vert:", "verde:");
        cyanTextEffect = new GameText("cyan:", "blaugr\u00fcn:", "cyan:", "cyan:");
        purpleTextEffect = new GameText("purple:", "lila:", "violet:", "roxo:");
        whiteTextEffect = new GameText("white:", "weiss:", "blanc:", "branco:");
        flash1TextEffect = new GameText("flash1:", "blinken1:", "clignotant1:", "flash1:");
        flash2TextEffect = new GameText("flash2:", "blinken2:", "clignotant2:", "flash2:");
        flash3TextEffect = new GameText("flash3:", "blinken3:", "clignotant3:", "brilho3:");
        glow1TextEffect = new GameText("glow1:", "leuchten1:", "brillant1:", "brilho1:");
        glow2TextEffect = new GameText("glow2:", "leuchten2:", "brillant2:", "brilho2:");
        glow3TextEffect = new GameText("glow3:", "leuchten3:", "brillant3:", "brilho3:");
        waveTextEffect = new GameText("wave:", "welle:", "ondulation:", "onda:");
        wave2TextEffect = new GameText("wave2:", "welle2:", "ondulation2:", "onda2:");
        shakeTextEffect = new GameText("shake:", "sch\u00fctteln:", "tremblement:", "tremor:");
        scrollTextEffect = new GameText("scroll:", "scrollen:", "next\u00e9roulement:", "rolagem:");
        slideTextEffect = new GameText("slide:", "gleiten:", "glissement:", "deslizamento:");
    }
}
