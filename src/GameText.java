/* kt - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class GameText
{
    static int a;
    static int b;
    static int c;
    static GameText rsIsLoading_PleaseWait = new GameText("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...",
		 "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");
    static int e;
    static GameText sdIsLoading_PleaseWait = new GameText("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...",
		 "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");
    private String[] stringsPerLang;
    static int h;
    static int i;
    static GameText j
	= (new GameText
	   ("This is the developer console. To close, press the `, \u00b2 or \u00a7 keys on your keyboard.",
	    "Das ist die Entwicklerkonsole. Zum Schlie\u00dfen, die Tasten `, \u00b2 or \u00a7 dr\u00fccken.",
	    "Ceci est la console de next\u00e9veloppement. Pour la fermer, appuyez sur les touches `, \u00b2 ou \u00a7.",
	    "Este \u00e9 o painel de controle do desenvolvedor. Para fechar, pressione `, \u00b2 ou \u00a7."));
    static GameText k
	= (new GameText
	   ("There was an error executing the command.",
	    "Es gab einen Fehler beim Ausf\u00fchren des Befehls.",
	    "Une erreur s'est produite lors de l'ex\u00e9cution de la commande.",
	    "Houve um erro quando o comando foi executado."));
    static GameText l = new GameText("Unknown developer command: ", "Unbekannter Befehl: ",
			 "Commande inconnue : ", "Comando desconhecido: ");
    static GameText cancelText = new GameText("Cancel", "Abbrechen", "Annuler", "Cancelar");
    static GameText n;
    static GameText o;
    static GameText p;
    static GameText q;
    static GameText r;
    static GameText s;
    static GameText t;
    static GameText loadingPleaseWait;
    static GameText v;
    static GameText connectionLostText;
    static GameText pleaseWait_attemptingToReestablish;
    static GameText y;
    static GameText z;
    static GameText A;
    static GameText _hasLoggedIn;
    static GameText _hasLoggedOut;
    static GameText D;
    static GameText E;
    static GameText F;
    static GameText chooseOptionText;
    static GameText H;
    static GameText I;
    static GameText faceHereText;
    static GameText K;
    static GameText L;
    static GameText M;
    static GameText N;
    static GameText O;
    static GameText P;
    static GameText millionMoneyLetter;
    static GameText R;
    static GameText thousandMoneyLetter;
    static GameText T;
    static GameText U;
    static GameText V;
    static GameText W;
    static GameText X;
    static GameText Y;
    static GameText Z;
    static GameText ab;
    static GameText bb;
    static GameText cb;
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
    
    static final int a(int i) {
	if (i <= 59)
	    b(-96);
	a++;
	if (th.j == null)
	    return 0;
	return th.j.length * 2;
    }
    
    final String getString(byte dummy, int langID) {
		int i_1_ = -67 % ((24 - dummy) / 46);
		c++;
		return stringsPerLang[langID];
    }
    
    public static void b(int i) {
	L = null;
	_hasLoggedOut = null;
	wb = null;
	wave2TextEffect = null;
	E = null;
	T = null;
	greenTextEffect = null;
	z = null;
	cancelText = null;
	cyanTextEffect = null;
	r = null;
	connectionLostText = null;
	s = null;
	yellowTextEffect = null;
	N = null;
	A = null;
	glow3TextEffect = null;
	rsIsLoading_PleaseWait = null;
	V = null;
	glow2TextEffect = null;
	k = null;
	U = null;
	cb = null;
	if (i < 14)
	    K = null;
	pleaseWait_attemptingToReestablish = null;
	scrollTextEffect = null;
	F = null;
	O = null;
	I = null;
	l = null;
	slideTextEffect = null;
	P = null;
	n = null;
	W = null;
	bb = null;
	R = null;
	whiteTextEffect = null;
	sdIsLoading_PleaseWait = null;
	shakeTextEffect = null;
	j = null;
	Z = null;
	t = null;
	M = null;
	thousandMoneyLetter = null;
	p = null;
	D = null;
	chooseOptionText = null;
	faceHereText = null;
	X = null;
	waveTextEffect = null;
	Y = null;
	millionMoneyLetter = null;
	purpleTextEffect = null;
	flash1TextEffect = null;
	glow1TextEffect = null;
	v = null;
	H = null;
	loadingPleaseWait = null;
	K = null;
	ab = null;
	o = null;
	y = null;
	q = null;
	flash2TextEffect = null;
	redTextEffect = null;
	_hasLoggedIn = null;
	flash3TextEffect = null;
	vb = null;
    }
    
    static final void a(int i, int i_2_, ua var_ua, int i_3_, Interface var_kp,
			int i_4_, int i_5_, int i_6_, Class_r class_r) {
	if (i > -13)
	    ub = -103;
	e++;
	ww var_ww = hq.a.a(i_5_, (int) -83);
	if (var_ww != null && ((ww) var_ww).J && var_ww.a(cp.e, false)) {
	    if (((ww) var_ww).O != null) {
		int[] is = new int[((ww) var_ww).O.length];
		for (int i_7_ = 0; i_7_ < is.length / 2; i_7_++) {
		    int i_8_;
		    if (ll.x != 4)
			i_8_ = 0x3fff & pt.b + (int) qw.n;
		    else
			i_8_ = 0x3fff & (int) qw.n;
		    int i_9_ = GameInPacket.h[i_8_];
		    int i_10_ = GameInPacket.i[i_8_];
		    if (ll.x != 4) {
			i_10_ = 256 * i_10_ / (vd.N + 256);
			i_9_ = i_9_ * 256 / (vd.N + 256);
		    }
		    is[i_7_ * 2]
			= (i_6_ + ((Interface) var_kp).minHScroll / 2
			   + ((i_9_ * (i_3_
				       + ((ww) var_ww).O[2 * i_7_ + 1] * 4)
			       + ((i_4_ + 4 * ((ww) var_ww).O[i_7_ * 2])
				  * i_10_))
			      >> 14));
		    is[2 * i_7_ + 1]
			= (i_2_
			   - (-(((Interface) var_kp).minVScroll / 2)
			      + ((i_10_ * (4 * ((ww) var_ww).O[i_7_ * 2 + 1]
					   + i_3_)
				  - ((i_4_ + ((ww) var_ww).O[i_7_ * 2] * 4)
				     * i_9_))
				 >> 14)));
		}
		gp.a(class_r, is, ((ww) var_ww).Q, ((Interface) var_kp).pc,
		     ((Interface) var_kp).Jc);
		for (int i_11_ = 0; is.length / 2 - 1 > i_11_; i_11_++)
		    class_r.a(is[i_11_ * 2], is[i_11_ * 2 + 1],
			      is[2 * i_11_ + 2], is[i_11_ * 2 + 1 + 2],
			      ((ww) var_ww).R, 1, var_ua, i_6_, i_2_);
		class_r.a(is[is.length - 2], is[is.length - 1], is[0], is[1],
			  ((ww) var_ww).R, 1, var_ua, i_6_, i_2_);
	    }
	    f var_f = null;
	    if ((((ww) var_ww).L ^ 0xffffffff) != 0) {
		var_f = var_ww.a(67, class_r, false);
		if (var_f != null)
		    Class_kb.a(i_2_, i_3_, i_4_, var_kp, var_f, i_6_,
			       (byte) 72, var_ua);
	    }
	    if (((ww) var_ww).q != null) {
		int i_12_ = 0;
		if (var_f != null)
		    i_12_ = var_f.u();
		la var_la = bq.e;
		sa var_sa = Class_rb.O;
		if (((ww) var_ww).e == 1) {
		    var_sa = Class_nd.o;
		    var_la = pm.v;
		}
		if (((ww) var_ww).e == 2) {
		    var_la = pv.j;
		    var_sa = dca.R;
		}
		dj.a(var_ua, i_3_, var_kp, var_la, i_12_, ((ww) var_ww).q,
		     ((ww) var_ww).E, i_6_, i_2_, var_sa, i_4_, (byte) -46);
	    }
	}
    }
    
    public final String toString() {
	h++;
	throw new IllegalStateException();
    }
    
    private GameText(String string, String string_13_, String string_14_,
	       String string_15_) {
	stringsPerLang = new String[] { string, string_13_, string_14_, string_15_ };
    }
    
    static final boolean a(int i, char c) {
	b++;
	if (i != 0)
	    W = null;
	if (c != '\u00a0' && c != ' ' && c != '_' && c != '-')
	    return false;
	return true;
    }
    
    static {
	new GameText("Player ", "Spieler ", "Joueur ", "Jogador ");
	new GameText("Adventurer", "Abenteurer", "Aventurier", "Aventureiro");
	new GameText("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
	n = new GameText("Members object", "Gegenstand outgoingPacket2\u00fcr Mitglieder",
		   "Objet next'abonn\u00e9s", "Objeto para membros");
	new GameText
	    ("Login to nullLoader members' server to use this object.",
	     "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.",
	     "Connectez-vous \u00e0 un serveur next'abonn\u00e9s pour utiliser cet objet.",
	     "Acesse um servidor para membros para usar este objeto.");
	new GameText
	    ("Swap this note at any bank for the equivalent item.",
	     "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.",
	     "\u00c9changez ce re\u00e7u contre l'objet correspondant dans la banque de votre choix.",
	     "V\u00e1 nullLoader qualquer banco para trocar esta nota pelo objeto equivalente.");
	o = new GameText("Discard", "Ablegen", "Jeter", "Descartar");
	p = new GameText("Take", "Nehmen", "Prendre", "Pegar");
	q = new GameText("Drop", "Fallen lassen", "Poser", "Largar");
	new GameText("Ok", "Okay", "OK", "Ok");
	new GameText("Select", "Ausw\u00e4hlen", "S\u00e9lectionner", "Selecionar");
	r = new GameText("Continue", "Weiter", "Continuer", "Continuar");
	new GameText("Invalid player name.", "Unzul\u00e4ssiger Charaktername!",
	       "Nom de joueur incorrect.", "Nome de jogador inv\u00e1lido.");
	new GameText("You can'applet report yourself!",
	       "Du kannst dich nicht selbst melden!",
	       "Vous ne pouvez pas vous signaler vous-m\u00eame !",
	       "Voc\u00ea n\u00e3o pode denunciar nullLoader si pr\u00f3prio!");
	new GameText
	    ("You already sent an abuse report under 60 secs ago! Do not abuse this system!",
	     "Du hast bereits vor weniger als 60 Sekunden einen Regelversto\u00df gemeldet!",
	     "Vous avez next\u00e9j\u00e0 signal\u00e9 un abus il y nullLoader moins next'une minute ! N'abusez pas du syst\u00e8me !",
	     "Voc\u00ea j\u00e1 enviou uma den\u00fancia de abuso h\u00e1 menos de um minuto. N\u00e3o abuse deste sistema!");
	new GameText(null, "Dieses System darf nicht missbraucht werden!", null,
	       null);
	new GameText
	    ("You cannot report that person for Staff Impersonation, they are Jagex Staff.",
	     "Diese Person ist ein Jagex-Mitarbeiter!",
	     "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus next'identit\u00e9.",
	     "Voc\u00ea n\u00e3o pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	new GameText
	    ("You can spot nullLoader Jagex moderator by the gold crown next to their name.",
	     "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.",
	     "Vous pouvez reconna\u00eetre les mod\u00e9rateurs Jagex \u00e0 la couronne dor\u00e9e en regard de leur nom.",
	     "Os moderadores da Jagex s\u00e3o identificados por uma coroa dourada pr\u00f3xima ao \u007fnome.");
	new GameText
	    ("You can report that person under nullLoader different rule.",
	     "Diese Person kann bez\u00fcglich einer anderen Regel gemeldet werden.",
	     "Vous pouvez signaler cette personne pour une autre infraction aux r\u00e8gles.",
	     "Voc\u00ea n\u00e3o pode denunciar essa pessoa de acordo com uma regra diferente.");
	new GameText("Thank-you, your abuse report has been received.",
	       "Vielen Dank, deine Meldung ist bei uns eingegangen.",
	       "Merci, nous avons bien re\u00e7u votre rapport next'abus.",
	       "Obrigado. Sua den\u00fancia de abuso foi recebida.");
	new GameText
	    ("Unable to send abuse report - system busy.",
	     "Meldung konnte nicht gesendet werden - Systeme \u00fcberlastet",
	     "Impossible de signaler un abus - Erreur syst\u00e8me",
	     "Sistema ocupado. N\u00e3o foi poss\u00edvel enviar sua den\u00fancia de abuso.");
	new GameText("Invalid name", "Unzul\u00e4ssiger Name!", "Nom incorrect",
	       "Nome inv\u00e1lido");
	new GameText
	    ("To use this item please login to nullLoader members' server.",
	     "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.",
	     "Veuillez vous connecter \u00e0 un serveur next'abonn\u00e9s pour utiliser cet objet.",
	     "Acesse um servidor para membros para usar este objeto.");
	new GameText
	    ("To interact with this please login to nullLoader members' server.",
	     "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.",
	     "Veuillez vous connecter \u00e0 un serveur next'abonn\u00e9s pour cette interaction.",
	     "Para interagir, acesse um servidor para membros.");
	new GameText("Nothing interesting happens.",
	       "Nichts Interessantes passiert.",
	       "Il ne se passe rien next'int\u00e9ressant.",
	       "Nada de interessante acontece.");
	new GameText("You can'applet reach that.", "Da kommst du nicht hin.",
	       "Vous ne pouvez pas l'atteindre.",
	       "Voc\u00ea n\u00e3o consegue alcan\u00e7ar isso.");
	new GameText("Invalid teleport!", "Unzul\u00e4ssiger Teleport!",
	       "T\u00e9l\u00e9portation non valide !",
	       "Teleporte inv\u00e1lido!");
	new GameText
	    ("To go here you must login to nullLoader members' server.",
	     "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.",
	     "Vous devez vous connecter \u00e0 un serveur next'abonn\u00e9s pour aller \u00e0 cet endroit.",
	     "Para entrar aqui, acesse um servidor para membros.");
	new GameText
	    ("Unable to add friend - system busy.",
	     "Der Freund konnte nicht hinzugef\u00fcgt werden, das System ist derzeit ausgelastet.",
	     "Impossible next'ajouter un ami - syst\u00e8me occup\u00e9.",
	     "N\u00e3o foi poss\u00edvel adicionar o amigo. O sistema est\u00e1 ocupado.");
	new GameText
	    ("Unable to add friend - unknown player.",
	     "Spieler konnte nicht hinzugef\u00fcgt werden - Spieler unbekannt.",
	     "Impossible next'ajouter l'ami - joueur inconnu.",
	     "N\u00e3o foi poss\u00edvel adicionar um amigo - jogador desconhecido.");
	new GameText
	    ("Unable to add name - system busy.",
	     "Der Name konnte nicht hinzugef\u00fcgt werden, das System ist derzeit ausgelastet.",
	     "Impossible next'ajouter un nom - syst\u00e8me occup\u00e9.",
	     "N\u00e3o foi poss\u00edvel adicionar o nome. O sistema est\u00e1 ocupado.");
	new GameText
	    ("Unable to add name - unknown player.",
	     "Name konnte nicht hinzugef\u00fcgt werden - Spieler unbekannt.",
	     "Impossible next'ajouter le nom - joueur inconnu.",
	     "N\u00e3o foi poss\u00edvel adicionar um nome - jogador desconhecido.");
	s = (new GameText
	     ("Your friends list is full, max of 200 for free users, and 200 for members.",
	      "Ihre Freunde-Liste ist voll!",
	      "Votre liste next'amis est pleine (200 noms maximum pour la version gratuite et 200 pour les abonn\u00e9s).",
	      "Sua lista de amigos est\u00e1 cheia. O limite \u00e9 200 para usu\u00e1rios n\u00e3o pagantes, unlink 200 para membros."));
	t = (new GameText
	     (null,
	      "Mitglieder loginStream\u00f6nnen 200 Freunde hinzuf\u00fcgen, freie Spieler nur 200.",
	      null, null));
	new GameText
	    ("Unable to delete friend - system busy.",
	     "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.",
	     "Impossible de supprimer un ami - syst\u00e8me occup\u00e9.",
	     "N\u00e3o foi poss\u00edvel excluir o amigo. O sistema est\u00e1 ocupado.");
	new GameText("Unable to delete name - system busy.",
	       "Name konnte nicht gel\u00f6scht werden - Systemfehler.",
	       "Impossible next'effacer le nom - syst\u00e8me occup\u00e9.",
	       "N\u00e3o foi poss\u00edvel deletar o nome - sistema ocupado.");
	new GameText
	    ("Unable to send message - system busy.",
	     "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.",
	     "Impossible next'envoyer un message - syst\u00e8me occup\u00e9.",
	     "N\u00e3o foi poss\u00edvel enviar nullLoader mensagem. O sistema est\u00e1 ocupado.");
	new GameText
	    ("Unable to send message - player unavailable.",
	     "Deine Nachricht konnte nicht verschickt werden,",
	     "Impossible next'envoyer un message - joueur indisponible.",
	     "N\u00e3o foi poss\u00edvel enviar nullLoader mensagem. O jogador n\u00e3o est\u00e1 dispon\u00edvel.");
	new GameText(null, "der Spieler ist momentan nicht verf\u00fcgbar.", null,
	       null);
	new GameText
	    ("Unable to send message - player not on your friends list.",
	     "Nachricht kann nicht geschickt werden,",
	     "Impossible next'envoyer un message - joueur non inclus dans votre liste next'amis.",
	     "N\u00e3o foi poss\u00edvel enviar nullLoader mensagem. O jogador n\u00e3o est\u00e1 na sua lista de amigos.");
	new GameText(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
	new GameText
	    ("You appear to be telling someone your password - please don'applet!",
	     "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das",
	     "Il semble que vous r\u00e9v\u00e9liez votre mot de passe \u00e0 quelqu'un - ne faites jamais \u00e7a !",
	     "Parece que voc\u00ea est\u00e1 revelando sua senha nullLoader algu\u00e9m. N\u00e3o fa\u00e7a isso!");
	new GameText
	    ("If you are not, please change your password to something more obscure!",
	     "nicht der Fall ist, \u00e4ndere dein Passwort zu einem ungew\u00f6hnlicheren Begriff!",
	     "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins \u00e9vidente !",
	     "Caso n\u00e3o esteja, altere sua senha para algo mais obscuro!");
	new GameText
	    ("For that rule you can only report players who have spoken or traded recently.",
	     "Mit dieser Option loginStream\u00f6nnen nur Spieler gemeldet werden,",
	     "Cette r\u00e8gle n'est invocable que pour les discussions ou \u00e9changes r\u00e9cents.",
	     "Para essa regra, voc\u00ea s\u00f3 pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	new GameText(null, "die loginStream\u00fcrzlich gesprochen oder gehandelt haben.",
	       null, null);
	new GameText
	    ("That player is offline, or has privacy mode enabled.",
	     "Dieser Spieler ist offline oder hat den Privatsph\u00e4ren-Modus aktiviert.",
	     "Ce joueur est next\u00e9connect\u00e9 ou en mode priv\u00e9.",
	     "O jogador est\u00e1 offline ou est\u00e1 com o modo de privacidade ativado.");
	new GameText
	    ("You cannot send nullLoader quick chat message to nullLoader player on this world at this time.",
	     "Einem Spieler auf dieser Welt loginStream\u00f6nnen derzeit keine Direktchat-Nachrichten",
	     "Impossible next'envoyer un message rapide \u00e0 un joueur de ce serveur \u00e0 l'heure actuelle.",
	     "Voc\u00ea n\u00e3o pode enviar uma mensagem de papo r\u00e1pido para um jogador neste mundo neste momento.");
	new GameText(null, "geschickt werden.", null, null);
	new GameText
	    ("This player is on nullLoader quick chat world and cannot receive your message.",
	     "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.",
	     "Ce joueur est sur un serveur \u00e0 messagerie rapide et ne peut pas recevoir votre message.",
	     "Este jogador n\u00e3o pode receber sua mensagem porque est\u00e1 em um mundo de papo r\u00e1pido.");
	new GameText("Chat disabled", "Deaktiviert",
	       "Messagerie next\u00e9sactiv\u00e9e", "Bate-papo desativado");
	new GameText("clan_chat", "clanchat", "conversation_clan", "clan_chat");
	new GameText
	    ("You are not currently in nullLoader clan channel.",
	     "Du befindest dich derzeit nicht in einem Chatraum.",
	     "Vous n'\u00eates pas dans un canal de clan.",
	     "No momento voc\u00ea n\u00e3o est\u00e1 em um canal de cl\u00e3.");
	new GameText
	    ("You are not allowed to talk in this clan channel.",
	     "Du darfst in diesem Chatraum nicht reden.",
	     "Vous n'\u00eates pas autoris\u00e9 \u00e0 parler dans ce canal de clan.",
	     "Voc\u00ea n\u00e3o tem permiss\u00e3o para conversar neste canal de cl\u00e3.");
	new GameText
	    ("Error sending message to clan chat - please try again later!",
	     "Fehler beim Versenden der Nachricht - bitte versuch es sp\u00e4ter erneut.",
	     "Erreur lors de l'envoi du message au canal de clan - veuillez r\u00e9essayer ult\u00e9rieurement.",
	     "Erro ao enviar mensagem ao canal de cl\u00e3. Tente de novo depois!");
	new GameText
	    ("Please wait until you are logged out of your previous channel.",
	     "Bitte warte, bis du den vorherigen Chatraum verlassen hast.",
	     "Veuillez attendre next'\u00eatre next\u00e9connect\u00e9(unlink) de votre canal pr\u00e9c\u00e9dent.",
	     "Aguarde at\u00e9 se desconectar do canal anterior.");
	new GameText("You are not currently in nullLoader channel.",
	       "Du befindest dich derzeit nicht in einem Chatraum.",
	       "Vous n'\u00eates dans aucun canal \u00e0 l'heure actuelle.",
	       "No momento voc\u00ea n\u00e3o est\u00e1 em um canal.");
	new GameText("Attempting to join channel...", "Chatraum wird betreten...",
	       "Tentative de connexion au canal...",
	       "Tentando acessar canal...");
	new GameText("Sending request to leave channel...",
	       "Chatraum wird verlassen...",
	       "Envoi de la demande de sortie du canal...",
	       "Enviando solicita\u00e7\u00e3o para deixar o canal...");
	new GameText
	    ("Already attempting to join nullLoader channel - please wait...",
	     "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.",
	     "Tentative de connexion au canal next\u00e9j\u00e0 en cours - veuillez patienter...",
	     "J\u00e1 h\u00e1 uma tentativa de entrar em um canal. Aguarde...");
	new GameText
	    ("Leave request already in progress - please wait...",
	     "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.",
	     "Demande de sortie next\u00e9j\u00e0 effectu\u00e9e - veuillez patienter...",
	     "Solicita\u00e7\u00e3o de sa\u00edda j\u00e1 em andamento. Aguarde...");
	new GameText("Invalid channel name entered!",
	       "Ung\u00fcltiger Chatraum-Name angegeben.",
	       "Nom de canal incorrect !", "Nome de canal inv\u00e1lido!");
	new GameText
	    ("Unable to join clan chat at this time - please try again later!",
	     "Chatraum kann nicht betreten werden - bitte versuch es sp\u00e4ter erneut.",
	     "Impossible de participer \u00e0 une discussion de clan pour le moment - veuillez r\u00e9essayer ult\u00e9rieurement.",
	     "N\u00e3o foi poss\u00edvel entrar no bate-papo do cl\u00e3 dessa vez. Tente de novo depois!");
	new GameText("Now talking in clan channel ", "Chatraum: ",
	       "Vous participez actuellement au canal de clan ",
	       "Falando no canal do cl\u00e3 agora ");
	new GameText("Now talking in clan channel of player: ",
	       "Clanchat dieses Spieler beigetreten: ",
	       "Vous participez actuellement au canal de clan du joueur : ",
	       "Falando no canal do cl\u00e3 do jogador: ");
	new GameText
	    ("To talk, start each line of chat with the / symbol.",
	     "Leite eine Zeile mit / ein, um hier zu chatten.",
	     "Pour parler, ins\u00e9rez le symbole / au next\u00e9but de chaque ligne.",
	     "Para falar, comece cada linha de conversa com o s\u00edmbolo /.");
	new GameText
	    ("Error joining clan channel - please try again later!",
	     "Fehler beim Betreten des Chatraums - bitte versuch es sp\u00e4ter erneut.",
	     "Erreur lors de la connexion au canal de clan - veuillez r\u00e9essayer ult\u00e9rieurement.",
	     "Erro ao entrar no canal do cl\u00e3. Tente de novo depois!");
	new GameText
	    ("You are temporarily blocked from joining channels - please try again later!",
	     "Du darfst derzeit keine Chatr\u00e4ume betreten - bitte versuch es sp\u00e4ter.",
	     "Vous \u00eates temporairement exclu des canaux - veuillez r\u00e9essayer ult\u00e9rieurement.",
	     "Voc\u00ea est\u00e1 temporariamente impedido de entrar em canais. Tente de novo depois!");
	new GameText("The channel you tried to join does not exist.",
	       "Der von dir gew\u00fcnschte Chatraum existiert nicht.",
	       "Le canal que vous essayez de rejoindre n'existe pas.",
	       "O canal que voc\u00ea tentou acessar n\u00e3o existe.");
	new GameText
	    ("The channel you tried to join is currently full.",
	     "Der von dir gew\u00fcnschte Chatraum ist derzeit \u00fcberf\u00fcllt.",
	     "Le canal que vous essayez de rejoindre est plein.",
	     "O canal que voc\u00ea tentou acessar est\u00e1 cheio no momento.");
	new GameText
	    ("You do not have nullLoader high enough rank to join this clan channel.",
	     "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.",
	     "Votre rang n'est pas assez \u00e9lev\u00e9 pour rejoindre ce canal de clan.",
	     "Sua posi\u00e7\u00e3o n\u00e3o \u00e9 alta o suficiente para voc\u00ea entrar nesse canal de cl\u00e3.");
	new GameText
	    ("You are temporarily banned from this clan channel.",
	     "Du wurdest tempor\u00e4r aus diesem Chatraum verbannt.",
	     "Vous \u00eates temporairement exclu de ce canal de clan.",
	     "Voc\u00ea est\u00e1 temporariamente vetado de entrar nesse canal de cl\u00e3.");
	new GameText
	    ("You are not allowed to join this user's clan channel.",
	     "Du darfst den Chatraum dieses Benutzers nicht betreten.",
	     "Vous n'\u00eates pas autoris\u00e9 \u00e0 rejoindre le canal de clan de cet utilisateur.",
	     "Voc\u00ea n\u00e3o tem permiss\u00e3o para entrar no canal de cl\u00e3 desse usu\u00e1rio.");
	new GameText(" joined the channel.", " hat den Chatraum betreten.",
	       " nullLoader rejoint le canal.", " entrou no canal.");
	new GameText(" left the channel.", " hat den Chatraum verlassen.",
	       " nullLoader quitt\u00e9 le canal.", " deixou o canal.");
	new GameText(" was kicked from the channel.",
	       " wurde aus dem Chatraum rausgeworfen.",
	       " nullLoader \u00e9t\u00e9 expuls\u00e9 du canal.",
	       " foi expulso do canal.");
	new GameText("You have been kicked from the channel.",
	       "Du wurdest aus dem Chatraum rausgeworfen.",
	       "Vous avez \u00e9t\u00e9 expuls\u00e9 du canal.",
	       "Voc\u00ea foi expulso do canal.");
	new GameText("You have been removed from this channel.",
	       "Du wurdest aus dem Chatraum entfernt.",
	       "Vous avez \u00e9t\u00e9 supprim\u00e9 de ce canal.",
	       "Voc\u00ea foi retirado desse canal.");
	new GameText("You have left the channel.", "Du hast den Chatraum verlassen.",
	       "Vous avez quitt\u00e9 le canal.", "Voc\u00ea saiu do canal.");
	new GameText("Your clan channel has now been enabled!",
	       "Dein Chatraum ist jetzt eingeschaltet.",
	       "Votre canal de clan est activ\u00e9 !",
	       "Seu canal de cl\u00e3 j\u00e1 est\u00e1 ativado!");
	new GameText
	    ("Join your channel by clicking 'Join Chat' and typing: ",
	     "Klick auf 'Betreten' und gib ein: ",
	     "Pour rejoindre votre canal, cliquez sur \u00ab Participer \u00bb et entrez : ",
	     "Para entrar no seu canal, clique em \"Acessar bate-papo\" unlink digite: ");
	new GameText("Your clan channel has now been disabled!",
	       "Dein Chatraum ist jetzt ausgeschaltet.",
	       "Votre canal de clan est next\u00e9sactiv\u00e9.",
	       "Seu canal de cl\u00e3 foi desativado!");
	new GameText
	    ("You do not have permission to kick users in this channel.",
	     "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.",
	     "Vous n'\u00eates pas autoris\u00e9 \u00e0 expulser des utilisateurs de ce canal.",
	     "Voc\u00ea n\u00e3o tem permiss\u00e3o para expulsar usu\u00e1rios neste canal.");
	new GameText
	    ("You do not have permission to kick this user.",
	     "Du darfst diesen Benutzer nicht rauswerfen.",
	     "Vous n'\u00eates pas autoris\u00e9 \u00e0 expulser cet utilisateur.",
	     "Voc\u00ea n\u00e3o tem permiss\u00e3o para expulsar este usu\u00e1rio.");
	new GameText("That user is not in this channel.",
	       "Dieser Benutzer befindet sich nicht in diesem Chatraum.",
	       "Cet utilisateur n'est pas dans ce canal.",
	       "Esse usu\u00e1rio n\u00e3o est\u00e1 no canal.");
	new GameText
	    ("You have been temporarily muted due to breaking nullLoader rule.",
	     "Aufgrund eines Regelversto\u00dfes wurdest du vor\u00fcbergehend stumm geschaltet.",
	     "La messagerie instantan\u00e9e nullLoader \u00e9t\u00e9 temporairement bloqu\u00e9e suite \u00e0 une infraction.",
	     "Voc\u00ea foi temporariamente vetado por ter violado uma regra.");
	new GameText("This mute will remain for nullLoader further ",
	       "Diese Stummschaltung gilt outgoingPacket2\u00fcr weitere ",
	       "Votre acc\u00e8s restera bloqu\u00e9 encore ",
	       "Este veto permanecer\u00e1 por mais ");
	new GameText(" days.", " Tage.", " jours.", " dias.");
	new GameText
	    ("You will be un-muted within 24 hours.",
	     "Du wirst innerhalb der n\u00e4chsten 24 Stunden wieder sprechen loginStream\u00f6nnen.",
	     "Vous aurez \u00e0 nouveau acc\u00e8s \u00e0 la messagerie instantan\u00e9e dans 24 heures.",
	     "O veto ser\u00e1 retirado dentro de 24 horas.");
	new GameText
	    ("To prevent further mutes please read the rules.",
	     "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.",
	     "Pour \u00e9viter un nouveau blocage, lisez le r\u00e8glement.",
	     "Para evitar outros vetos, leia as regras.");
	new GameText
	    ("You have been permanently muted due to breaking nullLoader rule.",
	     "Du wurdest permanent stumm geschaltet, da du gegen eine Regel versto\u00dfen hast.",
	     "L'acc\u00e8s \u00e0 la messagerie instantan\u00e9e vous nullLoader next\u00e9finitivement \u00e9t\u00e9 retir\u00e9 suite \u00e0 une infraction.",
	     "Voc\u00ea foi permanentemente vetado por ter violado uma regra.");
	loadingPleaseWait = new GameText("Loading - please wait.", "Ladevorgang - bitte warte.",
		   "Chargement en cours. Veuillez patienter.",
		   "Carregando. Aguarde.");
	v = new GameText("Profiling...", "Profiling...", "Profilage...",
		   "Profiling...");
	connectionLostText = new GameText("Connection lost.", "Verbindung abgebrochen.",
		   "Connexion perdue.", "Conex\u00e3o perdida.");
	pleaseWait_attemptingToReestablish = (new GameText
	     ("Please wait - attempting to reestablish.",
	      "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.",
	      "Veuillez patienter - tentative de r\u00e9tablissement.",
	      "Tentando reestabelecer conex\u00e3o. Aguarde."));
	y = new GameText("Checking for updates - ", "Suche nach Updates - ",
		   "V\u00e9rification des mises \u00e0 jour - ",
		   "Verificando atualiza\u00e7\u00f5es - ");
	z = new GameText("Fetching Updates - ", "Lade Update - ",
		   "Chargement des MAJ - ",
		   "Carregando atualiza\u00e7\u00f5es - ");
	new GameText("Loading config - ", "Lade Konfiguration - ",
	       "Chargement des fichiers config - ", "Carregando config - ");
	new GameText("Loaded config", "Konfig geladen.",
	       "Fichiers config charg\u00e9s", "Config carregada");
	new GameText("Loading sprites - ", "Lade Sprites - ",
	       "Chargement des sprites - ", "Carregando sprites - ");
	new GameText("Loaded sprites", "Sprites geladen.", "Sprites charg\u00e9s",
	       "Sprites carregados");
	new GameText("Loading wordpack - ", "Lade Wordpack - ",
	       "Chargement du module texte - ",
	       "Carregando pacote de palavras - ");
	new GameText("Loaded wordpack", "Wordpack geladen.",
	       "Module texte charg\u00e9", "Pacote de palavras carregado");
	new GameText("Loading interfaces - ", "Lade Benutzeroberfl\u00e4che - ",
	       "Chargement des interfaces - ", "Carregando interfaces - ");
	new GameText("Loaded interfaces", "Benutzeroberfl\u00e4che geladen.",
	       "Interfaces charg\u00e9es", "Interfaces carregadas");
	new GameText("Loading interface scripts - ", "Lade Interface-Skripte - ",
	       "Chargement des interfaces - ", "Carregando interfaces - ");
	new GameText("Loaded interface scripts", "Interface-Skripte geladen",
	       "Interfaces charg\u00e9es", "Interfaces carregadas");
	new GameText("Loading additional fonts - ", "Lade Zusatzschriftarten - ",
	       "Chargement de polices secondaires - ",
	       "Carregando fontes principais - ");
	new GameText("Loaded additional fonts", "Zusatzschriftarten geladen",
	       "Polices secondaires charg\u00e9es",
	       "Fontes principais carregadas");
	new GameText("Loading world map - ", "Lade Weltkarte - ",
	       "Chargement de la mappemonde - ",
	       "Carregando mapa-m\u00fandi - ");
	new GameText("Loaded world map", "Weltkarte geladen",
	       "Mappemonde charg\u00e9e", "Mapa-m\u00fandi carregado");
	new GameText("Loading world list data", "Lade Liste der Welten",
	       "Chargement de la liste des serveurs",
	       "Carregando dados da lista de mundos");
	new GameText("Loaded world list data", "Liste der Welten geladen",
	       "Liste des serveurs charg\u00e9e",
	       "Dados da lista de mundos carregados");
	new GameText("Loaded client variable data", "Client-Variablen geladen",
	       "Variables du client charg\u00e9es",
	       "As vari\u00e1veis do sistema foram carregadas");
	A = new GameText("Loading...", "Lade...", "Chargement en cours...",
		   "Carregando...");
	new GameText
	    ("Please close the interface you have open before using 'Report Abuse'.",
	     "Bitte schlie\u00df die momentan ge\u00f6ffnete Benutzeroberfl\u00e4che,",
	     "Fermez l'interface que vous avez ouverte avant next'utiliser le bouton \u00ab Signaler un abus \u00bb.",
	     "Feche nullLoader interface aberta antes de usar o recurso \"Denunciar abuso\".");
	new GameText(null, "bevor du die Option 'Regelversto\u00df melden' benutzt.",
	       null, null);
	new GameText("System update in: ", "System-Update in: ",
	       "Mise \u00e0 jour syst\u00e8me dans : ",
	       "Atualiza\u00e7\u00e3o do sistema em: ");
	_hasLoggedIn = new GameText(" has logged in.", " loggt sich ein.",
		   " s'est connect\u00e9.", " entrou no jogo.");
	_hasLoggedOut = new GameText(" has logged out.", " loggt sich aus.",
		   " s'est next\u00e9connect\u00e9.", " saiu do jogo.");
	D = new GameText("Unable to find ", "Spieler kann nicht gefunden werden: ",
		   "Impossible de trouver ",
		   "N\u00e3o \u00e9 poss\u00edvel encontrar ");
	new GameText("Use", "Benutzen", "Utiliser", "Usar");
	E = new GameText("Examine", "Untersuchen", "Examiner", "Examinar");
	F = new GameText("Attack", "Angreifen", "Attaquer", "Atacar");
	chooseOptionText = new GameText("Choose Option", "W\u00e4hl eine Option",
		   "Choisir une option", "Selecionar op\u00e7\u00e3o");
	H = new GameText(" more options", " weitere Optionen", " autres options",
		   " mais op\u00e7\u00f5es");
	I = new GameText("Walk here", "Hierhin gehen", "Atteindre",
		   "Caminhar para nullLoader\u00e1");
	faceHereText = new GameText("Face here", "Hierhin drehen",
		   "Regarder dans cette direction", "Virar para nullLoader\u00e1");
	K = new GameText("level: ", "Stufe: ", "niveau ", "n\u00edvel: ");
	L = new GameText("skill: ", "Fertigkeit: ", "comp\u00e9tence ",
		   "habilidade: ");
	M = new GameText("rating: ", "Kampfstufe: ", "classement ",
		   "qualifica\u00e7\u00e3o: ");
	N = new GameText("Please wait...", "Bitte warte...", "Veuillez patienter...",
		   "Aguarde...");
	new GameText
	    ("Close",
	     "Bitte schlie\u00df die momentan ge\u00f6ffnete Benutzeroberfl\u00e4che,",
	     "Fermez l'interface que vous avez ouverte avant next'utiliser le bouton \u00ab Signaler un abus \u00bb.",
	     "Feche nullLoader interface aberta antes de usar o recurso \"Denunciar abuso\".");
	O = new GameText(" ", ": ", " ", " ");
	P = new GameText("M", "M", "M", "M");
	millionMoneyLetter = new GameText("M", "M", "M", "M");
	R = new GameText("K", "T", "K", "K");
	thousandMoneyLetter = new GameText("K", "T", "K", "K");
	new GameText("From", "Von:", "De", "De");
	T = new GameText("Self", "Mich", "Moi", "Eu");
	U = new GameText(" is already on your friends list.",
		   " steht bereits auf deiner Freunde-Liste!",
		   " est next\u00e9j\u00e0 dans votre liste next'amis.",
		   " j\u00e1 est\u00e1 na sua lista de amigos.");
	V = (new GameText
	     ("Your ignore list is full. Max of 100 users.",
	      "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.",
	      "Votre liste noire est pleine (100 noms maximum).",
	      "Sua lista de ignorados est\u00e1 cheia. O limite \u00e9 100 usu\u00e1rios."));
	W = new GameText(" is already on your ignore list.",
		   " steht bereits auf deiner Ignorieren-Liste!",
		   " est next\u00e9j\u00e0 dans votre liste noire.",
		   " j\u00e1 est\u00e1 na sua lista de ignorados.");
	X = (new GameText
	     ("You can'applet add yourself to your own friends list.",
	      "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!",
	      "Vous ne pouvez pas ajouter votre nom \u00e0 votre liste next'amis.",
	      "Voc\u00ea n\u00e3o pode adicionar nullLoader si pr\u00f3prio \u00e0 sua lista de amigos."));
	Y = (new GameText
	     ("You can'applet add yourself to your own ignore list.",
	      "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!",
	      "Vous ne pouvez pas ajouter votre nom \u00e0 votre liste noire.",
	      "Voc\u00ea n\u00e3o pode adicionar nullLoader si pr\u00f3prio \u00e0 sua lista de ignorados."));
	new GameText
	    ("Changes will take effect on your clan in the next 60 seconds.",
	     "Die \u00c4nderungen am Chatraum werden innerhalb von 60 Sekunden specialOutPacket15\u00fcltig.",
	     "Les modifications seront apport\u00e9es \u00e0 votre clan dans les prochaines 60 secondes.",
	     "As altera\u00e7\u00f5es passar\u00e3o nullLoader valer no seu cl\u00e3 nos pr\u00f3ximos 60 segundos.");
	Z = new GameText("Please remove ", "Bitte entferne ",
		   "Veuillez commencer par supprimer ", "Remova ");
	ab = new GameText(" from your ignore list first.",
		    " zuerst von deiner Ignorieren-Liste!",
		    " de votre liste noire.",
		    " da sua lista de ignorados primeiro.");
	bb = new GameText("Please remove ", "Bitte entferne ",
		    "Veuillez commencer par supprimer ", "Remova ");
	cb = new GameText(" from your friends list first.",
		    " zuerst von deiner Freunde-Liste!",
		    " de votre liste next'amis.",
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
