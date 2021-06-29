package hu.sze.aut.robotlabor.scene.description.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import hu.sze.aut.robotlabor.scene.description.services.SceneDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSceneDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'scene'", "'{'", "'}'", "'models'", "'externalmodel'", "'path'", "'placement'", "'sphere'", "'radius'", "'physicparameters'", "'material'", "'box'", "'width'", "'height'", "'depth'", "'cylinder'", "'floor'", "'wall'", "'position'", "'rotation'", "'x'", "'y'", "'z'", "'roll'", "'pitch'", "'yaw'", "'-'", "'.'", "'mass'", "'color'", "'red'", "'green'", "'blue'", "'alpha'", "'texture'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSceneDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSceneDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSceneDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSceneDsl.g"; }


    	private SceneDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(SceneDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRootElement"
    // InternalSceneDsl.g:53:1: entryRuleRootElement : ruleRootElement EOF ;
    public final void entryRuleRootElement() throws RecognitionException {
        try {
            // InternalSceneDsl.g:54:1: ( ruleRootElement EOF )
            // InternalSceneDsl.g:55:1: ruleRootElement EOF
            {
             before(grammarAccess.getRootElementRule()); 
            pushFollow(FOLLOW_1);
            ruleRootElement();

            state._fsp--;

             after(grammarAccess.getRootElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRootElement"


    // $ANTLR start "ruleRootElement"
    // InternalSceneDsl.g:62:1: ruleRootElement : ( ( rule__RootElement__Alternatives ) ) ;
    public final void ruleRootElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:66:2: ( ( ( rule__RootElement__Alternatives ) ) )
            // InternalSceneDsl.g:67:2: ( ( rule__RootElement__Alternatives ) )
            {
            // InternalSceneDsl.g:67:2: ( ( rule__RootElement__Alternatives ) )
            // InternalSceneDsl.g:68:3: ( rule__RootElement__Alternatives )
            {
             before(grammarAccess.getRootElementAccess().getAlternatives()); 
            // InternalSceneDsl.g:69:3: ( rule__RootElement__Alternatives )
            // InternalSceneDsl.g:69:4: rule__RootElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RootElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRootElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRootElement"


    // $ANTLR start "entryRuleModel"
    // InternalSceneDsl.g:78:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSceneDsl.g:79:1: ( ruleModel EOF )
            // InternalSceneDsl.g:80:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSceneDsl.g:87:1: ruleModel : ( ( rule__Model__Alternatives ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:91:2: ( ( ( rule__Model__Alternatives ) ) )
            // InternalSceneDsl.g:92:2: ( ( rule__Model__Alternatives ) )
            {
            // InternalSceneDsl.g:92:2: ( ( rule__Model__Alternatives ) )
            // InternalSceneDsl.g:93:3: ( rule__Model__Alternatives )
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // InternalSceneDsl.g:94:3: ( rule__Model__Alternatives )
            // InternalSceneDsl.g:94:4: rule__Model__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Model__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMaterial"
    // InternalSceneDsl.g:103:1: entryRuleMaterial : ruleMaterial EOF ;
    public final void entryRuleMaterial() throws RecognitionException {
        try {
            // InternalSceneDsl.g:104:1: ( ruleMaterial EOF )
            // InternalSceneDsl.g:105:1: ruleMaterial EOF
            {
             before(grammarAccess.getMaterialRule()); 
            pushFollow(FOLLOW_1);
            ruleMaterial();

            state._fsp--;

             after(grammarAccess.getMaterialRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMaterial"


    // $ANTLR start "ruleMaterial"
    // InternalSceneDsl.g:112:1: ruleMaterial : ( ( rule__Material__Alternatives ) ) ;
    public final void ruleMaterial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:116:2: ( ( ( rule__Material__Alternatives ) ) )
            // InternalSceneDsl.g:117:2: ( ( rule__Material__Alternatives ) )
            {
            // InternalSceneDsl.g:117:2: ( ( rule__Material__Alternatives ) )
            // InternalSceneDsl.g:118:3: ( rule__Material__Alternatives )
            {
             before(grammarAccess.getMaterialAccess().getAlternatives()); 
            // InternalSceneDsl.g:119:3: ( rule__Material__Alternatives )
            // InternalSceneDsl.g:119:4: rule__Material__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Material__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMaterialAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaterial"


    // $ANTLR start "entryRuleEString"
    // InternalSceneDsl.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSceneDsl.g:129:1: ( ruleEString EOF )
            // InternalSceneDsl.g:130:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSceneDsl.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSceneDsl.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSceneDsl.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalSceneDsl.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSceneDsl.g:144:3: ( rule__EString__Alternatives )
            // InternalSceneDsl.g:144:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleScene"
    // InternalSceneDsl.g:153:1: entryRuleScene : ruleScene EOF ;
    public final void entryRuleScene() throws RecognitionException {
        try {
            // InternalSceneDsl.g:154:1: ( ruleScene EOF )
            // InternalSceneDsl.g:155:1: ruleScene EOF
            {
             before(grammarAccess.getSceneRule()); 
            pushFollow(FOLLOW_1);
            ruleScene();

            state._fsp--;

             after(grammarAccess.getSceneRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScene"


    // $ANTLR start "ruleScene"
    // InternalSceneDsl.g:162:1: ruleScene : ( ( rule__Scene__Group__0 ) ) ;
    public final void ruleScene() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:166:2: ( ( ( rule__Scene__Group__0 ) ) )
            // InternalSceneDsl.g:167:2: ( ( rule__Scene__Group__0 ) )
            {
            // InternalSceneDsl.g:167:2: ( ( rule__Scene__Group__0 ) )
            // InternalSceneDsl.g:168:3: ( rule__Scene__Group__0 )
            {
             before(grammarAccess.getSceneAccess().getGroup()); 
            // InternalSceneDsl.g:169:3: ( rule__Scene__Group__0 )
            // InternalSceneDsl.g:169:4: rule__Scene__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Scene__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSceneAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScene"


    // $ANTLR start "entryRuleExternalModel"
    // InternalSceneDsl.g:178:1: entryRuleExternalModel : ruleExternalModel EOF ;
    public final void entryRuleExternalModel() throws RecognitionException {
        try {
            // InternalSceneDsl.g:179:1: ( ruleExternalModel EOF )
            // InternalSceneDsl.g:180:1: ruleExternalModel EOF
            {
             before(grammarAccess.getExternalModelRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalModel();

            state._fsp--;

             after(grammarAccess.getExternalModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExternalModel"


    // $ANTLR start "ruleExternalModel"
    // InternalSceneDsl.g:187:1: ruleExternalModel : ( ( rule__ExternalModel__Group__0 ) ) ;
    public final void ruleExternalModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:191:2: ( ( ( rule__ExternalModel__Group__0 ) ) )
            // InternalSceneDsl.g:192:2: ( ( rule__ExternalModel__Group__0 ) )
            {
            // InternalSceneDsl.g:192:2: ( ( rule__ExternalModel__Group__0 ) )
            // InternalSceneDsl.g:193:3: ( rule__ExternalModel__Group__0 )
            {
             before(grammarAccess.getExternalModelAccess().getGroup()); 
            // InternalSceneDsl.g:194:3: ( rule__ExternalModel__Group__0 )
            // InternalSceneDsl.g:194:4: rule__ExternalModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalModel"


    // $ANTLR start "entryRuleSphere"
    // InternalSceneDsl.g:203:1: entryRuleSphere : ruleSphere EOF ;
    public final void entryRuleSphere() throws RecognitionException {
        try {
            // InternalSceneDsl.g:204:1: ( ruleSphere EOF )
            // InternalSceneDsl.g:205:1: ruleSphere EOF
            {
             before(grammarAccess.getSphereRule()); 
            pushFollow(FOLLOW_1);
            ruleSphere();

            state._fsp--;

             after(grammarAccess.getSphereRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSphere"


    // $ANTLR start "ruleSphere"
    // InternalSceneDsl.g:212:1: ruleSphere : ( ( rule__Sphere__Group__0 ) ) ;
    public final void ruleSphere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:216:2: ( ( ( rule__Sphere__Group__0 ) ) )
            // InternalSceneDsl.g:217:2: ( ( rule__Sphere__Group__0 ) )
            {
            // InternalSceneDsl.g:217:2: ( ( rule__Sphere__Group__0 ) )
            // InternalSceneDsl.g:218:3: ( rule__Sphere__Group__0 )
            {
             before(grammarAccess.getSphereAccess().getGroup()); 
            // InternalSceneDsl.g:219:3: ( rule__Sphere__Group__0 )
            // InternalSceneDsl.g:219:4: rule__Sphere__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSphereAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSphere"


    // $ANTLR start "entryRuleBox"
    // InternalSceneDsl.g:228:1: entryRuleBox : ruleBox EOF ;
    public final void entryRuleBox() throws RecognitionException {
        try {
            // InternalSceneDsl.g:229:1: ( ruleBox EOF )
            // InternalSceneDsl.g:230:1: ruleBox EOF
            {
             before(grammarAccess.getBoxRule()); 
            pushFollow(FOLLOW_1);
            ruleBox();

            state._fsp--;

             after(grammarAccess.getBoxRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBox"


    // $ANTLR start "ruleBox"
    // InternalSceneDsl.g:237:1: ruleBox : ( ( rule__Box__Group__0 ) ) ;
    public final void ruleBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:241:2: ( ( ( rule__Box__Group__0 ) ) )
            // InternalSceneDsl.g:242:2: ( ( rule__Box__Group__0 ) )
            {
            // InternalSceneDsl.g:242:2: ( ( rule__Box__Group__0 ) )
            // InternalSceneDsl.g:243:3: ( rule__Box__Group__0 )
            {
             before(grammarAccess.getBoxAccess().getGroup()); 
            // InternalSceneDsl.g:244:3: ( rule__Box__Group__0 )
            // InternalSceneDsl.g:244:4: rule__Box__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBox"


    // $ANTLR start "entryRuleCylinder"
    // InternalSceneDsl.g:253:1: entryRuleCylinder : ruleCylinder EOF ;
    public final void entryRuleCylinder() throws RecognitionException {
        try {
            // InternalSceneDsl.g:254:1: ( ruleCylinder EOF )
            // InternalSceneDsl.g:255:1: ruleCylinder EOF
            {
             before(grammarAccess.getCylinderRule()); 
            pushFollow(FOLLOW_1);
            ruleCylinder();

            state._fsp--;

             after(grammarAccess.getCylinderRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCylinder"


    // $ANTLR start "ruleCylinder"
    // InternalSceneDsl.g:262:1: ruleCylinder : ( ( rule__Cylinder__Group__0 ) ) ;
    public final void ruleCylinder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:266:2: ( ( ( rule__Cylinder__Group__0 ) ) )
            // InternalSceneDsl.g:267:2: ( ( rule__Cylinder__Group__0 ) )
            {
            // InternalSceneDsl.g:267:2: ( ( rule__Cylinder__Group__0 ) )
            // InternalSceneDsl.g:268:3: ( rule__Cylinder__Group__0 )
            {
             before(grammarAccess.getCylinderAccess().getGroup()); 
            // InternalSceneDsl.g:269:3: ( rule__Cylinder__Group__0 )
            // InternalSceneDsl.g:269:4: rule__Cylinder__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCylinderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCylinder"


    // $ANTLR start "entryRuleFloor"
    // InternalSceneDsl.g:278:1: entryRuleFloor : ruleFloor EOF ;
    public final void entryRuleFloor() throws RecognitionException {
        try {
            // InternalSceneDsl.g:279:1: ( ruleFloor EOF )
            // InternalSceneDsl.g:280:1: ruleFloor EOF
            {
             before(grammarAccess.getFloorRule()); 
            pushFollow(FOLLOW_1);
            ruleFloor();

            state._fsp--;

             after(grammarAccess.getFloorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloor"


    // $ANTLR start "ruleFloor"
    // InternalSceneDsl.g:287:1: ruleFloor : ( ( rule__Floor__Group__0 ) ) ;
    public final void ruleFloor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:291:2: ( ( ( rule__Floor__Group__0 ) ) )
            // InternalSceneDsl.g:292:2: ( ( rule__Floor__Group__0 ) )
            {
            // InternalSceneDsl.g:292:2: ( ( rule__Floor__Group__0 ) )
            // InternalSceneDsl.g:293:3: ( rule__Floor__Group__0 )
            {
             before(grammarAccess.getFloorAccess().getGroup()); 
            // InternalSceneDsl.g:294:3: ( rule__Floor__Group__0 )
            // InternalSceneDsl.g:294:4: rule__Floor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Floor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloor"


    // $ANTLR start "entryRuleWallElement"
    // InternalSceneDsl.g:303:1: entryRuleWallElement : ruleWallElement EOF ;
    public final void entryRuleWallElement() throws RecognitionException {
        try {
            // InternalSceneDsl.g:304:1: ( ruleWallElement EOF )
            // InternalSceneDsl.g:305:1: ruleWallElement EOF
            {
             before(grammarAccess.getWallElementRule()); 
            pushFollow(FOLLOW_1);
            ruleWallElement();

            state._fsp--;

             after(grammarAccess.getWallElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWallElement"


    // $ANTLR start "ruleWallElement"
    // InternalSceneDsl.g:312:1: ruleWallElement : ( ( rule__WallElement__Group__0 ) ) ;
    public final void ruleWallElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:316:2: ( ( ( rule__WallElement__Group__0 ) ) )
            // InternalSceneDsl.g:317:2: ( ( rule__WallElement__Group__0 ) )
            {
            // InternalSceneDsl.g:317:2: ( ( rule__WallElement__Group__0 ) )
            // InternalSceneDsl.g:318:3: ( rule__WallElement__Group__0 )
            {
             before(grammarAccess.getWallElementAccess().getGroup()); 
            // InternalSceneDsl.g:319:3: ( rule__WallElement__Group__0 )
            // InternalSceneDsl.g:319:4: rule__WallElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WallElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWallElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWallElement"


    // $ANTLR start "entryRulePlacement"
    // InternalSceneDsl.g:328:1: entryRulePlacement : rulePlacement EOF ;
    public final void entryRulePlacement() throws RecognitionException {
        try {
            // InternalSceneDsl.g:329:1: ( rulePlacement EOF )
            // InternalSceneDsl.g:330:1: rulePlacement EOF
            {
             before(grammarAccess.getPlacementRule()); 
            pushFollow(FOLLOW_1);
            rulePlacement();

            state._fsp--;

             after(grammarAccess.getPlacementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlacement"


    // $ANTLR start "rulePlacement"
    // InternalSceneDsl.g:337:1: rulePlacement : ( ( rule__Placement__Group__0 ) ) ;
    public final void rulePlacement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:341:2: ( ( ( rule__Placement__Group__0 ) ) )
            // InternalSceneDsl.g:342:2: ( ( rule__Placement__Group__0 ) )
            {
            // InternalSceneDsl.g:342:2: ( ( rule__Placement__Group__0 ) )
            // InternalSceneDsl.g:343:3: ( rule__Placement__Group__0 )
            {
             before(grammarAccess.getPlacementAccess().getGroup()); 
            // InternalSceneDsl.g:344:3: ( rule__Placement__Group__0 )
            // InternalSceneDsl.g:344:4: rule__Placement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Placement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlacementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlacement"


    // $ANTLR start "entryRuleVec3"
    // InternalSceneDsl.g:353:1: entryRuleVec3 : ruleVec3 EOF ;
    public final void entryRuleVec3() throws RecognitionException {
        try {
            // InternalSceneDsl.g:354:1: ( ruleVec3 EOF )
            // InternalSceneDsl.g:355:1: ruleVec3 EOF
            {
             before(grammarAccess.getVec3Rule()); 
            pushFollow(FOLLOW_1);
            ruleVec3();

            state._fsp--;

             after(grammarAccess.getVec3Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVec3"


    // $ANTLR start "ruleVec3"
    // InternalSceneDsl.g:362:1: ruleVec3 : ( ( rule__Vec3__Group__0 ) ) ;
    public final void ruleVec3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:366:2: ( ( ( rule__Vec3__Group__0 ) ) )
            // InternalSceneDsl.g:367:2: ( ( rule__Vec3__Group__0 ) )
            {
            // InternalSceneDsl.g:367:2: ( ( rule__Vec3__Group__0 ) )
            // InternalSceneDsl.g:368:3: ( rule__Vec3__Group__0 )
            {
             before(grammarAccess.getVec3Access().getGroup()); 
            // InternalSceneDsl.g:369:3: ( rule__Vec3__Group__0 )
            // InternalSceneDsl.g:369:4: rule__Vec3__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Vec3__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVec3Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVec3"


    // $ANTLR start "entryRuleRotation"
    // InternalSceneDsl.g:378:1: entryRuleRotation : ruleRotation EOF ;
    public final void entryRuleRotation() throws RecognitionException {
        try {
            // InternalSceneDsl.g:379:1: ( ruleRotation EOF )
            // InternalSceneDsl.g:380:1: ruleRotation EOF
            {
             before(grammarAccess.getRotationRule()); 
            pushFollow(FOLLOW_1);
            ruleRotation();

            state._fsp--;

             after(grammarAccess.getRotationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRotation"


    // $ANTLR start "ruleRotation"
    // InternalSceneDsl.g:387:1: ruleRotation : ( ( rule__Rotation__Group__0 ) ) ;
    public final void ruleRotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:391:2: ( ( ( rule__Rotation__Group__0 ) ) )
            // InternalSceneDsl.g:392:2: ( ( rule__Rotation__Group__0 ) )
            {
            // InternalSceneDsl.g:392:2: ( ( rule__Rotation__Group__0 ) )
            // InternalSceneDsl.g:393:3: ( rule__Rotation__Group__0 )
            {
             before(grammarAccess.getRotationAccess().getGroup()); 
            // InternalSceneDsl.g:394:3: ( rule__Rotation__Group__0 )
            // InternalSceneDsl.g:394:4: rule__Rotation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRotation"


    // $ANTLR start "entryRuleEDouble"
    // InternalSceneDsl.g:403:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalSceneDsl.g:404:1: ( ruleEDouble EOF )
            // InternalSceneDsl.g:405:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalSceneDsl.g:412:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:416:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalSceneDsl.g:417:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalSceneDsl.g:417:2: ( ( rule__EDouble__Group__0 ) )
            // InternalSceneDsl.g:418:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalSceneDsl.g:419:3: ( rule__EDouble__Group__0 )
            // InternalSceneDsl.g:419:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRulePhysicParameters"
    // InternalSceneDsl.g:428:1: entryRulePhysicParameters : rulePhysicParameters EOF ;
    public final void entryRulePhysicParameters() throws RecognitionException {
        try {
            // InternalSceneDsl.g:429:1: ( rulePhysicParameters EOF )
            // InternalSceneDsl.g:430:1: rulePhysicParameters EOF
            {
             before(grammarAccess.getPhysicParametersRule()); 
            pushFollow(FOLLOW_1);
            rulePhysicParameters();

            state._fsp--;

             after(grammarAccess.getPhysicParametersRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePhysicParameters"


    // $ANTLR start "rulePhysicParameters"
    // InternalSceneDsl.g:437:1: rulePhysicParameters : ( ( rule__PhysicParameters__Group__0 ) ) ;
    public final void rulePhysicParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:441:2: ( ( ( rule__PhysicParameters__Group__0 ) ) )
            // InternalSceneDsl.g:442:2: ( ( rule__PhysicParameters__Group__0 ) )
            {
            // InternalSceneDsl.g:442:2: ( ( rule__PhysicParameters__Group__0 ) )
            // InternalSceneDsl.g:443:3: ( rule__PhysicParameters__Group__0 )
            {
             before(grammarAccess.getPhysicParametersAccess().getGroup()); 
            // InternalSceneDsl.g:444:3: ( rule__PhysicParameters__Group__0 )
            // InternalSceneDsl.g:444:4: rule__PhysicParameters__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PhysicParameters__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPhysicParametersAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePhysicParameters"


    // $ANTLR start "entryRuleColor"
    // InternalSceneDsl.g:453:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalSceneDsl.g:454:1: ( ruleColor EOF )
            // InternalSceneDsl.g:455:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalSceneDsl.g:462:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:466:2: ( ( ( rule__Color__Group__0 ) ) )
            // InternalSceneDsl.g:467:2: ( ( rule__Color__Group__0 ) )
            {
            // InternalSceneDsl.g:467:2: ( ( rule__Color__Group__0 ) )
            // InternalSceneDsl.g:468:3: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // InternalSceneDsl.g:469:3: ( rule__Color__Group__0 )
            // InternalSceneDsl.g:469:4: rule__Color__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleTexture"
    // InternalSceneDsl.g:478:1: entryRuleTexture : ruleTexture EOF ;
    public final void entryRuleTexture() throws RecognitionException {
        try {
            // InternalSceneDsl.g:479:1: ( ruleTexture EOF )
            // InternalSceneDsl.g:480:1: ruleTexture EOF
            {
             before(grammarAccess.getTextureRule()); 
            pushFollow(FOLLOW_1);
            ruleTexture();

            state._fsp--;

             after(grammarAccess.getTextureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTexture"


    // $ANTLR start "ruleTexture"
    // InternalSceneDsl.g:487:1: ruleTexture : ( ( rule__Texture__Group__0 ) ) ;
    public final void ruleTexture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:491:2: ( ( ( rule__Texture__Group__0 ) ) )
            // InternalSceneDsl.g:492:2: ( ( rule__Texture__Group__0 ) )
            {
            // InternalSceneDsl.g:492:2: ( ( rule__Texture__Group__0 ) )
            // InternalSceneDsl.g:493:3: ( rule__Texture__Group__0 )
            {
             before(grammarAccess.getTextureAccess().getGroup()); 
            // InternalSceneDsl.g:494:3: ( rule__Texture__Group__0 )
            // InternalSceneDsl.g:494:4: rule__Texture__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Texture__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTexture"


    // $ANTLR start "rule__RootElement__Alternatives"
    // InternalSceneDsl.g:502:1: rule__RootElement__Alternatives : ( ( ruleScene ) | ( ruleModel ) );
    public final void rule__RootElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:506:1: ( ( ruleScene ) | ( ruleModel ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            else if ( (LA1_0==17||LA1_0==20||LA1_0==24||(LA1_0>=28 && LA1_0<=30)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSceneDsl.g:507:2: ( ruleScene )
                    {
                    // InternalSceneDsl.g:507:2: ( ruleScene )
                    // InternalSceneDsl.g:508:3: ruleScene
                    {
                     before(grammarAccess.getRootElementAccess().getSceneParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleScene();

                    state._fsp--;

                     after(grammarAccess.getRootElementAccess().getSceneParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSceneDsl.g:513:2: ( ruleModel )
                    {
                    // InternalSceneDsl.g:513:2: ( ruleModel )
                    // InternalSceneDsl.g:514:3: ruleModel
                    {
                     before(grammarAccess.getRootElementAccess().getModelParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleModel();

                    state._fsp--;

                     after(grammarAccess.getRootElementAccess().getModelParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootElement__Alternatives"


    // $ANTLR start "rule__Model__Alternatives"
    // InternalSceneDsl.g:523:1: rule__Model__Alternatives : ( ( ruleExternalModel ) | ( ruleSphere ) | ( ruleBox ) | ( ruleCylinder ) | ( ruleFloor ) | ( ruleWallElement ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:527:1: ( ( ruleExternalModel ) | ( ruleSphere ) | ( ruleBox ) | ( ruleCylinder ) | ( ruleFloor ) | ( ruleWallElement ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            case 28:
                {
                alt2=4;
                }
                break;
            case 29:
                {
                alt2=5;
                }
                break;
            case 30:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSceneDsl.g:528:2: ( ruleExternalModel )
                    {
                    // InternalSceneDsl.g:528:2: ( ruleExternalModel )
                    // InternalSceneDsl.g:529:3: ruleExternalModel
                    {
                     before(grammarAccess.getModelAccess().getExternalModelParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalModel();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getExternalModelParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSceneDsl.g:534:2: ( ruleSphere )
                    {
                    // InternalSceneDsl.g:534:2: ( ruleSphere )
                    // InternalSceneDsl.g:535:3: ruleSphere
                    {
                     before(grammarAccess.getModelAccess().getSphereParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSphere();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getSphereParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSceneDsl.g:540:2: ( ruleBox )
                    {
                    // InternalSceneDsl.g:540:2: ( ruleBox )
                    // InternalSceneDsl.g:541:3: ruleBox
                    {
                     before(grammarAccess.getModelAccess().getBoxParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBox();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getBoxParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSceneDsl.g:546:2: ( ruleCylinder )
                    {
                    // InternalSceneDsl.g:546:2: ( ruleCylinder )
                    // InternalSceneDsl.g:547:3: ruleCylinder
                    {
                     before(grammarAccess.getModelAccess().getCylinderParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCylinder();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getCylinderParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSceneDsl.g:552:2: ( ruleFloor )
                    {
                    // InternalSceneDsl.g:552:2: ( ruleFloor )
                    // InternalSceneDsl.g:553:3: ruleFloor
                    {
                     before(grammarAccess.getModelAccess().getFloorParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleFloor();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getFloorParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSceneDsl.g:558:2: ( ruleWallElement )
                    {
                    // InternalSceneDsl.g:558:2: ( ruleWallElement )
                    // InternalSceneDsl.g:559:3: ruleWallElement
                    {
                     before(grammarAccess.getModelAccess().getWallElementParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleWallElement();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getWallElementParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__Material__Alternatives"
    // InternalSceneDsl.g:568:1: rule__Material__Alternatives : ( ( ruleColor ) | ( ruleTexture ) );
    public final void rule__Material__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:572:1: ( ( ruleColor ) | ( ruleTexture ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==42) ) {
                alt3=1;
            }
            else if ( (LA3_0==47) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSceneDsl.g:573:2: ( ruleColor )
                    {
                    // InternalSceneDsl.g:573:2: ( ruleColor )
                    // InternalSceneDsl.g:574:3: ruleColor
                    {
                     before(grammarAccess.getMaterialAccess().getColorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleColor();

                    state._fsp--;

                     after(grammarAccess.getMaterialAccess().getColorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSceneDsl.g:579:2: ( ruleTexture )
                    {
                    // InternalSceneDsl.g:579:2: ( ruleTexture )
                    // InternalSceneDsl.g:580:3: ruleTexture
                    {
                     before(grammarAccess.getMaterialAccess().getTextureParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTexture();

                    state._fsp--;

                     after(grammarAccess.getMaterialAccess().getTextureParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSceneDsl.g:589:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:593:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSceneDsl.g:594:2: ( RULE_STRING )
                    {
                    // InternalSceneDsl.g:594:2: ( RULE_STRING )
                    // InternalSceneDsl.g:595:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSceneDsl.g:600:2: ( RULE_ID )
                    {
                    // InternalSceneDsl.g:600:2: ( RULE_ID )
                    // InternalSceneDsl.g:601:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalSceneDsl.g:610:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:614:1: ( ( 'E' ) | ( 'e' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSceneDsl.g:615:2: ( 'E' )
                    {
                    // InternalSceneDsl.g:615:2: ( 'E' )
                    // InternalSceneDsl.g:616:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSceneDsl.g:621:2: ( 'e' )
                    {
                    // InternalSceneDsl.g:621:2: ( 'e' )
                    // InternalSceneDsl.g:622:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__Scene__Group__0"
    // InternalSceneDsl.g:631:1: rule__Scene__Group__0 : rule__Scene__Group__0__Impl rule__Scene__Group__1 ;
    public final void rule__Scene__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:635:1: ( rule__Scene__Group__0__Impl rule__Scene__Group__1 )
            // InternalSceneDsl.g:636:2: rule__Scene__Group__0__Impl rule__Scene__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Scene__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__0"


    // $ANTLR start "rule__Scene__Group__0__Impl"
    // InternalSceneDsl.g:643:1: rule__Scene__Group__0__Impl : ( () ) ;
    public final void rule__Scene__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:647:1: ( ( () ) )
            // InternalSceneDsl.g:648:1: ( () )
            {
            // InternalSceneDsl.g:648:1: ( () )
            // InternalSceneDsl.g:649:2: ()
            {
             before(grammarAccess.getSceneAccess().getSceneAction_0()); 
            // InternalSceneDsl.g:650:2: ()
            // InternalSceneDsl.g:650:3: 
            {
            }

             after(grammarAccess.getSceneAccess().getSceneAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__0__Impl"


    // $ANTLR start "rule__Scene__Group__1"
    // InternalSceneDsl.g:658:1: rule__Scene__Group__1 : rule__Scene__Group__1__Impl rule__Scene__Group__2 ;
    public final void rule__Scene__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:662:1: ( rule__Scene__Group__1__Impl rule__Scene__Group__2 )
            // InternalSceneDsl.g:663:2: rule__Scene__Group__1__Impl rule__Scene__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Scene__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__1"


    // $ANTLR start "rule__Scene__Group__1__Impl"
    // InternalSceneDsl.g:670:1: rule__Scene__Group__1__Impl : ( 'scene' ) ;
    public final void rule__Scene__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:674:1: ( ( 'scene' ) )
            // InternalSceneDsl.g:675:1: ( 'scene' )
            {
            // InternalSceneDsl.g:675:1: ( 'scene' )
            // InternalSceneDsl.g:676:2: 'scene'
            {
             before(grammarAccess.getSceneAccess().getSceneKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getSceneKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__1__Impl"


    // $ANTLR start "rule__Scene__Group__2"
    // InternalSceneDsl.g:685:1: rule__Scene__Group__2 : rule__Scene__Group__2__Impl rule__Scene__Group__3 ;
    public final void rule__Scene__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:689:1: ( rule__Scene__Group__2__Impl rule__Scene__Group__3 )
            // InternalSceneDsl.g:690:2: rule__Scene__Group__2__Impl rule__Scene__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Scene__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__2"


    // $ANTLR start "rule__Scene__Group__2__Impl"
    // InternalSceneDsl.g:697:1: rule__Scene__Group__2__Impl : ( ( rule__Scene__NameAssignment_2 ) ) ;
    public final void rule__Scene__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:701:1: ( ( ( rule__Scene__NameAssignment_2 ) ) )
            // InternalSceneDsl.g:702:1: ( ( rule__Scene__NameAssignment_2 ) )
            {
            // InternalSceneDsl.g:702:1: ( ( rule__Scene__NameAssignment_2 ) )
            // InternalSceneDsl.g:703:2: ( rule__Scene__NameAssignment_2 )
            {
             before(grammarAccess.getSceneAccess().getNameAssignment_2()); 
            // InternalSceneDsl.g:704:2: ( rule__Scene__NameAssignment_2 )
            // InternalSceneDsl.g:704:3: rule__Scene__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Scene__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSceneAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__2__Impl"


    // $ANTLR start "rule__Scene__Group__3"
    // InternalSceneDsl.g:712:1: rule__Scene__Group__3 : rule__Scene__Group__3__Impl rule__Scene__Group__4 ;
    public final void rule__Scene__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:716:1: ( rule__Scene__Group__3__Impl rule__Scene__Group__4 )
            // InternalSceneDsl.g:717:2: rule__Scene__Group__3__Impl rule__Scene__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Scene__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__3"


    // $ANTLR start "rule__Scene__Group__3__Impl"
    // InternalSceneDsl.g:724:1: rule__Scene__Group__3__Impl : ( '{' ) ;
    public final void rule__Scene__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:728:1: ( ( '{' ) )
            // InternalSceneDsl.g:729:1: ( '{' )
            {
            // InternalSceneDsl.g:729:1: ( '{' )
            // InternalSceneDsl.g:730:2: '{'
            {
             before(grammarAccess.getSceneAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__3__Impl"


    // $ANTLR start "rule__Scene__Group__4"
    // InternalSceneDsl.g:739:1: rule__Scene__Group__4 : rule__Scene__Group__4__Impl rule__Scene__Group__5 ;
    public final void rule__Scene__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:743:1: ( rule__Scene__Group__4__Impl rule__Scene__Group__5 )
            // InternalSceneDsl.g:744:2: rule__Scene__Group__4__Impl rule__Scene__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Scene__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__4"


    // $ANTLR start "rule__Scene__Group__4__Impl"
    // InternalSceneDsl.g:751:1: rule__Scene__Group__4__Impl : ( ( rule__Scene__Group_4__0 )? ) ;
    public final void rule__Scene__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:755:1: ( ( ( rule__Scene__Group_4__0 )? ) )
            // InternalSceneDsl.g:756:1: ( ( rule__Scene__Group_4__0 )? )
            {
            // InternalSceneDsl.g:756:1: ( ( rule__Scene__Group_4__0 )? )
            // InternalSceneDsl.g:757:2: ( rule__Scene__Group_4__0 )?
            {
             before(grammarAccess.getSceneAccess().getGroup_4()); 
            // InternalSceneDsl.g:758:2: ( rule__Scene__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSceneDsl.g:758:3: rule__Scene__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scene__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSceneAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__4__Impl"


    // $ANTLR start "rule__Scene__Group__5"
    // InternalSceneDsl.g:766:1: rule__Scene__Group__5 : rule__Scene__Group__5__Impl ;
    public final void rule__Scene__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:770:1: ( rule__Scene__Group__5__Impl )
            // InternalSceneDsl.g:771:2: rule__Scene__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scene__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__5"


    // $ANTLR start "rule__Scene__Group__5__Impl"
    // InternalSceneDsl.g:777:1: rule__Scene__Group__5__Impl : ( '}' ) ;
    public final void rule__Scene__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:781:1: ( ( '}' ) )
            // InternalSceneDsl.g:782:1: ( '}' )
            {
            // InternalSceneDsl.g:782:1: ( '}' )
            // InternalSceneDsl.g:783:2: '}'
            {
             before(grammarAccess.getSceneAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__5__Impl"


    // $ANTLR start "rule__Scene__Group_4__0"
    // InternalSceneDsl.g:793:1: rule__Scene__Group_4__0 : rule__Scene__Group_4__0__Impl rule__Scene__Group_4__1 ;
    public final void rule__Scene__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:797:1: ( rule__Scene__Group_4__0__Impl rule__Scene__Group_4__1 )
            // InternalSceneDsl.g:798:2: rule__Scene__Group_4__0__Impl rule__Scene__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Scene__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_4__0"


    // $ANTLR start "rule__Scene__Group_4__0__Impl"
    // InternalSceneDsl.g:805:1: rule__Scene__Group_4__0__Impl : ( 'models' ) ;
    public final void rule__Scene__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:809:1: ( ( 'models' ) )
            // InternalSceneDsl.g:810:1: ( 'models' )
            {
            // InternalSceneDsl.g:810:1: ( 'models' )
            // InternalSceneDsl.g:811:2: 'models'
            {
             before(grammarAccess.getSceneAccess().getModelsKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getModelsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_4__0__Impl"


    // $ANTLR start "rule__Scene__Group_4__1"
    // InternalSceneDsl.g:820:1: rule__Scene__Group_4__1 : rule__Scene__Group_4__1__Impl rule__Scene__Group_4__2 ;
    public final void rule__Scene__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:824:1: ( rule__Scene__Group_4__1__Impl rule__Scene__Group_4__2 )
            // InternalSceneDsl.g:825:2: rule__Scene__Group_4__1__Impl rule__Scene__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Scene__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_4__1"


    // $ANTLR start "rule__Scene__Group_4__1__Impl"
    // InternalSceneDsl.g:832:1: rule__Scene__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Scene__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:836:1: ( ( '{' ) )
            // InternalSceneDsl.g:837:1: ( '{' )
            {
            // InternalSceneDsl.g:837:1: ( '{' )
            // InternalSceneDsl.g:838:2: '{'
            {
             before(grammarAccess.getSceneAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_4__1__Impl"


    // $ANTLR start "rule__Scene__Group_4__2"
    // InternalSceneDsl.g:847:1: rule__Scene__Group_4__2 : rule__Scene__Group_4__2__Impl rule__Scene__Group_4__3 ;
    public final void rule__Scene__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:851:1: ( rule__Scene__Group_4__2__Impl rule__Scene__Group_4__3 )
            // InternalSceneDsl.g:852:2: rule__Scene__Group_4__2__Impl rule__Scene__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__Scene__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_4__2"


    // $ANTLR start "rule__Scene__Group_4__2__Impl"
    // InternalSceneDsl.g:859:1: rule__Scene__Group_4__2__Impl : ( ( rule__Scene__ModelAssignment_4_2 ) ) ;
    public final void rule__Scene__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:863:1: ( ( ( rule__Scene__ModelAssignment_4_2 ) ) )
            // InternalSceneDsl.g:864:1: ( ( rule__Scene__ModelAssignment_4_2 ) )
            {
            // InternalSceneDsl.g:864:1: ( ( rule__Scene__ModelAssignment_4_2 ) )
            // InternalSceneDsl.g:865:2: ( rule__Scene__ModelAssignment_4_2 )
            {
             before(grammarAccess.getSceneAccess().getModelAssignment_4_2()); 
            // InternalSceneDsl.g:866:2: ( rule__Scene__ModelAssignment_4_2 )
            // InternalSceneDsl.g:866:3: rule__Scene__ModelAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Scene__ModelAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getSceneAccess().getModelAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_4__2__Impl"


    // $ANTLR start "rule__Scene__Group_4__3"
    // InternalSceneDsl.g:874:1: rule__Scene__Group_4__3 : rule__Scene__Group_4__3__Impl rule__Scene__Group_4__4 ;
    public final void rule__Scene__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:878:1: ( rule__Scene__Group_4__3__Impl rule__Scene__Group_4__4 )
            // InternalSceneDsl.g:879:2: rule__Scene__Group_4__3__Impl rule__Scene__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__Scene__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_4__3"


    // $ANTLR start "rule__Scene__Group_4__3__Impl"
    // InternalSceneDsl.g:886:1: rule__Scene__Group_4__3__Impl : ( ( rule__Scene__ModelAssignment_4_3 )* ) ;
    public final void rule__Scene__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:890:1: ( ( ( rule__Scene__ModelAssignment_4_3 )* ) )
            // InternalSceneDsl.g:891:1: ( ( rule__Scene__ModelAssignment_4_3 )* )
            {
            // InternalSceneDsl.g:891:1: ( ( rule__Scene__ModelAssignment_4_3 )* )
            // InternalSceneDsl.g:892:2: ( rule__Scene__ModelAssignment_4_3 )*
            {
             before(grammarAccess.getSceneAccess().getModelAssignment_4_3()); 
            // InternalSceneDsl.g:893:2: ( rule__Scene__ModelAssignment_4_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17||LA7_0==20||LA7_0==24||(LA7_0>=28 && LA7_0<=30)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSceneDsl.g:893:3: rule__Scene__ModelAssignment_4_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Scene__ModelAssignment_4_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSceneAccess().getModelAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_4__3__Impl"


    // $ANTLR start "rule__Scene__Group_4__4"
    // InternalSceneDsl.g:901:1: rule__Scene__Group_4__4 : rule__Scene__Group_4__4__Impl ;
    public final void rule__Scene__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:905:1: ( rule__Scene__Group_4__4__Impl )
            // InternalSceneDsl.g:906:2: rule__Scene__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scene__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_4__4"


    // $ANTLR start "rule__Scene__Group_4__4__Impl"
    // InternalSceneDsl.g:912:1: rule__Scene__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Scene__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:916:1: ( ( '}' ) )
            // InternalSceneDsl.g:917:1: ( '}' )
            {
            // InternalSceneDsl.g:917:1: ( '}' )
            // InternalSceneDsl.g:918:2: '}'
            {
             before(grammarAccess.getSceneAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group_4__4__Impl"


    // $ANTLR start "rule__ExternalModel__Group__0"
    // InternalSceneDsl.g:928:1: rule__ExternalModel__Group__0 : rule__ExternalModel__Group__0__Impl rule__ExternalModel__Group__1 ;
    public final void rule__ExternalModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:932:1: ( rule__ExternalModel__Group__0__Impl rule__ExternalModel__Group__1 )
            // InternalSceneDsl.g:933:2: rule__ExternalModel__Group__0__Impl rule__ExternalModel__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ExternalModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModel__Group__0"


    // $ANTLR start "rule__ExternalModel__Group__0__Impl"
    // InternalSceneDsl.g:940:1: rule__ExternalModel__Group__0__Impl : ( () ) ;
    public final void rule__ExternalModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:944:1: ( ( () ) )
            // InternalSceneDsl.g:945:1: ( () )
            {
            // InternalSceneDsl.g:945:1: ( () )
            // InternalSceneDsl.g:946:2: ()
            {
             before(grammarAccess.getExternalModelAccess().getExternalModelAction_0()); 
            // InternalSceneDsl.g:947:2: ()
            // InternalSceneDsl.g:947:3: 
            {
            }

             after(grammarAccess.getExternalModelAccess().getExternalModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModel__Group__0__Impl"


    // $ANTLR start "rule__ExternalModel__Group__1"
    // InternalSceneDsl.g:955:1: rule__ExternalModel__Group__1 : rule__ExternalModel__Group__1__Impl rule__ExternalModel__Group__2 ;
    public final void rule__ExternalModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:959:1: ( rule__ExternalModel__Group__1__Impl rule__ExternalModel__Group__2 )
            // InternalSceneDsl.g:960:2: rule__ExternalModel__Group__1__Impl rule__ExternalModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ExternalModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModel__Group__1"


    // $ANTLR start "rule__ExternalModel__Group__1__Impl"
    // InternalSceneDsl.g:967:1: rule__ExternalModel__Group__1__Impl : ( 'externalmodel' ) ;
    public final void rule__ExternalModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:971:1: ( ( 'externalmodel' ) )
            // InternalSceneDsl.g:972:1: ( 'externalmodel' )
            {
            // InternalSceneDsl.g:972:1: ( 'externalmodel' )
            // InternalSceneDsl.g:973:2: 'externalmodel'
            {
             before(grammarAccess.getExternalModelAccess().getExternalmodelKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getExternalModelAccess().getExternalmodelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModel__Group__1__Impl"


    // $ANTLR start "rule__ExternalModel__Group__2"
    // InternalSceneDsl.g:982:1: rule__ExternalModel__Group__2 : rule__ExternalModel__Group__2__Impl rule__ExternalModel__Group__3 ;
    public final void rule__ExternalModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:986:1: ( rule__ExternalModel__Group__2__Impl rule__ExternalModel__Group__3 )
            // InternalSceneDsl.g:987:2: rule__ExternalModel__Group__2__Impl rule__ExternalModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ExternalModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModel__Group__2"


    // $ANTLR start "rule__ExternalModel__Group__2__Impl"
    // InternalSceneDsl.g:994:1: rule__ExternalModel__Group__2__Impl : ( ( rule__ExternalModel__NameAssignment_2 ) ) ;
    public final void rule__ExternalModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:998:1: ( ( ( rule__ExternalModel__NameAssignment_2 ) ) )
            // InternalSceneDsl.g:999:1: ( ( rule__ExternalModel__NameAssignment_2 ) )
            {
            // InternalSceneDsl.g:999:1: ( ( rule__ExternalModel__NameAssignment_2 ) )
            // InternalSceneDsl.g:1000:2: ( rule__ExternalModel__NameAssignment_2 )
            {
             before(grammarAccess.getExternalModelAccess().getNameAssignment_2()); 
            // InternalSceneDsl.g:1001:2: ( rule__ExternalModel__NameAssignment_2 )
            // InternalSceneDsl.g:1001:3: rule__ExternalModel__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExternalModel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExternalModelAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModel__Group__2__Impl"


    // $ANTLR start "rule__ExternalModel__Group__3"
    // InternalSceneDsl.g:1009:1: rule__ExternalModel__Group__3 : rule__ExternalModel__Group__3__Impl rule__ExternalModel__Group__4 ;
    public final void rule__ExternalModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1013:1: ( rule__ExternalModel__Group__3__Impl rule__ExternalModel__Group__4 )
            // InternalSceneDsl.g:1014:2: rule__ExternalModel__Group__3__Impl rule__ExternalModel__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__ExternalModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModel__Group__3"


    // $ANTLR start "rule__ExternalModel__Group__3__Impl"
    // InternalSceneDsl.g:1021:1: rule__ExternalModel__Group__3__Impl : ( '{' ) ;
    public final void rule__ExternalModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1025:1: ( ( '{' ) )
            // InternalSceneDsl.g:1026:1: ( '{' )
            {
            // InternalSceneDsl.g:1026:1: ( '{' )
            // InternalSceneDsl.g:1027:2: '{'
            {
             before(grammarAccess.getExternalModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExternalModelAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModel__Group__3__Impl"


    // $ANTLR start "rule__ExternalModel__Group__4"
    // InternalSceneDsl.g:1036:1: rule__ExternalModel__Group__4 : rule__ExternalModel__Group__4__Impl rule__ExternalModel__Group__5 ;
    public final void rule__ExternalModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1040:1: ( rule__ExternalModel__Group__4__Impl rule__ExternalModel__Group__5 )
            // InternalSceneDsl.g:1041:2: rule__ExternalModel__Group__4__Impl rule__ExternalModel__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__ExternalModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModel__Group__4"


    // $ANTLR start "rule__ExternalModel__Group__4__Impl"
    // InternalSceneDsl.g:1048:1: rule__ExternalModel__Group__4__Impl : ( ( rule__ExternalModel__Group_4__0 )? ) ;
    public final void rule__ExternalModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1052:1: ( ( ( rule__ExternalModel__Group_4__0 )? ) )
            // InternalSceneDsl.g:1053:1: ( ( rule__ExternalModel__Group_4__0 )? )
            {
            // InternalSceneDsl.g:1053:1: ( ( rule__ExternalModel__Group_4__0 )? )
            // InternalSceneDsl.g:1054:2: ( rule__ExternalModel__Group_4__0 )?
            {
             before(grammarAccess.getExternalModelAccess().getGroup_4()); 
            // InternalSceneDsl.g:1055:2: ( rule__ExternalModel__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSceneDsl.g:1055:3: rule__ExternalModel__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalModel__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalModelAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModel__Group__4__Impl"


    // $ANTLR start "rule__ExternalModel__Group__5"
    // InternalSceneDsl.g:1063:1: rule__ExternalModel__Group__5 : rule__ExternalModel__Group__5__Impl rule__ExternalModel__Group__6 ;
    public final void rule__ExternalModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1067:1: ( rule__ExternalModel__Group__5__Impl rule__ExternalModel__Group__6 )
            // InternalSceneDsl.g:1068:2: rule__ExternalModel__Group__5__Impl rule__ExternalModel__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__ExternalModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalModel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModel__Group__5"


    // $ANTLR start "rule__ExternalModel__Group__5__Impl"
    // InternalSceneDsl.g:1075:1: rule__ExternalModel__Group__5__Impl : ( ( rule__ExternalModel__Group_5__0 )? ) ;
    public final void rule__ExternalModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1079:1: ( ( ( rule__ExternalModel__Group_5__0 )? ) )
            // InternalSceneDsl.g:1080:1: ( ( rule__ExternalModel__Group_5__0 )? )
            {
            // InternalSceneDsl.g:1080:1: ( ( rule__ExternalModel__Group_5__0 )? )
            // InternalSceneDsl.g:1081:2: ( rule__ExternalModel__Group_5__0 )?
            {
             before(grammarAccess.getExternalModelAccess().getGroup_5()); 
            // InternalSceneDsl.g:1082:2: ( rule__ExternalModel__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSceneDsl.g:1082:3: rule__ExternalModel__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalModel__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalModelAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModel__Group__5__Impl"


    // $ANTLR start "rule__ExternalModel__Group__6"
    // InternalSceneDsl.g:1090:1: rule__ExternalModel__Group__6 : rule__ExternalModel__Group__6__Impl ;
    public final void rule__ExternalModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1094:1: ( rule__ExternalModel__Group__6__Impl )
            // InternalSceneDsl.g:1095:2: rule__ExternalModel__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalModel__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModel__Group__6"


    // $ANTLR start "rule__ExternalModel__Group__6__Impl"
    // InternalSceneDsl.g:1101:1: rule__ExternalModel__Group__6__Impl : ( '}' ) ;
    public final void rule__ExternalModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1105:1: ( ( '}' ) )
            // InternalSceneDsl.g:1106:1: ( '}' )
            {
            // InternalSceneDsl.g:1106:1: ( '}' )
            // InternalSceneDsl.g:1107:2: '}'
            {
             before(grammarAccess.getExternalModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getExternalModelAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModel__Group__6__Impl"


    // $ANTLR start "rule__ExternalModel__Group_4__0"
    // InternalSceneDsl.g:1117:1: rule__ExternalModel__Group_4__0 : rule__ExternalModel__Group_4__0__Impl rule__ExternalModel__Group_4__1 ;
    public final void rule__ExternalModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1121:1: ( rule__ExternalModel__Group_4__0__Impl rule__ExternalModel__Group_4__1 )
            // InternalSceneDsl.g:1122:2: rule__ExternalModel__Group_4__0__Impl rule__ExternalModel__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__ExternalModel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalModel__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModel__Group_4__0"


    // $ANTLR start "rule__ExternalModel__Group_4__0__Impl"
    // InternalSceneDsl.g:1129:1: rule__ExternalModel__Group_4__0__Impl : ( 'path' ) ;
    public final void rule__ExternalModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1133:1: ( ( 'path' ) )
            // InternalSceneDsl.g:1134:1: ( 'path' )
            {
            // InternalSceneDsl.g:1134:1: ( 'path' )
            // InternalSceneDsl.g:1135:2: 'path'
            {
             before(grammarAccess.getExternalModelAccess().getPathKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getExternalModelAccess().getPathKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModel__Group_4__0__Impl"


    // $ANTLR start "rule__ExternalModel__Group_4__1"
    // InternalSceneDsl.g:1144:1: rule__ExternalModel__Group_4__1 : rule__ExternalModel__Group_4__1__Impl ;
    public final void rule__ExternalModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1148:1: ( rule__ExternalModel__Group_4__1__Impl )
            // InternalSceneDsl.g:1149:2: rule__ExternalModel__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalModel__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModel__Group_4__1"


    // $ANTLR start "rule__ExternalModel__Group_4__1__Impl"
    // InternalSceneDsl.g:1155:1: rule__ExternalModel__Group_4__1__Impl : ( ( rule__ExternalModel__PathAssignment_4_1 ) ) ;
    public final void rule__ExternalModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1159:1: ( ( ( rule__ExternalModel__PathAssignment_4_1 ) ) )
            // InternalSceneDsl.g:1160:1: ( ( rule__ExternalModel__PathAssignment_4_1 ) )
            {
            // InternalSceneDsl.g:1160:1: ( ( rule__ExternalModel__PathAssignment_4_1 ) )
            // InternalSceneDsl.g:1161:2: ( rule__ExternalModel__PathAssignment_4_1 )
            {
             before(grammarAccess.getExternalModelAccess().getPathAssignment_4_1()); 
            // InternalSceneDsl.g:1162:2: ( rule__ExternalModel__PathAssignment_4_1 )
            // InternalSceneDsl.g:1162:3: rule__ExternalModel__PathAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalModel__PathAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalModelAccess().getPathAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModel__Group_4__1__Impl"


    // $ANTLR start "rule__ExternalModel__Group_5__0"
    // InternalSceneDsl.g:1171:1: rule__ExternalModel__Group_5__0 : rule__ExternalModel__Group_5__0__Impl rule__ExternalModel__Group_5__1 ;
    public final void rule__ExternalModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1175:1: ( rule__ExternalModel__Group_5__0__Impl rule__ExternalModel__Group_5__1 )
            // InternalSceneDsl.g:1176:2: rule__ExternalModel__Group_5__0__Impl rule__ExternalModel__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__ExternalModel__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalModel__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModel__Group_5__0"


    // $ANTLR start "rule__ExternalModel__Group_5__0__Impl"
    // InternalSceneDsl.g:1183:1: rule__ExternalModel__Group_5__0__Impl : ( 'placement' ) ;
    public final void rule__ExternalModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1187:1: ( ( 'placement' ) )
            // InternalSceneDsl.g:1188:1: ( 'placement' )
            {
            // InternalSceneDsl.g:1188:1: ( 'placement' )
            // InternalSceneDsl.g:1189:2: 'placement'
            {
             before(grammarAccess.getExternalModelAccess().getPlacementKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getExternalModelAccess().getPlacementKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModel__Group_5__0__Impl"


    // $ANTLR start "rule__ExternalModel__Group_5__1"
    // InternalSceneDsl.g:1198:1: rule__ExternalModel__Group_5__1 : rule__ExternalModel__Group_5__1__Impl ;
    public final void rule__ExternalModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1202:1: ( rule__ExternalModel__Group_5__1__Impl )
            // InternalSceneDsl.g:1203:2: rule__ExternalModel__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalModel__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModel__Group_5__1"


    // $ANTLR start "rule__ExternalModel__Group_5__1__Impl"
    // InternalSceneDsl.g:1209:1: rule__ExternalModel__Group_5__1__Impl : ( ( rule__ExternalModel__PlacementAssignment_5_1 ) ) ;
    public final void rule__ExternalModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1213:1: ( ( ( rule__ExternalModel__PlacementAssignment_5_1 ) ) )
            // InternalSceneDsl.g:1214:1: ( ( rule__ExternalModel__PlacementAssignment_5_1 ) )
            {
            // InternalSceneDsl.g:1214:1: ( ( rule__ExternalModel__PlacementAssignment_5_1 ) )
            // InternalSceneDsl.g:1215:2: ( rule__ExternalModel__PlacementAssignment_5_1 )
            {
             before(grammarAccess.getExternalModelAccess().getPlacementAssignment_5_1()); 
            // InternalSceneDsl.g:1216:2: ( rule__ExternalModel__PlacementAssignment_5_1 )
            // InternalSceneDsl.g:1216:3: rule__ExternalModel__PlacementAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalModel__PlacementAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalModelAccess().getPlacementAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModel__Group_5__1__Impl"


    // $ANTLR start "rule__Sphere__Group__0"
    // InternalSceneDsl.g:1225:1: rule__Sphere__Group__0 : rule__Sphere__Group__0__Impl rule__Sphere__Group__1 ;
    public final void rule__Sphere__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1229:1: ( rule__Sphere__Group__0__Impl rule__Sphere__Group__1 )
            // InternalSceneDsl.g:1230:2: rule__Sphere__Group__0__Impl rule__Sphere__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Sphere__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__0"


    // $ANTLR start "rule__Sphere__Group__0__Impl"
    // InternalSceneDsl.g:1237:1: rule__Sphere__Group__0__Impl : ( () ) ;
    public final void rule__Sphere__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1241:1: ( ( () ) )
            // InternalSceneDsl.g:1242:1: ( () )
            {
            // InternalSceneDsl.g:1242:1: ( () )
            // InternalSceneDsl.g:1243:2: ()
            {
             before(grammarAccess.getSphereAccess().getSphereAction_0()); 
            // InternalSceneDsl.g:1244:2: ()
            // InternalSceneDsl.g:1244:3: 
            {
            }

             after(grammarAccess.getSphereAccess().getSphereAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__0__Impl"


    // $ANTLR start "rule__Sphere__Group__1"
    // InternalSceneDsl.g:1252:1: rule__Sphere__Group__1 : rule__Sphere__Group__1__Impl rule__Sphere__Group__2 ;
    public final void rule__Sphere__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1256:1: ( rule__Sphere__Group__1__Impl rule__Sphere__Group__2 )
            // InternalSceneDsl.g:1257:2: rule__Sphere__Group__1__Impl rule__Sphere__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Sphere__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__1"


    // $ANTLR start "rule__Sphere__Group__1__Impl"
    // InternalSceneDsl.g:1264:1: rule__Sphere__Group__1__Impl : ( 'sphere' ) ;
    public final void rule__Sphere__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1268:1: ( ( 'sphere' ) )
            // InternalSceneDsl.g:1269:1: ( 'sphere' )
            {
            // InternalSceneDsl.g:1269:1: ( 'sphere' )
            // InternalSceneDsl.g:1270:2: 'sphere'
            {
             before(grammarAccess.getSphereAccess().getSphereKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getSphereKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__1__Impl"


    // $ANTLR start "rule__Sphere__Group__2"
    // InternalSceneDsl.g:1279:1: rule__Sphere__Group__2 : rule__Sphere__Group__2__Impl rule__Sphere__Group__3 ;
    public final void rule__Sphere__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1283:1: ( rule__Sphere__Group__2__Impl rule__Sphere__Group__3 )
            // InternalSceneDsl.g:1284:2: rule__Sphere__Group__2__Impl rule__Sphere__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Sphere__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__2"


    // $ANTLR start "rule__Sphere__Group__2__Impl"
    // InternalSceneDsl.g:1291:1: rule__Sphere__Group__2__Impl : ( ( rule__Sphere__NameAssignment_2 ) ) ;
    public final void rule__Sphere__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1295:1: ( ( ( rule__Sphere__NameAssignment_2 ) ) )
            // InternalSceneDsl.g:1296:1: ( ( rule__Sphere__NameAssignment_2 ) )
            {
            // InternalSceneDsl.g:1296:1: ( ( rule__Sphere__NameAssignment_2 ) )
            // InternalSceneDsl.g:1297:2: ( rule__Sphere__NameAssignment_2 )
            {
             before(grammarAccess.getSphereAccess().getNameAssignment_2()); 
            // InternalSceneDsl.g:1298:2: ( rule__Sphere__NameAssignment_2 )
            // InternalSceneDsl.g:1298:3: rule__Sphere__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSphereAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__2__Impl"


    // $ANTLR start "rule__Sphere__Group__3"
    // InternalSceneDsl.g:1306:1: rule__Sphere__Group__3 : rule__Sphere__Group__3__Impl rule__Sphere__Group__4 ;
    public final void rule__Sphere__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1310:1: ( rule__Sphere__Group__3__Impl rule__Sphere__Group__4 )
            // InternalSceneDsl.g:1311:2: rule__Sphere__Group__3__Impl rule__Sphere__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Sphere__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__3"


    // $ANTLR start "rule__Sphere__Group__3__Impl"
    // InternalSceneDsl.g:1318:1: rule__Sphere__Group__3__Impl : ( '{' ) ;
    public final void rule__Sphere__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1322:1: ( ( '{' ) )
            // InternalSceneDsl.g:1323:1: ( '{' )
            {
            // InternalSceneDsl.g:1323:1: ( '{' )
            // InternalSceneDsl.g:1324:2: '{'
            {
             before(grammarAccess.getSphereAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__3__Impl"


    // $ANTLR start "rule__Sphere__Group__4"
    // InternalSceneDsl.g:1333:1: rule__Sphere__Group__4 : rule__Sphere__Group__4__Impl rule__Sphere__Group__5 ;
    public final void rule__Sphere__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1337:1: ( rule__Sphere__Group__4__Impl rule__Sphere__Group__5 )
            // InternalSceneDsl.g:1338:2: rule__Sphere__Group__4__Impl rule__Sphere__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Sphere__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__4"


    // $ANTLR start "rule__Sphere__Group__4__Impl"
    // InternalSceneDsl.g:1345:1: rule__Sphere__Group__4__Impl : ( ( rule__Sphere__Group_4__0 )? ) ;
    public final void rule__Sphere__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1349:1: ( ( ( rule__Sphere__Group_4__0 )? ) )
            // InternalSceneDsl.g:1350:1: ( ( rule__Sphere__Group_4__0 )? )
            {
            // InternalSceneDsl.g:1350:1: ( ( rule__Sphere__Group_4__0 )? )
            // InternalSceneDsl.g:1351:2: ( rule__Sphere__Group_4__0 )?
            {
             before(grammarAccess.getSphereAccess().getGroup_4()); 
            // InternalSceneDsl.g:1352:2: ( rule__Sphere__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSceneDsl.g:1352:3: rule__Sphere__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sphere__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSphereAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__4__Impl"


    // $ANTLR start "rule__Sphere__Group__5"
    // InternalSceneDsl.g:1360:1: rule__Sphere__Group__5 : rule__Sphere__Group__5__Impl rule__Sphere__Group__6 ;
    public final void rule__Sphere__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1364:1: ( rule__Sphere__Group__5__Impl rule__Sphere__Group__6 )
            // InternalSceneDsl.g:1365:2: rule__Sphere__Group__5__Impl rule__Sphere__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Sphere__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__5"


    // $ANTLR start "rule__Sphere__Group__5__Impl"
    // InternalSceneDsl.g:1372:1: rule__Sphere__Group__5__Impl : ( ( rule__Sphere__Group_5__0 )? ) ;
    public final void rule__Sphere__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1376:1: ( ( ( rule__Sphere__Group_5__0 )? ) )
            // InternalSceneDsl.g:1377:1: ( ( rule__Sphere__Group_5__0 )? )
            {
            // InternalSceneDsl.g:1377:1: ( ( rule__Sphere__Group_5__0 )? )
            // InternalSceneDsl.g:1378:2: ( rule__Sphere__Group_5__0 )?
            {
             before(grammarAccess.getSphereAccess().getGroup_5()); 
            // InternalSceneDsl.g:1379:2: ( rule__Sphere__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSceneDsl.g:1379:3: rule__Sphere__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sphere__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSphereAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__5__Impl"


    // $ANTLR start "rule__Sphere__Group__6"
    // InternalSceneDsl.g:1387:1: rule__Sphere__Group__6 : rule__Sphere__Group__6__Impl rule__Sphere__Group__7 ;
    public final void rule__Sphere__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1391:1: ( rule__Sphere__Group__6__Impl rule__Sphere__Group__7 )
            // InternalSceneDsl.g:1392:2: rule__Sphere__Group__6__Impl rule__Sphere__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Sphere__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__6"


    // $ANTLR start "rule__Sphere__Group__6__Impl"
    // InternalSceneDsl.g:1399:1: rule__Sphere__Group__6__Impl : ( ( rule__Sphere__Group_6__0 )? ) ;
    public final void rule__Sphere__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1403:1: ( ( ( rule__Sphere__Group_6__0 )? ) )
            // InternalSceneDsl.g:1404:1: ( ( rule__Sphere__Group_6__0 )? )
            {
            // InternalSceneDsl.g:1404:1: ( ( rule__Sphere__Group_6__0 )? )
            // InternalSceneDsl.g:1405:2: ( rule__Sphere__Group_6__0 )?
            {
             before(grammarAccess.getSphereAccess().getGroup_6()); 
            // InternalSceneDsl.g:1406:2: ( rule__Sphere__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSceneDsl.g:1406:3: rule__Sphere__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sphere__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSphereAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__6__Impl"


    // $ANTLR start "rule__Sphere__Group__7"
    // InternalSceneDsl.g:1414:1: rule__Sphere__Group__7 : rule__Sphere__Group__7__Impl rule__Sphere__Group__8 ;
    public final void rule__Sphere__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1418:1: ( rule__Sphere__Group__7__Impl rule__Sphere__Group__8 )
            // InternalSceneDsl.g:1419:2: rule__Sphere__Group__7__Impl rule__Sphere__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Sphere__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__7"


    // $ANTLR start "rule__Sphere__Group__7__Impl"
    // InternalSceneDsl.g:1426:1: rule__Sphere__Group__7__Impl : ( ( rule__Sphere__Group_7__0 )? ) ;
    public final void rule__Sphere__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1430:1: ( ( ( rule__Sphere__Group_7__0 )? ) )
            // InternalSceneDsl.g:1431:1: ( ( rule__Sphere__Group_7__0 )? )
            {
            // InternalSceneDsl.g:1431:1: ( ( rule__Sphere__Group_7__0 )? )
            // InternalSceneDsl.g:1432:2: ( rule__Sphere__Group_7__0 )?
            {
             before(grammarAccess.getSphereAccess().getGroup_7()); 
            // InternalSceneDsl.g:1433:2: ( rule__Sphere__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSceneDsl.g:1433:3: rule__Sphere__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sphere__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSphereAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__7__Impl"


    // $ANTLR start "rule__Sphere__Group__8"
    // InternalSceneDsl.g:1441:1: rule__Sphere__Group__8 : rule__Sphere__Group__8__Impl ;
    public final void rule__Sphere__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1445:1: ( rule__Sphere__Group__8__Impl )
            // InternalSceneDsl.g:1446:2: rule__Sphere__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__8"


    // $ANTLR start "rule__Sphere__Group__8__Impl"
    // InternalSceneDsl.g:1452:1: rule__Sphere__Group__8__Impl : ( '}' ) ;
    public final void rule__Sphere__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1456:1: ( ( '}' ) )
            // InternalSceneDsl.g:1457:1: ( '}' )
            {
            // InternalSceneDsl.g:1457:1: ( '}' )
            // InternalSceneDsl.g:1458:2: '}'
            {
             before(grammarAccess.getSphereAccess().getRightCurlyBracketKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__8__Impl"


    // $ANTLR start "rule__Sphere__Group_4__0"
    // InternalSceneDsl.g:1468:1: rule__Sphere__Group_4__0 : rule__Sphere__Group_4__0__Impl rule__Sphere__Group_4__1 ;
    public final void rule__Sphere__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1472:1: ( rule__Sphere__Group_4__0__Impl rule__Sphere__Group_4__1 )
            // InternalSceneDsl.g:1473:2: rule__Sphere__Group_4__0__Impl rule__Sphere__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Sphere__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group_4__0"


    // $ANTLR start "rule__Sphere__Group_4__0__Impl"
    // InternalSceneDsl.g:1480:1: rule__Sphere__Group_4__0__Impl : ( 'radius' ) ;
    public final void rule__Sphere__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1484:1: ( ( 'radius' ) )
            // InternalSceneDsl.g:1485:1: ( 'radius' )
            {
            // InternalSceneDsl.g:1485:1: ( 'radius' )
            // InternalSceneDsl.g:1486:2: 'radius'
            {
             before(grammarAccess.getSphereAccess().getRadiusKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getRadiusKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group_4__0__Impl"


    // $ANTLR start "rule__Sphere__Group_4__1"
    // InternalSceneDsl.g:1495:1: rule__Sphere__Group_4__1 : rule__Sphere__Group_4__1__Impl ;
    public final void rule__Sphere__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1499:1: ( rule__Sphere__Group_4__1__Impl )
            // InternalSceneDsl.g:1500:2: rule__Sphere__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group_4__1"


    // $ANTLR start "rule__Sphere__Group_4__1__Impl"
    // InternalSceneDsl.g:1506:1: rule__Sphere__Group_4__1__Impl : ( ( rule__Sphere__RadiusAssignment_4_1 ) ) ;
    public final void rule__Sphere__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1510:1: ( ( ( rule__Sphere__RadiusAssignment_4_1 ) ) )
            // InternalSceneDsl.g:1511:1: ( ( rule__Sphere__RadiusAssignment_4_1 ) )
            {
            // InternalSceneDsl.g:1511:1: ( ( rule__Sphere__RadiusAssignment_4_1 ) )
            // InternalSceneDsl.g:1512:2: ( rule__Sphere__RadiusAssignment_4_1 )
            {
             before(grammarAccess.getSphereAccess().getRadiusAssignment_4_1()); 
            // InternalSceneDsl.g:1513:2: ( rule__Sphere__RadiusAssignment_4_1 )
            // InternalSceneDsl.g:1513:3: rule__Sphere__RadiusAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__RadiusAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSphereAccess().getRadiusAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group_4__1__Impl"


    // $ANTLR start "rule__Sphere__Group_5__0"
    // InternalSceneDsl.g:1522:1: rule__Sphere__Group_5__0 : rule__Sphere__Group_5__0__Impl rule__Sphere__Group_5__1 ;
    public final void rule__Sphere__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1526:1: ( rule__Sphere__Group_5__0__Impl rule__Sphere__Group_5__1 )
            // InternalSceneDsl.g:1527:2: rule__Sphere__Group_5__0__Impl rule__Sphere__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Sphere__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group_5__0"


    // $ANTLR start "rule__Sphere__Group_5__0__Impl"
    // InternalSceneDsl.g:1534:1: rule__Sphere__Group_5__0__Impl : ( 'placement' ) ;
    public final void rule__Sphere__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1538:1: ( ( 'placement' ) )
            // InternalSceneDsl.g:1539:1: ( 'placement' )
            {
            // InternalSceneDsl.g:1539:1: ( 'placement' )
            // InternalSceneDsl.g:1540:2: 'placement'
            {
             before(grammarAccess.getSphereAccess().getPlacementKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getPlacementKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group_5__0__Impl"


    // $ANTLR start "rule__Sphere__Group_5__1"
    // InternalSceneDsl.g:1549:1: rule__Sphere__Group_5__1 : rule__Sphere__Group_5__1__Impl ;
    public final void rule__Sphere__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1553:1: ( rule__Sphere__Group_5__1__Impl )
            // InternalSceneDsl.g:1554:2: rule__Sphere__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group_5__1"


    // $ANTLR start "rule__Sphere__Group_5__1__Impl"
    // InternalSceneDsl.g:1560:1: rule__Sphere__Group_5__1__Impl : ( ( rule__Sphere__PlacementAssignment_5_1 ) ) ;
    public final void rule__Sphere__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1564:1: ( ( ( rule__Sphere__PlacementAssignment_5_1 ) ) )
            // InternalSceneDsl.g:1565:1: ( ( rule__Sphere__PlacementAssignment_5_1 ) )
            {
            // InternalSceneDsl.g:1565:1: ( ( rule__Sphere__PlacementAssignment_5_1 ) )
            // InternalSceneDsl.g:1566:2: ( rule__Sphere__PlacementAssignment_5_1 )
            {
             before(grammarAccess.getSphereAccess().getPlacementAssignment_5_1()); 
            // InternalSceneDsl.g:1567:2: ( rule__Sphere__PlacementAssignment_5_1 )
            // InternalSceneDsl.g:1567:3: rule__Sphere__PlacementAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__PlacementAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSphereAccess().getPlacementAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group_5__1__Impl"


    // $ANTLR start "rule__Sphere__Group_6__0"
    // InternalSceneDsl.g:1576:1: rule__Sphere__Group_6__0 : rule__Sphere__Group_6__0__Impl rule__Sphere__Group_6__1 ;
    public final void rule__Sphere__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1580:1: ( rule__Sphere__Group_6__0__Impl rule__Sphere__Group_6__1 )
            // InternalSceneDsl.g:1581:2: rule__Sphere__Group_6__0__Impl rule__Sphere__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__Sphere__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group_6__0"


    // $ANTLR start "rule__Sphere__Group_6__0__Impl"
    // InternalSceneDsl.g:1588:1: rule__Sphere__Group_6__0__Impl : ( 'physicparameters' ) ;
    public final void rule__Sphere__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1592:1: ( ( 'physicparameters' ) )
            // InternalSceneDsl.g:1593:1: ( 'physicparameters' )
            {
            // InternalSceneDsl.g:1593:1: ( 'physicparameters' )
            // InternalSceneDsl.g:1594:2: 'physicparameters'
            {
             before(grammarAccess.getSphereAccess().getPhysicparametersKeyword_6_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getPhysicparametersKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group_6__0__Impl"


    // $ANTLR start "rule__Sphere__Group_6__1"
    // InternalSceneDsl.g:1603:1: rule__Sphere__Group_6__1 : rule__Sphere__Group_6__1__Impl ;
    public final void rule__Sphere__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1607:1: ( rule__Sphere__Group_6__1__Impl )
            // InternalSceneDsl.g:1608:2: rule__Sphere__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group_6__1"


    // $ANTLR start "rule__Sphere__Group_6__1__Impl"
    // InternalSceneDsl.g:1614:1: rule__Sphere__Group_6__1__Impl : ( ( rule__Sphere__PhysicparametersAssignment_6_1 ) ) ;
    public final void rule__Sphere__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1618:1: ( ( ( rule__Sphere__PhysicparametersAssignment_6_1 ) ) )
            // InternalSceneDsl.g:1619:1: ( ( rule__Sphere__PhysicparametersAssignment_6_1 ) )
            {
            // InternalSceneDsl.g:1619:1: ( ( rule__Sphere__PhysicparametersAssignment_6_1 ) )
            // InternalSceneDsl.g:1620:2: ( rule__Sphere__PhysicparametersAssignment_6_1 )
            {
             before(grammarAccess.getSphereAccess().getPhysicparametersAssignment_6_1()); 
            // InternalSceneDsl.g:1621:2: ( rule__Sphere__PhysicparametersAssignment_6_1 )
            // InternalSceneDsl.g:1621:3: rule__Sphere__PhysicparametersAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__PhysicparametersAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSphereAccess().getPhysicparametersAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group_6__1__Impl"


    // $ANTLR start "rule__Sphere__Group_7__0"
    // InternalSceneDsl.g:1630:1: rule__Sphere__Group_7__0 : rule__Sphere__Group_7__0__Impl rule__Sphere__Group_7__1 ;
    public final void rule__Sphere__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1634:1: ( rule__Sphere__Group_7__0__Impl rule__Sphere__Group_7__1 )
            // InternalSceneDsl.g:1635:2: rule__Sphere__Group_7__0__Impl rule__Sphere__Group_7__1
            {
            pushFollow(FOLLOW_15);
            rule__Sphere__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group_7__0"


    // $ANTLR start "rule__Sphere__Group_7__0__Impl"
    // InternalSceneDsl.g:1642:1: rule__Sphere__Group_7__0__Impl : ( 'material' ) ;
    public final void rule__Sphere__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1646:1: ( ( 'material' ) )
            // InternalSceneDsl.g:1647:1: ( 'material' )
            {
            // InternalSceneDsl.g:1647:1: ( 'material' )
            // InternalSceneDsl.g:1648:2: 'material'
            {
             before(grammarAccess.getSphereAccess().getMaterialKeyword_7_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getMaterialKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group_7__0__Impl"


    // $ANTLR start "rule__Sphere__Group_7__1"
    // InternalSceneDsl.g:1657:1: rule__Sphere__Group_7__1 : rule__Sphere__Group_7__1__Impl ;
    public final void rule__Sphere__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1661:1: ( rule__Sphere__Group_7__1__Impl )
            // InternalSceneDsl.g:1662:2: rule__Sphere__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group_7__1"


    // $ANTLR start "rule__Sphere__Group_7__1__Impl"
    // InternalSceneDsl.g:1668:1: rule__Sphere__Group_7__1__Impl : ( ( rule__Sphere__MaterialAssignment_7_1 ) ) ;
    public final void rule__Sphere__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1672:1: ( ( ( rule__Sphere__MaterialAssignment_7_1 ) ) )
            // InternalSceneDsl.g:1673:1: ( ( rule__Sphere__MaterialAssignment_7_1 ) )
            {
            // InternalSceneDsl.g:1673:1: ( ( rule__Sphere__MaterialAssignment_7_1 ) )
            // InternalSceneDsl.g:1674:2: ( rule__Sphere__MaterialAssignment_7_1 )
            {
             before(grammarAccess.getSphereAccess().getMaterialAssignment_7_1()); 
            // InternalSceneDsl.g:1675:2: ( rule__Sphere__MaterialAssignment_7_1 )
            // InternalSceneDsl.g:1675:3: rule__Sphere__MaterialAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__MaterialAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getSphereAccess().getMaterialAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group_7__1__Impl"


    // $ANTLR start "rule__Box__Group__0"
    // InternalSceneDsl.g:1684:1: rule__Box__Group__0 : rule__Box__Group__0__Impl rule__Box__Group__1 ;
    public final void rule__Box__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1688:1: ( rule__Box__Group__0__Impl rule__Box__Group__1 )
            // InternalSceneDsl.g:1689:2: rule__Box__Group__0__Impl rule__Box__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Box__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__0"


    // $ANTLR start "rule__Box__Group__0__Impl"
    // InternalSceneDsl.g:1696:1: rule__Box__Group__0__Impl : ( () ) ;
    public final void rule__Box__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1700:1: ( ( () ) )
            // InternalSceneDsl.g:1701:1: ( () )
            {
            // InternalSceneDsl.g:1701:1: ( () )
            // InternalSceneDsl.g:1702:2: ()
            {
             before(grammarAccess.getBoxAccess().getBoxAction_0()); 
            // InternalSceneDsl.g:1703:2: ()
            // InternalSceneDsl.g:1703:3: 
            {
            }

             after(grammarAccess.getBoxAccess().getBoxAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__0__Impl"


    // $ANTLR start "rule__Box__Group__1"
    // InternalSceneDsl.g:1711:1: rule__Box__Group__1 : rule__Box__Group__1__Impl rule__Box__Group__2 ;
    public final void rule__Box__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1715:1: ( rule__Box__Group__1__Impl rule__Box__Group__2 )
            // InternalSceneDsl.g:1716:2: rule__Box__Group__1__Impl rule__Box__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Box__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__1"


    // $ANTLR start "rule__Box__Group__1__Impl"
    // InternalSceneDsl.g:1723:1: rule__Box__Group__1__Impl : ( 'box' ) ;
    public final void rule__Box__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1727:1: ( ( 'box' ) )
            // InternalSceneDsl.g:1728:1: ( 'box' )
            {
            // InternalSceneDsl.g:1728:1: ( 'box' )
            // InternalSceneDsl.g:1729:2: 'box'
            {
             before(grammarAccess.getBoxAccess().getBoxKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getBoxKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__1__Impl"


    // $ANTLR start "rule__Box__Group__2"
    // InternalSceneDsl.g:1738:1: rule__Box__Group__2 : rule__Box__Group__2__Impl rule__Box__Group__3 ;
    public final void rule__Box__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1742:1: ( rule__Box__Group__2__Impl rule__Box__Group__3 )
            // InternalSceneDsl.g:1743:2: rule__Box__Group__2__Impl rule__Box__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Box__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__2"


    // $ANTLR start "rule__Box__Group__2__Impl"
    // InternalSceneDsl.g:1750:1: rule__Box__Group__2__Impl : ( ( rule__Box__NameAssignment_2 ) ) ;
    public final void rule__Box__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1754:1: ( ( ( rule__Box__NameAssignment_2 ) ) )
            // InternalSceneDsl.g:1755:1: ( ( rule__Box__NameAssignment_2 ) )
            {
            // InternalSceneDsl.g:1755:1: ( ( rule__Box__NameAssignment_2 ) )
            // InternalSceneDsl.g:1756:2: ( rule__Box__NameAssignment_2 )
            {
             before(grammarAccess.getBoxAccess().getNameAssignment_2()); 
            // InternalSceneDsl.g:1757:2: ( rule__Box__NameAssignment_2 )
            // InternalSceneDsl.g:1757:3: rule__Box__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Box__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__2__Impl"


    // $ANTLR start "rule__Box__Group__3"
    // InternalSceneDsl.g:1765:1: rule__Box__Group__3 : rule__Box__Group__3__Impl rule__Box__Group__4 ;
    public final void rule__Box__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1769:1: ( rule__Box__Group__3__Impl rule__Box__Group__4 )
            // InternalSceneDsl.g:1770:2: rule__Box__Group__3__Impl rule__Box__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Box__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__3"


    // $ANTLR start "rule__Box__Group__3__Impl"
    // InternalSceneDsl.g:1777:1: rule__Box__Group__3__Impl : ( '{' ) ;
    public final void rule__Box__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1781:1: ( ( '{' ) )
            // InternalSceneDsl.g:1782:1: ( '{' )
            {
            // InternalSceneDsl.g:1782:1: ( '{' )
            // InternalSceneDsl.g:1783:2: '{'
            {
             before(grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__3__Impl"


    // $ANTLR start "rule__Box__Group__4"
    // InternalSceneDsl.g:1792:1: rule__Box__Group__4 : rule__Box__Group__4__Impl rule__Box__Group__5 ;
    public final void rule__Box__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1796:1: ( rule__Box__Group__4__Impl rule__Box__Group__5 )
            // InternalSceneDsl.g:1797:2: rule__Box__Group__4__Impl rule__Box__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Box__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__4"


    // $ANTLR start "rule__Box__Group__4__Impl"
    // InternalSceneDsl.g:1804:1: rule__Box__Group__4__Impl : ( ( rule__Box__Group_4__0 )? ) ;
    public final void rule__Box__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1808:1: ( ( ( rule__Box__Group_4__0 )? ) )
            // InternalSceneDsl.g:1809:1: ( ( rule__Box__Group_4__0 )? )
            {
            // InternalSceneDsl.g:1809:1: ( ( rule__Box__Group_4__0 )? )
            // InternalSceneDsl.g:1810:2: ( rule__Box__Group_4__0 )?
            {
             before(grammarAccess.getBoxAccess().getGroup_4()); 
            // InternalSceneDsl.g:1811:2: ( rule__Box__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSceneDsl.g:1811:3: rule__Box__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Box__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoxAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__4__Impl"


    // $ANTLR start "rule__Box__Group__5"
    // InternalSceneDsl.g:1819:1: rule__Box__Group__5 : rule__Box__Group__5__Impl rule__Box__Group__6 ;
    public final void rule__Box__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1823:1: ( rule__Box__Group__5__Impl rule__Box__Group__6 )
            // InternalSceneDsl.g:1824:2: rule__Box__Group__5__Impl rule__Box__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Box__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__5"


    // $ANTLR start "rule__Box__Group__5__Impl"
    // InternalSceneDsl.g:1831:1: rule__Box__Group__5__Impl : ( ( rule__Box__Group_5__0 )? ) ;
    public final void rule__Box__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1835:1: ( ( ( rule__Box__Group_5__0 )? ) )
            // InternalSceneDsl.g:1836:1: ( ( rule__Box__Group_5__0 )? )
            {
            // InternalSceneDsl.g:1836:1: ( ( rule__Box__Group_5__0 )? )
            // InternalSceneDsl.g:1837:2: ( rule__Box__Group_5__0 )?
            {
             before(grammarAccess.getBoxAccess().getGroup_5()); 
            // InternalSceneDsl.g:1838:2: ( rule__Box__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSceneDsl.g:1838:3: rule__Box__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Box__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoxAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__5__Impl"


    // $ANTLR start "rule__Box__Group__6"
    // InternalSceneDsl.g:1846:1: rule__Box__Group__6 : rule__Box__Group__6__Impl rule__Box__Group__7 ;
    public final void rule__Box__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1850:1: ( rule__Box__Group__6__Impl rule__Box__Group__7 )
            // InternalSceneDsl.g:1851:2: rule__Box__Group__6__Impl rule__Box__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Box__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__6"


    // $ANTLR start "rule__Box__Group__6__Impl"
    // InternalSceneDsl.g:1858:1: rule__Box__Group__6__Impl : ( ( rule__Box__Group_6__0 )? ) ;
    public final void rule__Box__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1862:1: ( ( ( rule__Box__Group_6__0 )? ) )
            // InternalSceneDsl.g:1863:1: ( ( rule__Box__Group_6__0 )? )
            {
            // InternalSceneDsl.g:1863:1: ( ( rule__Box__Group_6__0 )? )
            // InternalSceneDsl.g:1864:2: ( rule__Box__Group_6__0 )?
            {
             before(grammarAccess.getBoxAccess().getGroup_6()); 
            // InternalSceneDsl.g:1865:2: ( rule__Box__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSceneDsl.g:1865:3: rule__Box__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Box__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoxAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__6__Impl"


    // $ANTLR start "rule__Box__Group__7"
    // InternalSceneDsl.g:1873:1: rule__Box__Group__7 : rule__Box__Group__7__Impl rule__Box__Group__8 ;
    public final void rule__Box__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1877:1: ( rule__Box__Group__7__Impl rule__Box__Group__8 )
            // InternalSceneDsl.g:1878:2: rule__Box__Group__7__Impl rule__Box__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__Box__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__7"


    // $ANTLR start "rule__Box__Group__7__Impl"
    // InternalSceneDsl.g:1885:1: rule__Box__Group__7__Impl : ( ( rule__Box__Group_7__0 )? ) ;
    public final void rule__Box__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1889:1: ( ( ( rule__Box__Group_7__0 )? ) )
            // InternalSceneDsl.g:1890:1: ( ( rule__Box__Group_7__0 )? )
            {
            // InternalSceneDsl.g:1890:1: ( ( rule__Box__Group_7__0 )? )
            // InternalSceneDsl.g:1891:2: ( rule__Box__Group_7__0 )?
            {
             before(grammarAccess.getBoxAccess().getGroup_7()); 
            // InternalSceneDsl.g:1892:2: ( rule__Box__Group_7__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSceneDsl.g:1892:3: rule__Box__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Box__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoxAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__7__Impl"


    // $ANTLR start "rule__Box__Group__8"
    // InternalSceneDsl.g:1900:1: rule__Box__Group__8 : rule__Box__Group__8__Impl rule__Box__Group__9 ;
    public final void rule__Box__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1904:1: ( rule__Box__Group__8__Impl rule__Box__Group__9 )
            // InternalSceneDsl.g:1905:2: rule__Box__Group__8__Impl rule__Box__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__Box__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__8"


    // $ANTLR start "rule__Box__Group__8__Impl"
    // InternalSceneDsl.g:1912:1: rule__Box__Group__8__Impl : ( ( rule__Box__Group_8__0 )? ) ;
    public final void rule__Box__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1916:1: ( ( ( rule__Box__Group_8__0 )? ) )
            // InternalSceneDsl.g:1917:1: ( ( rule__Box__Group_8__0 )? )
            {
            // InternalSceneDsl.g:1917:1: ( ( rule__Box__Group_8__0 )? )
            // InternalSceneDsl.g:1918:2: ( rule__Box__Group_8__0 )?
            {
             before(grammarAccess.getBoxAccess().getGroup_8()); 
            // InternalSceneDsl.g:1919:2: ( rule__Box__Group_8__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSceneDsl.g:1919:3: rule__Box__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Box__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoxAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__8__Impl"


    // $ANTLR start "rule__Box__Group__9"
    // InternalSceneDsl.g:1927:1: rule__Box__Group__9 : rule__Box__Group__9__Impl rule__Box__Group__10 ;
    public final void rule__Box__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1931:1: ( rule__Box__Group__9__Impl rule__Box__Group__10 )
            // InternalSceneDsl.g:1932:2: rule__Box__Group__9__Impl rule__Box__Group__10
            {
            pushFollow(FOLLOW_17);
            rule__Box__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__9"


    // $ANTLR start "rule__Box__Group__9__Impl"
    // InternalSceneDsl.g:1939:1: rule__Box__Group__9__Impl : ( ( rule__Box__Group_9__0 )? ) ;
    public final void rule__Box__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1943:1: ( ( ( rule__Box__Group_9__0 )? ) )
            // InternalSceneDsl.g:1944:1: ( ( rule__Box__Group_9__0 )? )
            {
            // InternalSceneDsl.g:1944:1: ( ( rule__Box__Group_9__0 )? )
            // InternalSceneDsl.g:1945:2: ( rule__Box__Group_9__0 )?
            {
             before(grammarAccess.getBoxAccess().getGroup_9()); 
            // InternalSceneDsl.g:1946:2: ( rule__Box__Group_9__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSceneDsl.g:1946:3: rule__Box__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Box__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoxAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__9__Impl"


    // $ANTLR start "rule__Box__Group__10"
    // InternalSceneDsl.g:1954:1: rule__Box__Group__10 : rule__Box__Group__10__Impl ;
    public final void rule__Box__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1958:1: ( rule__Box__Group__10__Impl )
            // InternalSceneDsl.g:1959:2: rule__Box__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__10"


    // $ANTLR start "rule__Box__Group__10__Impl"
    // InternalSceneDsl.g:1965:1: rule__Box__Group__10__Impl : ( '}' ) ;
    public final void rule__Box__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1969:1: ( ( '}' ) )
            // InternalSceneDsl.g:1970:1: ( '}' )
            {
            // InternalSceneDsl.g:1970:1: ( '}' )
            // InternalSceneDsl.g:1971:2: '}'
            {
             before(grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_10()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__10__Impl"


    // $ANTLR start "rule__Box__Group_4__0"
    // InternalSceneDsl.g:1981:1: rule__Box__Group_4__0 : rule__Box__Group_4__0__Impl rule__Box__Group_4__1 ;
    public final void rule__Box__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1985:1: ( rule__Box__Group_4__0__Impl rule__Box__Group_4__1 )
            // InternalSceneDsl.g:1986:2: rule__Box__Group_4__0__Impl rule__Box__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Box__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_4__0"


    // $ANTLR start "rule__Box__Group_4__0__Impl"
    // InternalSceneDsl.g:1993:1: rule__Box__Group_4__0__Impl : ( 'width' ) ;
    public final void rule__Box__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:1997:1: ( ( 'width' ) )
            // InternalSceneDsl.g:1998:1: ( 'width' )
            {
            // InternalSceneDsl.g:1998:1: ( 'width' )
            // InternalSceneDsl.g:1999:2: 'width'
            {
             before(grammarAccess.getBoxAccess().getWidthKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getWidthKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_4__0__Impl"


    // $ANTLR start "rule__Box__Group_4__1"
    // InternalSceneDsl.g:2008:1: rule__Box__Group_4__1 : rule__Box__Group_4__1__Impl ;
    public final void rule__Box__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2012:1: ( rule__Box__Group_4__1__Impl )
            // InternalSceneDsl.g:2013:2: rule__Box__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_4__1"


    // $ANTLR start "rule__Box__Group_4__1__Impl"
    // InternalSceneDsl.g:2019:1: rule__Box__Group_4__1__Impl : ( ( rule__Box__WidthAssignment_4_1 ) ) ;
    public final void rule__Box__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2023:1: ( ( ( rule__Box__WidthAssignment_4_1 ) ) )
            // InternalSceneDsl.g:2024:1: ( ( rule__Box__WidthAssignment_4_1 ) )
            {
            // InternalSceneDsl.g:2024:1: ( ( rule__Box__WidthAssignment_4_1 ) )
            // InternalSceneDsl.g:2025:2: ( rule__Box__WidthAssignment_4_1 )
            {
             before(grammarAccess.getBoxAccess().getWidthAssignment_4_1()); 
            // InternalSceneDsl.g:2026:2: ( rule__Box__WidthAssignment_4_1 )
            // InternalSceneDsl.g:2026:3: rule__Box__WidthAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Box__WidthAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getWidthAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_4__1__Impl"


    // $ANTLR start "rule__Box__Group_5__0"
    // InternalSceneDsl.g:2035:1: rule__Box__Group_5__0 : rule__Box__Group_5__0__Impl rule__Box__Group_5__1 ;
    public final void rule__Box__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2039:1: ( rule__Box__Group_5__0__Impl rule__Box__Group_5__1 )
            // InternalSceneDsl.g:2040:2: rule__Box__Group_5__0__Impl rule__Box__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__Box__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_5__0"


    // $ANTLR start "rule__Box__Group_5__0__Impl"
    // InternalSceneDsl.g:2047:1: rule__Box__Group_5__0__Impl : ( 'height' ) ;
    public final void rule__Box__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2051:1: ( ( 'height' ) )
            // InternalSceneDsl.g:2052:1: ( 'height' )
            {
            // InternalSceneDsl.g:2052:1: ( 'height' )
            // InternalSceneDsl.g:2053:2: 'height'
            {
             before(grammarAccess.getBoxAccess().getHeightKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getHeightKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_5__0__Impl"


    // $ANTLR start "rule__Box__Group_5__1"
    // InternalSceneDsl.g:2062:1: rule__Box__Group_5__1 : rule__Box__Group_5__1__Impl ;
    public final void rule__Box__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2066:1: ( rule__Box__Group_5__1__Impl )
            // InternalSceneDsl.g:2067:2: rule__Box__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_5__1"


    // $ANTLR start "rule__Box__Group_5__1__Impl"
    // InternalSceneDsl.g:2073:1: rule__Box__Group_5__1__Impl : ( ( rule__Box__HeightAssignment_5_1 ) ) ;
    public final void rule__Box__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2077:1: ( ( ( rule__Box__HeightAssignment_5_1 ) ) )
            // InternalSceneDsl.g:2078:1: ( ( rule__Box__HeightAssignment_5_1 ) )
            {
            // InternalSceneDsl.g:2078:1: ( ( rule__Box__HeightAssignment_5_1 ) )
            // InternalSceneDsl.g:2079:2: ( rule__Box__HeightAssignment_5_1 )
            {
             before(grammarAccess.getBoxAccess().getHeightAssignment_5_1()); 
            // InternalSceneDsl.g:2080:2: ( rule__Box__HeightAssignment_5_1 )
            // InternalSceneDsl.g:2080:3: rule__Box__HeightAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Box__HeightAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getHeightAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_5__1__Impl"


    // $ANTLR start "rule__Box__Group_6__0"
    // InternalSceneDsl.g:2089:1: rule__Box__Group_6__0 : rule__Box__Group_6__0__Impl rule__Box__Group_6__1 ;
    public final void rule__Box__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2093:1: ( rule__Box__Group_6__0__Impl rule__Box__Group_6__1 )
            // InternalSceneDsl.g:2094:2: rule__Box__Group_6__0__Impl rule__Box__Group_6__1
            {
            pushFollow(FOLLOW_14);
            rule__Box__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_6__0"


    // $ANTLR start "rule__Box__Group_6__0__Impl"
    // InternalSceneDsl.g:2101:1: rule__Box__Group_6__0__Impl : ( 'depth' ) ;
    public final void rule__Box__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2105:1: ( ( 'depth' ) )
            // InternalSceneDsl.g:2106:1: ( 'depth' )
            {
            // InternalSceneDsl.g:2106:1: ( 'depth' )
            // InternalSceneDsl.g:2107:2: 'depth'
            {
             before(grammarAccess.getBoxAccess().getDepthKeyword_6_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getDepthKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_6__0__Impl"


    // $ANTLR start "rule__Box__Group_6__1"
    // InternalSceneDsl.g:2116:1: rule__Box__Group_6__1 : rule__Box__Group_6__1__Impl ;
    public final void rule__Box__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2120:1: ( rule__Box__Group_6__1__Impl )
            // InternalSceneDsl.g:2121:2: rule__Box__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_6__1"


    // $ANTLR start "rule__Box__Group_6__1__Impl"
    // InternalSceneDsl.g:2127:1: rule__Box__Group_6__1__Impl : ( ( rule__Box__DepthAssignment_6_1 ) ) ;
    public final void rule__Box__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2131:1: ( ( ( rule__Box__DepthAssignment_6_1 ) ) )
            // InternalSceneDsl.g:2132:1: ( ( rule__Box__DepthAssignment_6_1 ) )
            {
            // InternalSceneDsl.g:2132:1: ( ( rule__Box__DepthAssignment_6_1 ) )
            // InternalSceneDsl.g:2133:2: ( rule__Box__DepthAssignment_6_1 )
            {
             before(grammarAccess.getBoxAccess().getDepthAssignment_6_1()); 
            // InternalSceneDsl.g:2134:2: ( rule__Box__DepthAssignment_6_1 )
            // InternalSceneDsl.g:2134:3: rule__Box__DepthAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Box__DepthAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getDepthAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_6__1__Impl"


    // $ANTLR start "rule__Box__Group_7__0"
    // InternalSceneDsl.g:2143:1: rule__Box__Group_7__0 : rule__Box__Group_7__0__Impl rule__Box__Group_7__1 ;
    public final void rule__Box__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2147:1: ( rule__Box__Group_7__0__Impl rule__Box__Group_7__1 )
            // InternalSceneDsl.g:2148:2: rule__Box__Group_7__0__Impl rule__Box__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__Box__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_7__0"


    // $ANTLR start "rule__Box__Group_7__0__Impl"
    // InternalSceneDsl.g:2155:1: rule__Box__Group_7__0__Impl : ( 'placement' ) ;
    public final void rule__Box__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2159:1: ( ( 'placement' ) )
            // InternalSceneDsl.g:2160:1: ( 'placement' )
            {
            // InternalSceneDsl.g:2160:1: ( 'placement' )
            // InternalSceneDsl.g:2161:2: 'placement'
            {
             before(grammarAccess.getBoxAccess().getPlacementKeyword_7_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getPlacementKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_7__0__Impl"


    // $ANTLR start "rule__Box__Group_7__1"
    // InternalSceneDsl.g:2170:1: rule__Box__Group_7__1 : rule__Box__Group_7__1__Impl ;
    public final void rule__Box__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2174:1: ( rule__Box__Group_7__1__Impl )
            // InternalSceneDsl.g:2175:2: rule__Box__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_7__1"


    // $ANTLR start "rule__Box__Group_7__1__Impl"
    // InternalSceneDsl.g:2181:1: rule__Box__Group_7__1__Impl : ( ( rule__Box__PlacementAssignment_7_1 ) ) ;
    public final void rule__Box__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2185:1: ( ( ( rule__Box__PlacementAssignment_7_1 ) ) )
            // InternalSceneDsl.g:2186:1: ( ( rule__Box__PlacementAssignment_7_1 ) )
            {
            // InternalSceneDsl.g:2186:1: ( ( rule__Box__PlacementAssignment_7_1 ) )
            // InternalSceneDsl.g:2187:2: ( rule__Box__PlacementAssignment_7_1 )
            {
             before(grammarAccess.getBoxAccess().getPlacementAssignment_7_1()); 
            // InternalSceneDsl.g:2188:2: ( rule__Box__PlacementAssignment_7_1 )
            // InternalSceneDsl.g:2188:3: rule__Box__PlacementAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Box__PlacementAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getPlacementAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_7__1__Impl"


    // $ANTLR start "rule__Box__Group_8__0"
    // InternalSceneDsl.g:2197:1: rule__Box__Group_8__0 : rule__Box__Group_8__0__Impl rule__Box__Group_8__1 ;
    public final void rule__Box__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2201:1: ( rule__Box__Group_8__0__Impl rule__Box__Group_8__1 )
            // InternalSceneDsl.g:2202:2: rule__Box__Group_8__0__Impl rule__Box__Group_8__1
            {
            pushFollow(FOLLOW_5);
            rule__Box__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_8__0"


    // $ANTLR start "rule__Box__Group_8__0__Impl"
    // InternalSceneDsl.g:2209:1: rule__Box__Group_8__0__Impl : ( 'physicparameters' ) ;
    public final void rule__Box__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2213:1: ( ( 'physicparameters' ) )
            // InternalSceneDsl.g:2214:1: ( 'physicparameters' )
            {
            // InternalSceneDsl.g:2214:1: ( 'physicparameters' )
            // InternalSceneDsl.g:2215:2: 'physicparameters'
            {
             before(grammarAccess.getBoxAccess().getPhysicparametersKeyword_8_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getPhysicparametersKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_8__0__Impl"


    // $ANTLR start "rule__Box__Group_8__1"
    // InternalSceneDsl.g:2224:1: rule__Box__Group_8__1 : rule__Box__Group_8__1__Impl ;
    public final void rule__Box__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2228:1: ( rule__Box__Group_8__1__Impl )
            // InternalSceneDsl.g:2229:2: rule__Box__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_8__1"


    // $ANTLR start "rule__Box__Group_8__1__Impl"
    // InternalSceneDsl.g:2235:1: rule__Box__Group_8__1__Impl : ( ( rule__Box__PhysicparametersAssignment_8_1 ) ) ;
    public final void rule__Box__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2239:1: ( ( ( rule__Box__PhysicparametersAssignment_8_1 ) ) )
            // InternalSceneDsl.g:2240:1: ( ( rule__Box__PhysicparametersAssignment_8_1 ) )
            {
            // InternalSceneDsl.g:2240:1: ( ( rule__Box__PhysicparametersAssignment_8_1 ) )
            // InternalSceneDsl.g:2241:2: ( rule__Box__PhysicparametersAssignment_8_1 )
            {
             before(grammarAccess.getBoxAccess().getPhysicparametersAssignment_8_1()); 
            // InternalSceneDsl.g:2242:2: ( rule__Box__PhysicparametersAssignment_8_1 )
            // InternalSceneDsl.g:2242:3: rule__Box__PhysicparametersAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Box__PhysicparametersAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getPhysicparametersAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_8__1__Impl"


    // $ANTLR start "rule__Box__Group_9__0"
    // InternalSceneDsl.g:2251:1: rule__Box__Group_9__0 : rule__Box__Group_9__0__Impl rule__Box__Group_9__1 ;
    public final void rule__Box__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2255:1: ( rule__Box__Group_9__0__Impl rule__Box__Group_9__1 )
            // InternalSceneDsl.g:2256:2: rule__Box__Group_9__0__Impl rule__Box__Group_9__1
            {
            pushFollow(FOLLOW_15);
            rule__Box__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_9__0"


    // $ANTLR start "rule__Box__Group_9__0__Impl"
    // InternalSceneDsl.g:2263:1: rule__Box__Group_9__0__Impl : ( 'material' ) ;
    public final void rule__Box__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2267:1: ( ( 'material' ) )
            // InternalSceneDsl.g:2268:1: ( 'material' )
            {
            // InternalSceneDsl.g:2268:1: ( 'material' )
            // InternalSceneDsl.g:2269:2: 'material'
            {
             before(grammarAccess.getBoxAccess().getMaterialKeyword_9_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getMaterialKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_9__0__Impl"


    // $ANTLR start "rule__Box__Group_9__1"
    // InternalSceneDsl.g:2278:1: rule__Box__Group_9__1 : rule__Box__Group_9__1__Impl ;
    public final void rule__Box__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2282:1: ( rule__Box__Group_9__1__Impl )
            // InternalSceneDsl.g:2283:2: rule__Box__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_9__1"


    // $ANTLR start "rule__Box__Group_9__1__Impl"
    // InternalSceneDsl.g:2289:1: rule__Box__Group_9__1__Impl : ( ( rule__Box__MaterialAssignment_9_1 ) ) ;
    public final void rule__Box__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2293:1: ( ( ( rule__Box__MaterialAssignment_9_1 ) ) )
            // InternalSceneDsl.g:2294:1: ( ( rule__Box__MaterialAssignment_9_1 ) )
            {
            // InternalSceneDsl.g:2294:1: ( ( rule__Box__MaterialAssignment_9_1 ) )
            // InternalSceneDsl.g:2295:2: ( rule__Box__MaterialAssignment_9_1 )
            {
             before(grammarAccess.getBoxAccess().getMaterialAssignment_9_1()); 
            // InternalSceneDsl.g:2296:2: ( rule__Box__MaterialAssignment_9_1 )
            // InternalSceneDsl.g:2296:3: rule__Box__MaterialAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Box__MaterialAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getMaterialAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_9__1__Impl"


    // $ANTLR start "rule__Cylinder__Group__0"
    // InternalSceneDsl.g:2305:1: rule__Cylinder__Group__0 : rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 ;
    public final void rule__Cylinder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2309:1: ( rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 )
            // InternalSceneDsl.g:2310:2: rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Cylinder__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__0"


    // $ANTLR start "rule__Cylinder__Group__0__Impl"
    // InternalSceneDsl.g:2317:1: rule__Cylinder__Group__0__Impl : ( () ) ;
    public final void rule__Cylinder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2321:1: ( ( () ) )
            // InternalSceneDsl.g:2322:1: ( () )
            {
            // InternalSceneDsl.g:2322:1: ( () )
            // InternalSceneDsl.g:2323:2: ()
            {
             before(grammarAccess.getCylinderAccess().getCylinderAction_0()); 
            // InternalSceneDsl.g:2324:2: ()
            // InternalSceneDsl.g:2324:3: 
            {
            }

             after(grammarAccess.getCylinderAccess().getCylinderAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__0__Impl"


    // $ANTLR start "rule__Cylinder__Group__1"
    // InternalSceneDsl.g:2332:1: rule__Cylinder__Group__1 : rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2 ;
    public final void rule__Cylinder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2336:1: ( rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2 )
            // InternalSceneDsl.g:2337:2: rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Cylinder__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__1"


    // $ANTLR start "rule__Cylinder__Group__1__Impl"
    // InternalSceneDsl.g:2344:1: rule__Cylinder__Group__1__Impl : ( 'cylinder' ) ;
    public final void rule__Cylinder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2348:1: ( ( 'cylinder' ) )
            // InternalSceneDsl.g:2349:1: ( 'cylinder' )
            {
            // InternalSceneDsl.g:2349:1: ( 'cylinder' )
            // InternalSceneDsl.g:2350:2: 'cylinder'
            {
             before(grammarAccess.getCylinderAccess().getCylinderKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getCylinderKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__1__Impl"


    // $ANTLR start "rule__Cylinder__Group__2"
    // InternalSceneDsl.g:2359:1: rule__Cylinder__Group__2 : rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3 ;
    public final void rule__Cylinder__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2363:1: ( rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3 )
            // InternalSceneDsl.g:2364:2: rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Cylinder__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__2"


    // $ANTLR start "rule__Cylinder__Group__2__Impl"
    // InternalSceneDsl.g:2371:1: rule__Cylinder__Group__2__Impl : ( ( rule__Cylinder__NameAssignment_2 ) ) ;
    public final void rule__Cylinder__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2375:1: ( ( ( rule__Cylinder__NameAssignment_2 ) ) )
            // InternalSceneDsl.g:2376:1: ( ( rule__Cylinder__NameAssignment_2 ) )
            {
            // InternalSceneDsl.g:2376:1: ( ( rule__Cylinder__NameAssignment_2 ) )
            // InternalSceneDsl.g:2377:2: ( rule__Cylinder__NameAssignment_2 )
            {
             before(grammarAccess.getCylinderAccess().getNameAssignment_2()); 
            // InternalSceneDsl.g:2378:2: ( rule__Cylinder__NameAssignment_2 )
            // InternalSceneDsl.g:2378:3: rule__Cylinder__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCylinderAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__2__Impl"


    // $ANTLR start "rule__Cylinder__Group__3"
    // InternalSceneDsl.g:2386:1: rule__Cylinder__Group__3 : rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4 ;
    public final void rule__Cylinder__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2390:1: ( rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4 )
            // InternalSceneDsl.g:2391:2: rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Cylinder__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__3"


    // $ANTLR start "rule__Cylinder__Group__3__Impl"
    // InternalSceneDsl.g:2398:1: rule__Cylinder__Group__3__Impl : ( '{' ) ;
    public final void rule__Cylinder__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2402:1: ( ( '{' ) )
            // InternalSceneDsl.g:2403:1: ( '{' )
            {
            // InternalSceneDsl.g:2403:1: ( '{' )
            // InternalSceneDsl.g:2404:2: '{'
            {
             before(grammarAccess.getCylinderAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__3__Impl"


    // $ANTLR start "rule__Cylinder__Group__4"
    // InternalSceneDsl.g:2413:1: rule__Cylinder__Group__4 : rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5 ;
    public final void rule__Cylinder__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2417:1: ( rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5 )
            // InternalSceneDsl.g:2418:2: rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Cylinder__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__4"


    // $ANTLR start "rule__Cylinder__Group__4__Impl"
    // InternalSceneDsl.g:2425:1: rule__Cylinder__Group__4__Impl : ( ( rule__Cylinder__Group_4__0 )? ) ;
    public final void rule__Cylinder__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2429:1: ( ( ( rule__Cylinder__Group_4__0 )? ) )
            // InternalSceneDsl.g:2430:1: ( ( rule__Cylinder__Group_4__0 )? )
            {
            // InternalSceneDsl.g:2430:1: ( ( rule__Cylinder__Group_4__0 )? )
            // InternalSceneDsl.g:2431:2: ( rule__Cylinder__Group_4__0 )?
            {
             before(grammarAccess.getCylinderAccess().getGroup_4()); 
            // InternalSceneDsl.g:2432:2: ( rule__Cylinder__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==21) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSceneDsl.g:2432:3: rule__Cylinder__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cylinder__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCylinderAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__4__Impl"


    // $ANTLR start "rule__Cylinder__Group__5"
    // InternalSceneDsl.g:2440:1: rule__Cylinder__Group__5 : rule__Cylinder__Group__5__Impl rule__Cylinder__Group__6 ;
    public final void rule__Cylinder__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2444:1: ( rule__Cylinder__Group__5__Impl rule__Cylinder__Group__6 )
            // InternalSceneDsl.g:2445:2: rule__Cylinder__Group__5__Impl rule__Cylinder__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Cylinder__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__5"


    // $ANTLR start "rule__Cylinder__Group__5__Impl"
    // InternalSceneDsl.g:2452:1: rule__Cylinder__Group__5__Impl : ( ( rule__Cylinder__Group_5__0 )? ) ;
    public final void rule__Cylinder__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2456:1: ( ( ( rule__Cylinder__Group_5__0 )? ) )
            // InternalSceneDsl.g:2457:1: ( ( rule__Cylinder__Group_5__0 )? )
            {
            // InternalSceneDsl.g:2457:1: ( ( rule__Cylinder__Group_5__0 )? )
            // InternalSceneDsl.g:2458:2: ( rule__Cylinder__Group_5__0 )?
            {
             before(grammarAccess.getCylinderAccess().getGroup_5()); 
            // InternalSceneDsl.g:2459:2: ( rule__Cylinder__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSceneDsl.g:2459:3: rule__Cylinder__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cylinder__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCylinderAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__5__Impl"


    // $ANTLR start "rule__Cylinder__Group__6"
    // InternalSceneDsl.g:2467:1: rule__Cylinder__Group__6 : rule__Cylinder__Group__6__Impl rule__Cylinder__Group__7 ;
    public final void rule__Cylinder__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2471:1: ( rule__Cylinder__Group__6__Impl rule__Cylinder__Group__7 )
            // InternalSceneDsl.g:2472:2: rule__Cylinder__Group__6__Impl rule__Cylinder__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__Cylinder__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__6"


    // $ANTLR start "rule__Cylinder__Group__6__Impl"
    // InternalSceneDsl.g:2479:1: rule__Cylinder__Group__6__Impl : ( ( rule__Cylinder__Group_6__0 )? ) ;
    public final void rule__Cylinder__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2483:1: ( ( ( rule__Cylinder__Group_6__0 )? ) )
            // InternalSceneDsl.g:2484:1: ( ( rule__Cylinder__Group_6__0 )? )
            {
            // InternalSceneDsl.g:2484:1: ( ( rule__Cylinder__Group_6__0 )? )
            // InternalSceneDsl.g:2485:2: ( rule__Cylinder__Group_6__0 )?
            {
             before(grammarAccess.getCylinderAccess().getGroup_6()); 
            // InternalSceneDsl.g:2486:2: ( rule__Cylinder__Group_6__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==19) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSceneDsl.g:2486:3: rule__Cylinder__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cylinder__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCylinderAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__6__Impl"


    // $ANTLR start "rule__Cylinder__Group__7"
    // InternalSceneDsl.g:2494:1: rule__Cylinder__Group__7 : rule__Cylinder__Group__7__Impl rule__Cylinder__Group__8 ;
    public final void rule__Cylinder__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2498:1: ( rule__Cylinder__Group__7__Impl rule__Cylinder__Group__8 )
            // InternalSceneDsl.g:2499:2: rule__Cylinder__Group__7__Impl rule__Cylinder__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__Cylinder__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__7"


    // $ANTLR start "rule__Cylinder__Group__7__Impl"
    // InternalSceneDsl.g:2506:1: rule__Cylinder__Group__7__Impl : ( ( rule__Cylinder__Group_7__0 )? ) ;
    public final void rule__Cylinder__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2510:1: ( ( ( rule__Cylinder__Group_7__0 )? ) )
            // InternalSceneDsl.g:2511:1: ( ( rule__Cylinder__Group_7__0 )? )
            {
            // InternalSceneDsl.g:2511:1: ( ( rule__Cylinder__Group_7__0 )? )
            // InternalSceneDsl.g:2512:2: ( rule__Cylinder__Group_7__0 )?
            {
             before(grammarAccess.getCylinderAccess().getGroup_7()); 
            // InternalSceneDsl.g:2513:2: ( rule__Cylinder__Group_7__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==22) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSceneDsl.g:2513:3: rule__Cylinder__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cylinder__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCylinderAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__7__Impl"


    // $ANTLR start "rule__Cylinder__Group__8"
    // InternalSceneDsl.g:2521:1: rule__Cylinder__Group__8 : rule__Cylinder__Group__8__Impl rule__Cylinder__Group__9 ;
    public final void rule__Cylinder__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2525:1: ( rule__Cylinder__Group__8__Impl rule__Cylinder__Group__9 )
            // InternalSceneDsl.g:2526:2: rule__Cylinder__Group__8__Impl rule__Cylinder__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__Cylinder__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__8"


    // $ANTLR start "rule__Cylinder__Group__8__Impl"
    // InternalSceneDsl.g:2533:1: rule__Cylinder__Group__8__Impl : ( ( rule__Cylinder__Group_8__0 )? ) ;
    public final void rule__Cylinder__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2537:1: ( ( ( rule__Cylinder__Group_8__0 )? ) )
            // InternalSceneDsl.g:2538:1: ( ( rule__Cylinder__Group_8__0 )? )
            {
            // InternalSceneDsl.g:2538:1: ( ( rule__Cylinder__Group_8__0 )? )
            // InternalSceneDsl.g:2539:2: ( rule__Cylinder__Group_8__0 )?
            {
             before(grammarAccess.getCylinderAccess().getGroup_8()); 
            // InternalSceneDsl.g:2540:2: ( rule__Cylinder__Group_8__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSceneDsl.g:2540:3: rule__Cylinder__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cylinder__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCylinderAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__8__Impl"


    // $ANTLR start "rule__Cylinder__Group__9"
    // InternalSceneDsl.g:2548:1: rule__Cylinder__Group__9 : rule__Cylinder__Group__9__Impl ;
    public final void rule__Cylinder__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2552:1: ( rule__Cylinder__Group__9__Impl )
            // InternalSceneDsl.g:2553:2: rule__Cylinder__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__9"


    // $ANTLR start "rule__Cylinder__Group__9__Impl"
    // InternalSceneDsl.g:2559:1: rule__Cylinder__Group__9__Impl : ( '}' ) ;
    public final void rule__Cylinder__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2563:1: ( ( '}' ) )
            // InternalSceneDsl.g:2564:1: ( '}' )
            {
            // InternalSceneDsl.g:2564:1: ( '}' )
            // InternalSceneDsl.g:2565:2: '}'
            {
             before(grammarAccess.getCylinderAccess().getRightCurlyBracketKeyword_9()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__9__Impl"


    // $ANTLR start "rule__Cylinder__Group_4__0"
    // InternalSceneDsl.g:2575:1: rule__Cylinder__Group_4__0 : rule__Cylinder__Group_4__0__Impl rule__Cylinder__Group_4__1 ;
    public final void rule__Cylinder__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2579:1: ( rule__Cylinder__Group_4__0__Impl rule__Cylinder__Group_4__1 )
            // InternalSceneDsl.g:2580:2: rule__Cylinder__Group_4__0__Impl rule__Cylinder__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Cylinder__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group_4__0"


    // $ANTLR start "rule__Cylinder__Group_4__0__Impl"
    // InternalSceneDsl.g:2587:1: rule__Cylinder__Group_4__0__Impl : ( 'radius' ) ;
    public final void rule__Cylinder__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2591:1: ( ( 'radius' ) )
            // InternalSceneDsl.g:2592:1: ( 'radius' )
            {
            // InternalSceneDsl.g:2592:1: ( 'radius' )
            // InternalSceneDsl.g:2593:2: 'radius'
            {
             before(grammarAccess.getCylinderAccess().getRadiusKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getRadiusKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group_4__0__Impl"


    // $ANTLR start "rule__Cylinder__Group_4__1"
    // InternalSceneDsl.g:2602:1: rule__Cylinder__Group_4__1 : rule__Cylinder__Group_4__1__Impl ;
    public final void rule__Cylinder__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2606:1: ( rule__Cylinder__Group_4__1__Impl )
            // InternalSceneDsl.g:2607:2: rule__Cylinder__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group_4__1"


    // $ANTLR start "rule__Cylinder__Group_4__1__Impl"
    // InternalSceneDsl.g:2613:1: rule__Cylinder__Group_4__1__Impl : ( ( rule__Cylinder__RadiusAssignment_4_1 ) ) ;
    public final void rule__Cylinder__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2617:1: ( ( ( rule__Cylinder__RadiusAssignment_4_1 ) ) )
            // InternalSceneDsl.g:2618:1: ( ( rule__Cylinder__RadiusAssignment_4_1 ) )
            {
            // InternalSceneDsl.g:2618:1: ( ( rule__Cylinder__RadiusAssignment_4_1 ) )
            // InternalSceneDsl.g:2619:2: ( rule__Cylinder__RadiusAssignment_4_1 )
            {
             before(grammarAccess.getCylinderAccess().getRadiusAssignment_4_1()); 
            // InternalSceneDsl.g:2620:2: ( rule__Cylinder__RadiusAssignment_4_1 )
            // InternalSceneDsl.g:2620:3: rule__Cylinder__RadiusAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__RadiusAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCylinderAccess().getRadiusAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group_4__1__Impl"


    // $ANTLR start "rule__Cylinder__Group_5__0"
    // InternalSceneDsl.g:2629:1: rule__Cylinder__Group_5__0 : rule__Cylinder__Group_5__0__Impl rule__Cylinder__Group_5__1 ;
    public final void rule__Cylinder__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2633:1: ( rule__Cylinder__Group_5__0__Impl rule__Cylinder__Group_5__1 )
            // InternalSceneDsl.g:2634:2: rule__Cylinder__Group_5__0__Impl rule__Cylinder__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__Cylinder__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group_5__0"


    // $ANTLR start "rule__Cylinder__Group_5__0__Impl"
    // InternalSceneDsl.g:2641:1: rule__Cylinder__Group_5__0__Impl : ( 'height' ) ;
    public final void rule__Cylinder__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2645:1: ( ( 'height' ) )
            // InternalSceneDsl.g:2646:1: ( 'height' )
            {
            // InternalSceneDsl.g:2646:1: ( 'height' )
            // InternalSceneDsl.g:2647:2: 'height'
            {
             before(grammarAccess.getCylinderAccess().getHeightKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getHeightKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group_5__0__Impl"


    // $ANTLR start "rule__Cylinder__Group_5__1"
    // InternalSceneDsl.g:2656:1: rule__Cylinder__Group_5__1 : rule__Cylinder__Group_5__1__Impl ;
    public final void rule__Cylinder__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2660:1: ( rule__Cylinder__Group_5__1__Impl )
            // InternalSceneDsl.g:2661:2: rule__Cylinder__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group_5__1"


    // $ANTLR start "rule__Cylinder__Group_5__1__Impl"
    // InternalSceneDsl.g:2667:1: rule__Cylinder__Group_5__1__Impl : ( ( rule__Cylinder__HeightAssignment_5_1 ) ) ;
    public final void rule__Cylinder__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2671:1: ( ( ( rule__Cylinder__HeightAssignment_5_1 ) ) )
            // InternalSceneDsl.g:2672:1: ( ( rule__Cylinder__HeightAssignment_5_1 ) )
            {
            // InternalSceneDsl.g:2672:1: ( ( rule__Cylinder__HeightAssignment_5_1 ) )
            // InternalSceneDsl.g:2673:2: ( rule__Cylinder__HeightAssignment_5_1 )
            {
             before(grammarAccess.getCylinderAccess().getHeightAssignment_5_1()); 
            // InternalSceneDsl.g:2674:2: ( rule__Cylinder__HeightAssignment_5_1 )
            // InternalSceneDsl.g:2674:3: rule__Cylinder__HeightAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__HeightAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCylinderAccess().getHeightAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group_5__1__Impl"


    // $ANTLR start "rule__Cylinder__Group_6__0"
    // InternalSceneDsl.g:2683:1: rule__Cylinder__Group_6__0 : rule__Cylinder__Group_6__0__Impl rule__Cylinder__Group_6__1 ;
    public final void rule__Cylinder__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2687:1: ( rule__Cylinder__Group_6__0__Impl rule__Cylinder__Group_6__1 )
            // InternalSceneDsl.g:2688:2: rule__Cylinder__Group_6__0__Impl rule__Cylinder__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__Cylinder__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group_6__0"


    // $ANTLR start "rule__Cylinder__Group_6__0__Impl"
    // InternalSceneDsl.g:2695:1: rule__Cylinder__Group_6__0__Impl : ( 'placement' ) ;
    public final void rule__Cylinder__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2699:1: ( ( 'placement' ) )
            // InternalSceneDsl.g:2700:1: ( 'placement' )
            {
            // InternalSceneDsl.g:2700:1: ( 'placement' )
            // InternalSceneDsl.g:2701:2: 'placement'
            {
             before(grammarAccess.getCylinderAccess().getPlacementKeyword_6_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getPlacementKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group_6__0__Impl"


    // $ANTLR start "rule__Cylinder__Group_6__1"
    // InternalSceneDsl.g:2710:1: rule__Cylinder__Group_6__1 : rule__Cylinder__Group_6__1__Impl ;
    public final void rule__Cylinder__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2714:1: ( rule__Cylinder__Group_6__1__Impl )
            // InternalSceneDsl.g:2715:2: rule__Cylinder__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group_6__1"


    // $ANTLR start "rule__Cylinder__Group_6__1__Impl"
    // InternalSceneDsl.g:2721:1: rule__Cylinder__Group_6__1__Impl : ( ( rule__Cylinder__PlacementAssignment_6_1 ) ) ;
    public final void rule__Cylinder__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2725:1: ( ( ( rule__Cylinder__PlacementAssignment_6_1 ) ) )
            // InternalSceneDsl.g:2726:1: ( ( rule__Cylinder__PlacementAssignment_6_1 ) )
            {
            // InternalSceneDsl.g:2726:1: ( ( rule__Cylinder__PlacementAssignment_6_1 ) )
            // InternalSceneDsl.g:2727:2: ( rule__Cylinder__PlacementAssignment_6_1 )
            {
             before(grammarAccess.getCylinderAccess().getPlacementAssignment_6_1()); 
            // InternalSceneDsl.g:2728:2: ( rule__Cylinder__PlacementAssignment_6_1 )
            // InternalSceneDsl.g:2728:3: rule__Cylinder__PlacementAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__PlacementAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getCylinderAccess().getPlacementAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group_6__1__Impl"


    // $ANTLR start "rule__Cylinder__Group_7__0"
    // InternalSceneDsl.g:2737:1: rule__Cylinder__Group_7__0 : rule__Cylinder__Group_7__0__Impl rule__Cylinder__Group_7__1 ;
    public final void rule__Cylinder__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2741:1: ( rule__Cylinder__Group_7__0__Impl rule__Cylinder__Group_7__1 )
            // InternalSceneDsl.g:2742:2: rule__Cylinder__Group_7__0__Impl rule__Cylinder__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__Cylinder__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group_7__0"


    // $ANTLR start "rule__Cylinder__Group_7__0__Impl"
    // InternalSceneDsl.g:2749:1: rule__Cylinder__Group_7__0__Impl : ( 'physicparameters' ) ;
    public final void rule__Cylinder__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2753:1: ( ( 'physicparameters' ) )
            // InternalSceneDsl.g:2754:1: ( 'physicparameters' )
            {
            // InternalSceneDsl.g:2754:1: ( 'physicparameters' )
            // InternalSceneDsl.g:2755:2: 'physicparameters'
            {
             before(grammarAccess.getCylinderAccess().getPhysicparametersKeyword_7_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getPhysicparametersKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group_7__0__Impl"


    // $ANTLR start "rule__Cylinder__Group_7__1"
    // InternalSceneDsl.g:2764:1: rule__Cylinder__Group_7__1 : rule__Cylinder__Group_7__1__Impl ;
    public final void rule__Cylinder__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2768:1: ( rule__Cylinder__Group_7__1__Impl )
            // InternalSceneDsl.g:2769:2: rule__Cylinder__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group_7__1"


    // $ANTLR start "rule__Cylinder__Group_7__1__Impl"
    // InternalSceneDsl.g:2775:1: rule__Cylinder__Group_7__1__Impl : ( ( rule__Cylinder__PhysicparametersAssignment_7_1 ) ) ;
    public final void rule__Cylinder__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2779:1: ( ( ( rule__Cylinder__PhysicparametersAssignment_7_1 ) ) )
            // InternalSceneDsl.g:2780:1: ( ( rule__Cylinder__PhysicparametersAssignment_7_1 ) )
            {
            // InternalSceneDsl.g:2780:1: ( ( rule__Cylinder__PhysicparametersAssignment_7_1 ) )
            // InternalSceneDsl.g:2781:2: ( rule__Cylinder__PhysicparametersAssignment_7_1 )
            {
             before(grammarAccess.getCylinderAccess().getPhysicparametersAssignment_7_1()); 
            // InternalSceneDsl.g:2782:2: ( rule__Cylinder__PhysicparametersAssignment_7_1 )
            // InternalSceneDsl.g:2782:3: rule__Cylinder__PhysicparametersAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__PhysicparametersAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getCylinderAccess().getPhysicparametersAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group_7__1__Impl"


    // $ANTLR start "rule__Cylinder__Group_8__0"
    // InternalSceneDsl.g:2791:1: rule__Cylinder__Group_8__0 : rule__Cylinder__Group_8__0__Impl rule__Cylinder__Group_8__1 ;
    public final void rule__Cylinder__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2795:1: ( rule__Cylinder__Group_8__0__Impl rule__Cylinder__Group_8__1 )
            // InternalSceneDsl.g:2796:2: rule__Cylinder__Group_8__0__Impl rule__Cylinder__Group_8__1
            {
            pushFollow(FOLLOW_15);
            rule__Cylinder__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group_8__0"


    // $ANTLR start "rule__Cylinder__Group_8__0__Impl"
    // InternalSceneDsl.g:2803:1: rule__Cylinder__Group_8__0__Impl : ( 'material' ) ;
    public final void rule__Cylinder__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2807:1: ( ( 'material' ) )
            // InternalSceneDsl.g:2808:1: ( 'material' )
            {
            // InternalSceneDsl.g:2808:1: ( 'material' )
            // InternalSceneDsl.g:2809:2: 'material'
            {
             before(grammarAccess.getCylinderAccess().getMaterialKeyword_8_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getMaterialKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group_8__0__Impl"


    // $ANTLR start "rule__Cylinder__Group_8__1"
    // InternalSceneDsl.g:2818:1: rule__Cylinder__Group_8__1 : rule__Cylinder__Group_8__1__Impl ;
    public final void rule__Cylinder__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2822:1: ( rule__Cylinder__Group_8__1__Impl )
            // InternalSceneDsl.g:2823:2: rule__Cylinder__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group_8__1"


    // $ANTLR start "rule__Cylinder__Group_8__1__Impl"
    // InternalSceneDsl.g:2829:1: rule__Cylinder__Group_8__1__Impl : ( ( rule__Cylinder__MaterialAssignment_8_1 ) ) ;
    public final void rule__Cylinder__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2833:1: ( ( ( rule__Cylinder__MaterialAssignment_8_1 ) ) )
            // InternalSceneDsl.g:2834:1: ( ( rule__Cylinder__MaterialAssignment_8_1 ) )
            {
            // InternalSceneDsl.g:2834:1: ( ( rule__Cylinder__MaterialAssignment_8_1 ) )
            // InternalSceneDsl.g:2835:2: ( rule__Cylinder__MaterialAssignment_8_1 )
            {
             before(grammarAccess.getCylinderAccess().getMaterialAssignment_8_1()); 
            // InternalSceneDsl.g:2836:2: ( rule__Cylinder__MaterialAssignment_8_1 )
            // InternalSceneDsl.g:2836:3: rule__Cylinder__MaterialAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__MaterialAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getCylinderAccess().getMaterialAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group_8__1__Impl"


    // $ANTLR start "rule__Floor__Group__0"
    // InternalSceneDsl.g:2845:1: rule__Floor__Group__0 : rule__Floor__Group__0__Impl rule__Floor__Group__1 ;
    public final void rule__Floor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2849:1: ( rule__Floor__Group__0__Impl rule__Floor__Group__1 )
            // InternalSceneDsl.g:2850:2: rule__Floor__Group__0__Impl rule__Floor__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Floor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__0"


    // $ANTLR start "rule__Floor__Group__0__Impl"
    // InternalSceneDsl.g:2857:1: rule__Floor__Group__0__Impl : ( () ) ;
    public final void rule__Floor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2861:1: ( ( () ) )
            // InternalSceneDsl.g:2862:1: ( () )
            {
            // InternalSceneDsl.g:2862:1: ( () )
            // InternalSceneDsl.g:2863:2: ()
            {
             before(grammarAccess.getFloorAccess().getFloorAction_0()); 
            // InternalSceneDsl.g:2864:2: ()
            // InternalSceneDsl.g:2864:3: 
            {
            }

             after(grammarAccess.getFloorAccess().getFloorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__0__Impl"


    // $ANTLR start "rule__Floor__Group__1"
    // InternalSceneDsl.g:2872:1: rule__Floor__Group__1 : rule__Floor__Group__1__Impl rule__Floor__Group__2 ;
    public final void rule__Floor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2876:1: ( rule__Floor__Group__1__Impl rule__Floor__Group__2 )
            // InternalSceneDsl.g:2877:2: rule__Floor__Group__1__Impl rule__Floor__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Floor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__1"


    // $ANTLR start "rule__Floor__Group__1__Impl"
    // InternalSceneDsl.g:2884:1: rule__Floor__Group__1__Impl : ( 'floor' ) ;
    public final void rule__Floor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2888:1: ( ( 'floor' ) )
            // InternalSceneDsl.g:2889:1: ( 'floor' )
            {
            // InternalSceneDsl.g:2889:1: ( 'floor' )
            // InternalSceneDsl.g:2890:2: 'floor'
            {
             before(grammarAccess.getFloorAccess().getFloorKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getFloorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__1__Impl"


    // $ANTLR start "rule__Floor__Group__2"
    // InternalSceneDsl.g:2899:1: rule__Floor__Group__2 : rule__Floor__Group__2__Impl rule__Floor__Group__3 ;
    public final void rule__Floor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2903:1: ( rule__Floor__Group__2__Impl rule__Floor__Group__3 )
            // InternalSceneDsl.g:2904:2: rule__Floor__Group__2__Impl rule__Floor__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Floor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__2"


    // $ANTLR start "rule__Floor__Group__2__Impl"
    // InternalSceneDsl.g:2911:1: rule__Floor__Group__2__Impl : ( ( rule__Floor__NameAssignment_2 ) ) ;
    public final void rule__Floor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2915:1: ( ( ( rule__Floor__NameAssignment_2 ) ) )
            // InternalSceneDsl.g:2916:1: ( ( rule__Floor__NameAssignment_2 ) )
            {
            // InternalSceneDsl.g:2916:1: ( ( rule__Floor__NameAssignment_2 ) )
            // InternalSceneDsl.g:2917:2: ( rule__Floor__NameAssignment_2 )
            {
             before(grammarAccess.getFloorAccess().getNameAssignment_2()); 
            // InternalSceneDsl.g:2918:2: ( rule__Floor__NameAssignment_2 )
            // InternalSceneDsl.g:2918:3: rule__Floor__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Floor__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFloorAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__2__Impl"


    // $ANTLR start "rule__Floor__Group__3"
    // InternalSceneDsl.g:2926:1: rule__Floor__Group__3 : rule__Floor__Group__3__Impl rule__Floor__Group__4 ;
    public final void rule__Floor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2930:1: ( rule__Floor__Group__3__Impl rule__Floor__Group__4 )
            // InternalSceneDsl.g:2931:2: rule__Floor__Group__3__Impl rule__Floor__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Floor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__3"


    // $ANTLR start "rule__Floor__Group__3__Impl"
    // InternalSceneDsl.g:2938:1: rule__Floor__Group__3__Impl : ( '{' ) ;
    public final void rule__Floor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2942:1: ( ( '{' ) )
            // InternalSceneDsl.g:2943:1: ( '{' )
            {
            // InternalSceneDsl.g:2943:1: ( '{' )
            // InternalSceneDsl.g:2944:2: '{'
            {
             before(grammarAccess.getFloorAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__3__Impl"


    // $ANTLR start "rule__Floor__Group__4"
    // InternalSceneDsl.g:2953:1: rule__Floor__Group__4 : rule__Floor__Group__4__Impl rule__Floor__Group__5 ;
    public final void rule__Floor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2957:1: ( rule__Floor__Group__4__Impl rule__Floor__Group__5 )
            // InternalSceneDsl.g:2958:2: rule__Floor__Group__4__Impl rule__Floor__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Floor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__4"


    // $ANTLR start "rule__Floor__Group__4__Impl"
    // InternalSceneDsl.g:2965:1: rule__Floor__Group__4__Impl : ( ( rule__Floor__Group_4__0 )? ) ;
    public final void rule__Floor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2969:1: ( ( ( rule__Floor__Group_4__0 )? ) )
            // InternalSceneDsl.g:2970:1: ( ( rule__Floor__Group_4__0 )? )
            {
            // InternalSceneDsl.g:2970:1: ( ( rule__Floor__Group_4__0 )? )
            // InternalSceneDsl.g:2971:2: ( rule__Floor__Group_4__0 )?
            {
             before(grammarAccess.getFloorAccess().getGroup_4()); 
            // InternalSceneDsl.g:2972:2: ( rule__Floor__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==19) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSceneDsl.g:2972:3: rule__Floor__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Floor__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFloorAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__4__Impl"


    // $ANTLR start "rule__Floor__Group__5"
    // InternalSceneDsl.g:2980:1: rule__Floor__Group__5 : rule__Floor__Group__5__Impl rule__Floor__Group__6 ;
    public final void rule__Floor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2984:1: ( rule__Floor__Group__5__Impl rule__Floor__Group__6 )
            // InternalSceneDsl.g:2985:2: rule__Floor__Group__5__Impl rule__Floor__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Floor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__5"


    // $ANTLR start "rule__Floor__Group__5__Impl"
    // InternalSceneDsl.g:2992:1: rule__Floor__Group__5__Impl : ( ( rule__Floor__Group_5__0 )? ) ;
    public final void rule__Floor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:2996:1: ( ( ( rule__Floor__Group_5__0 )? ) )
            // InternalSceneDsl.g:2997:1: ( ( rule__Floor__Group_5__0 )? )
            {
            // InternalSceneDsl.g:2997:1: ( ( rule__Floor__Group_5__0 )? )
            // InternalSceneDsl.g:2998:2: ( rule__Floor__Group_5__0 )?
            {
             before(grammarAccess.getFloorAccess().getGroup_5()); 
            // InternalSceneDsl.g:2999:2: ( rule__Floor__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==22) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSceneDsl.g:2999:3: rule__Floor__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Floor__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFloorAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__5__Impl"


    // $ANTLR start "rule__Floor__Group__6"
    // InternalSceneDsl.g:3007:1: rule__Floor__Group__6 : rule__Floor__Group__6__Impl rule__Floor__Group__7 ;
    public final void rule__Floor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3011:1: ( rule__Floor__Group__6__Impl rule__Floor__Group__7 )
            // InternalSceneDsl.g:3012:2: rule__Floor__Group__6__Impl rule__Floor__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Floor__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__6"


    // $ANTLR start "rule__Floor__Group__6__Impl"
    // InternalSceneDsl.g:3019:1: rule__Floor__Group__6__Impl : ( ( rule__Floor__Group_6__0 )? ) ;
    public final void rule__Floor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3023:1: ( ( ( rule__Floor__Group_6__0 )? ) )
            // InternalSceneDsl.g:3024:1: ( ( rule__Floor__Group_6__0 )? )
            {
            // InternalSceneDsl.g:3024:1: ( ( rule__Floor__Group_6__0 )? )
            // InternalSceneDsl.g:3025:2: ( rule__Floor__Group_6__0 )?
            {
             before(grammarAccess.getFloorAccess().getGroup_6()); 
            // InternalSceneDsl.g:3026:2: ( rule__Floor__Group_6__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSceneDsl.g:3026:3: rule__Floor__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Floor__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFloorAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__6__Impl"


    // $ANTLR start "rule__Floor__Group__7"
    // InternalSceneDsl.g:3034:1: rule__Floor__Group__7 : rule__Floor__Group__7__Impl ;
    public final void rule__Floor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3038:1: ( rule__Floor__Group__7__Impl )
            // InternalSceneDsl.g:3039:2: rule__Floor__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Floor__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__7"


    // $ANTLR start "rule__Floor__Group__7__Impl"
    // InternalSceneDsl.g:3045:1: rule__Floor__Group__7__Impl : ( '}' ) ;
    public final void rule__Floor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3049:1: ( ( '}' ) )
            // InternalSceneDsl.g:3050:1: ( '}' )
            {
            // InternalSceneDsl.g:3050:1: ( '}' )
            // InternalSceneDsl.g:3051:2: '}'
            {
             before(grammarAccess.getFloorAccess().getRightCurlyBracketKeyword_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__7__Impl"


    // $ANTLR start "rule__Floor__Group_4__0"
    // InternalSceneDsl.g:3061:1: rule__Floor__Group_4__0 : rule__Floor__Group_4__0__Impl rule__Floor__Group_4__1 ;
    public final void rule__Floor__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3065:1: ( rule__Floor__Group_4__0__Impl rule__Floor__Group_4__1 )
            // InternalSceneDsl.g:3066:2: rule__Floor__Group_4__0__Impl rule__Floor__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Floor__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group_4__0"


    // $ANTLR start "rule__Floor__Group_4__0__Impl"
    // InternalSceneDsl.g:3073:1: rule__Floor__Group_4__0__Impl : ( 'placement' ) ;
    public final void rule__Floor__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3077:1: ( ( 'placement' ) )
            // InternalSceneDsl.g:3078:1: ( 'placement' )
            {
            // InternalSceneDsl.g:3078:1: ( 'placement' )
            // InternalSceneDsl.g:3079:2: 'placement'
            {
             before(grammarAccess.getFloorAccess().getPlacementKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getPlacementKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group_4__0__Impl"


    // $ANTLR start "rule__Floor__Group_4__1"
    // InternalSceneDsl.g:3088:1: rule__Floor__Group_4__1 : rule__Floor__Group_4__1__Impl ;
    public final void rule__Floor__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3092:1: ( rule__Floor__Group_4__1__Impl )
            // InternalSceneDsl.g:3093:2: rule__Floor__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Floor__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group_4__1"


    // $ANTLR start "rule__Floor__Group_4__1__Impl"
    // InternalSceneDsl.g:3099:1: rule__Floor__Group_4__1__Impl : ( ( rule__Floor__PlacementAssignment_4_1 ) ) ;
    public final void rule__Floor__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3103:1: ( ( ( rule__Floor__PlacementAssignment_4_1 ) ) )
            // InternalSceneDsl.g:3104:1: ( ( rule__Floor__PlacementAssignment_4_1 ) )
            {
            // InternalSceneDsl.g:3104:1: ( ( rule__Floor__PlacementAssignment_4_1 ) )
            // InternalSceneDsl.g:3105:2: ( rule__Floor__PlacementAssignment_4_1 )
            {
             before(grammarAccess.getFloorAccess().getPlacementAssignment_4_1()); 
            // InternalSceneDsl.g:3106:2: ( rule__Floor__PlacementAssignment_4_1 )
            // InternalSceneDsl.g:3106:3: rule__Floor__PlacementAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Floor__PlacementAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFloorAccess().getPlacementAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group_4__1__Impl"


    // $ANTLR start "rule__Floor__Group_5__0"
    // InternalSceneDsl.g:3115:1: rule__Floor__Group_5__0 : rule__Floor__Group_5__0__Impl rule__Floor__Group_5__1 ;
    public final void rule__Floor__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3119:1: ( rule__Floor__Group_5__0__Impl rule__Floor__Group_5__1 )
            // InternalSceneDsl.g:3120:2: rule__Floor__Group_5__0__Impl rule__Floor__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Floor__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group_5__0"


    // $ANTLR start "rule__Floor__Group_5__0__Impl"
    // InternalSceneDsl.g:3127:1: rule__Floor__Group_5__0__Impl : ( 'physicparameters' ) ;
    public final void rule__Floor__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3131:1: ( ( 'physicparameters' ) )
            // InternalSceneDsl.g:3132:1: ( 'physicparameters' )
            {
            // InternalSceneDsl.g:3132:1: ( 'physicparameters' )
            // InternalSceneDsl.g:3133:2: 'physicparameters'
            {
             before(grammarAccess.getFloorAccess().getPhysicparametersKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getPhysicparametersKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group_5__0__Impl"


    // $ANTLR start "rule__Floor__Group_5__1"
    // InternalSceneDsl.g:3142:1: rule__Floor__Group_5__1 : rule__Floor__Group_5__1__Impl ;
    public final void rule__Floor__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3146:1: ( rule__Floor__Group_5__1__Impl )
            // InternalSceneDsl.g:3147:2: rule__Floor__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Floor__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group_5__1"


    // $ANTLR start "rule__Floor__Group_5__1__Impl"
    // InternalSceneDsl.g:3153:1: rule__Floor__Group_5__1__Impl : ( ( rule__Floor__PhysicparametersAssignment_5_1 ) ) ;
    public final void rule__Floor__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3157:1: ( ( ( rule__Floor__PhysicparametersAssignment_5_1 ) ) )
            // InternalSceneDsl.g:3158:1: ( ( rule__Floor__PhysicparametersAssignment_5_1 ) )
            {
            // InternalSceneDsl.g:3158:1: ( ( rule__Floor__PhysicparametersAssignment_5_1 ) )
            // InternalSceneDsl.g:3159:2: ( rule__Floor__PhysicparametersAssignment_5_1 )
            {
             before(grammarAccess.getFloorAccess().getPhysicparametersAssignment_5_1()); 
            // InternalSceneDsl.g:3160:2: ( rule__Floor__PhysicparametersAssignment_5_1 )
            // InternalSceneDsl.g:3160:3: rule__Floor__PhysicparametersAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Floor__PhysicparametersAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFloorAccess().getPhysicparametersAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group_5__1__Impl"


    // $ANTLR start "rule__Floor__Group_6__0"
    // InternalSceneDsl.g:3169:1: rule__Floor__Group_6__0 : rule__Floor__Group_6__0__Impl rule__Floor__Group_6__1 ;
    public final void rule__Floor__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3173:1: ( rule__Floor__Group_6__0__Impl rule__Floor__Group_6__1 )
            // InternalSceneDsl.g:3174:2: rule__Floor__Group_6__0__Impl rule__Floor__Group_6__1
            {
            pushFollow(FOLLOW_15);
            rule__Floor__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group_6__0"


    // $ANTLR start "rule__Floor__Group_6__0__Impl"
    // InternalSceneDsl.g:3181:1: rule__Floor__Group_6__0__Impl : ( 'material' ) ;
    public final void rule__Floor__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3185:1: ( ( 'material' ) )
            // InternalSceneDsl.g:3186:1: ( 'material' )
            {
            // InternalSceneDsl.g:3186:1: ( 'material' )
            // InternalSceneDsl.g:3187:2: 'material'
            {
             before(grammarAccess.getFloorAccess().getMaterialKeyword_6_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getMaterialKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group_6__0__Impl"


    // $ANTLR start "rule__Floor__Group_6__1"
    // InternalSceneDsl.g:3196:1: rule__Floor__Group_6__1 : rule__Floor__Group_6__1__Impl ;
    public final void rule__Floor__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3200:1: ( rule__Floor__Group_6__1__Impl )
            // InternalSceneDsl.g:3201:2: rule__Floor__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Floor__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group_6__1"


    // $ANTLR start "rule__Floor__Group_6__1__Impl"
    // InternalSceneDsl.g:3207:1: rule__Floor__Group_6__1__Impl : ( ( rule__Floor__MaterialAssignment_6_1 ) ) ;
    public final void rule__Floor__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3211:1: ( ( ( rule__Floor__MaterialAssignment_6_1 ) ) )
            // InternalSceneDsl.g:3212:1: ( ( rule__Floor__MaterialAssignment_6_1 ) )
            {
            // InternalSceneDsl.g:3212:1: ( ( rule__Floor__MaterialAssignment_6_1 ) )
            // InternalSceneDsl.g:3213:2: ( rule__Floor__MaterialAssignment_6_1 )
            {
             before(grammarAccess.getFloorAccess().getMaterialAssignment_6_1()); 
            // InternalSceneDsl.g:3214:2: ( rule__Floor__MaterialAssignment_6_1 )
            // InternalSceneDsl.g:3214:3: rule__Floor__MaterialAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Floor__MaterialAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getFloorAccess().getMaterialAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group_6__1__Impl"


    // $ANTLR start "rule__WallElement__Group__0"
    // InternalSceneDsl.g:3223:1: rule__WallElement__Group__0 : rule__WallElement__Group__0__Impl rule__WallElement__Group__1 ;
    public final void rule__WallElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3227:1: ( rule__WallElement__Group__0__Impl rule__WallElement__Group__1 )
            // InternalSceneDsl.g:3228:2: rule__WallElement__Group__0__Impl rule__WallElement__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__WallElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WallElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group__0"


    // $ANTLR start "rule__WallElement__Group__0__Impl"
    // InternalSceneDsl.g:3235:1: rule__WallElement__Group__0__Impl : ( () ) ;
    public final void rule__WallElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3239:1: ( ( () ) )
            // InternalSceneDsl.g:3240:1: ( () )
            {
            // InternalSceneDsl.g:3240:1: ( () )
            // InternalSceneDsl.g:3241:2: ()
            {
             before(grammarAccess.getWallElementAccess().getWallElementAction_0()); 
            // InternalSceneDsl.g:3242:2: ()
            // InternalSceneDsl.g:3242:3: 
            {
            }

             after(grammarAccess.getWallElementAccess().getWallElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group__0__Impl"


    // $ANTLR start "rule__WallElement__Group__1"
    // InternalSceneDsl.g:3250:1: rule__WallElement__Group__1 : rule__WallElement__Group__1__Impl rule__WallElement__Group__2 ;
    public final void rule__WallElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3254:1: ( rule__WallElement__Group__1__Impl rule__WallElement__Group__2 )
            // InternalSceneDsl.g:3255:2: rule__WallElement__Group__1__Impl rule__WallElement__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__WallElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WallElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group__1"


    // $ANTLR start "rule__WallElement__Group__1__Impl"
    // InternalSceneDsl.g:3262:1: rule__WallElement__Group__1__Impl : ( 'wall' ) ;
    public final void rule__WallElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3266:1: ( ( 'wall' ) )
            // InternalSceneDsl.g:3267:1: ( 'wall' )
            {
            // InternalSceneDsl.g:3267:1: ( 'wall' )
            // InternalSceneDsl.g:3268:2: 'wall'
            {
             before(grammarAccess.getWallElementAccess().getWallKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getWallElementAccess().getWallKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group__1__Impl"


    // $ANTLR start "rule__WallElement__Group__2"
    // InternalSceneDsl.g:3277:1: rule__WallElement__Group__2 : rule__WallElement__Group__2__Impl rule__WallElement__Group__3 ;
    public final void rule__WallElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3281:1: ( rule__WallElement__Group__2__Impl rule__WallElement__Group__3 )
            // InternalSceneDsl.g:3282:2: rule__WallElement__Group__2__Impl rule__WallElement__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__WallElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WallElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group__2"


    // $ANTLR start "rule__WallElement__Group__2__Impl"
    // InternalSceneDsl.g:3289:1: rule__WallElement__Group__2__Impl : ( ( rule__WallElement__NameAssignment_2 ) ) ;
    public final void rule__WallElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3293:1: ( ( ( rule__WallElement__NameAssignment_2 ) ) )
            // InternalSceneDsl.g:3294:1: ( ( rule__WallElement__NameAssignment_2 ) )
            {
            // InternalSceneDsl.g:3294:1: ( ( rule__WallElement__NameAssignment_2 ) )
            // InternalSceneDsl.g:3295:2: ( rule__WallElement__NameAssignment_2 )
            {
             before(grammarAccess.getWallElementAccess().getNameAssignment_2()); 
            // InternalSceneDsl.g:3296:2: ( rule__WallElement__NameAssignment_2 )
            // InternalSceneDsl.g:3296:3: rule__WallElement__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WallElement__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWallElementAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group__2__Impl"


    // $ANTLR start "rule__WallElement__Group__3"
    // InternalSceneDsl.g:3304:1: rule__WallElement__Group__3 : rule__WallElement__Group__3__Impl rule__WallElement__Group__4 ;
    public final void rule__WallElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3308:1: ( rule__WallElement__Group__3__Impl rule__WallElement__Group__4 )
            // InternalSceneDsl.g:3309:2: rule__WallElement__Group__3__Impl rule__WallElement__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__WallElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WallElement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group__3"


    // $ANTLR start "rule__WallElement__Group__3__Impl"
    // InternalSceneDsl.g:3316:1: rule__WallElement__Group__3__Impl : ( '{' ) ;
    public final void rule__WallElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3320:1: ( ( '{' ) )
            // InternalSceneDsl.g:3321:1: ( '{' )
            {
            // InternalSceneDsl.g:3321:1: ( '{' )
            // InternalSceneDsl.g:3322:2: '{'
            {
             before(grammarAccess.getWallElementAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getWallElementAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group__3__Impl"


    // $ANTLR start "rule__WallElement__Group__4"
    // InternalSceneDsl.g:3331:1: rule__WallElement__Group__4 : rule__WallElement__Group__4__Impl rule__WallElement__Group__5 ;
    public final void rule__WallElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3335:1: ( rule__WallElement__Group__4__Impl rule__WallElement__Group__5 )
            // InternalSceneDsl.g:3336:2: rule__WallElement__Group__4__Impl rule__WallElement__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__WallElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WallElement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group__4"


    // $ANTLR start "rule__WallElement__Group__4__Impl"
    // InternalSceneDsl.g:3343:1: rule__WallElement__Group__4__Impl : ( ( rule__WallElement__Group_4__0 )? ) ;
    public final void rule__WallElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3347:1: ( ( ( rule__WallElement__Group_4__0 )? ) )
            // InternalSceneDsl.g:3348:1: ( ( rule__WallElement__Group_4__0 )? )
            {
            // InternalSceneDsl.g:3348:1: ( ( rule__WallElement__Group_4__0 )? )
            // InternalSceneDsl.g:3349:2: ( rule__WallElement__Group_4__0 )?
            {
             before(grammarAccess.getWallElementAccess().getGroup_4()); 
            // InternalSceneDsl.g:3350:2: ( rule__WallElement__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==25) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSceneDsl.g:3350:3: rule__WallElement__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WallElement__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWallElementAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group__4__Impl"


    // $ANTLR start "rule__WallElement__Group__5"
    // InternalSceneDsl.g:3358:1: rule__WallElement__Group__5 : rule__WallElement__Group__5__Impl rule__WallElement__Group__6 ;
    public final void rule__WallElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3362:1: ( rule__WallElement__Group__5__Impl rule__WallElement__Group__6 )
            // InternalSceneDsl.g:3363:2: rule__WallElement__Group__5__Impl rule__WallElement__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__WallElement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WallElement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group__5"


    // $ANTLR start "rule__WallElement__Group__5__Impl"
    // InternalSceneDsl.g:3370:1: rule__WallElement__Group__5__Impl : ( ( rule__WallElement__Group_5__0 )? ) ;
    public final void rule__WallElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3374:1: ( ( ( rule__WallElement__Group_5__0 )? ) )
            // InternalSceneDsl.g:3375:1: ( ( rule__WallElement__Group_5__0 )? )
            {
            // InternalSceneDsl.g:3375:1: ( ( rule__WallElement__Group_5__0 )? )
            // InternalSceneDsl.g:3376:2: ( rule__WallElement__Group_5__0 )?
            {
             before(grammarAccess.getWallElementAccess().getGroup_5()); 
            // InternalSceneDsl.g:3377:2: ( rule__WallElement__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSceneDsl.g:3377:3: rule__WallElement__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WallElement__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWallElementAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group__5__Impl"


    // $ANTLR start "rule__WallElement__Group__6"
    // InternalSceneDsl.g:3385:1: rule__WallElement__Group__6 : rule__WallElement__Group__6__Impl rule__WallElement__Group__7 ;
    public final void rule__WallElement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3389:1: ( rule__WallElement__Group__6__Impl rule__WallElement__Group__7 )
            // InternalSceneDsl.g:3390:2: rule__WallElement__Group__6__Impl rule__WallElement__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__WallElement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WallElement__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group__6"


    // $ANTLR start "rule__WallElement__Group__6__Impl"
    // InternalSceneDsl.g:3397:1: rule__WallElement__Group__6__Impl : ( ( rule__WallElement__Group_6__0 )? ) ;
    public final void rule__WallElement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3401:1: ( ( ( rule__WallElement__Group_6__0 )? ) )
            // InternalSceneDsl.g:3402:1: ( ( rule__WallElement__Group_6__0 )? )
            {
            // InternalSceneDsl.g:3402:1: ( ( rule__WallElement__Group_6__0 )? )
            // InternalSceneDsl.g:3403:2: ( rule__WallElement__Group_6__0 )?
            {
             before(grammarAccess.getWallElementAccess().getGroup_6()); 
            // InternalSceneDsl.g:3404:2: ( rule__WallElement__Group_6__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==19) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSceneDsl.g:3404:3: rule__WallElement__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WallElement__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWallElementAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group__6__Impl"


    // $ANTLR start "rule__WallElement__Group__7"
    // InternalSceneDsl.g:3412:1: rule__WallElement__Group__7 : rule__WallElement__Group__7__Impl rule__WallElement__Group__8 ;
    public final void rule__WallElement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3416:1: ( rule__WallElement__Group__7__Impl rule__WallElement__Group__8 )
            // InternalSceneDsl.g:3417:2: rule__WallElement__Group__7__Impl rule__WallElement__Group__8
            {
            pushFollow(FOLLOW_22);
            rule__WallElement__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WallElement__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group__7"


    // $ANTLR start "rule__WallElement__Group__7__Impl"
    // InternalSceneDsl.g:3424:1: rule__WallElement__Group__7__Impl : ( ( rule__WallElement__Group_7__0 )? ) ;
    public final void rule__WallElement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3428:1: ( ( ( rule__WallElement__Group_7__0 )? ) )
            // InternalSceneDsl.g:3429:1: ( ( rule__WallElement__Group_7__0 )? )
            {
            // InternalSceneDsl.g:3429:1: ( ( rule__WallElement__Group_7__0 )? )
            // InternalSceneDsl.g:3430:2: ( rule__WallElement__Group_7__0 )?
            {
             before(grammarAccess.getWallElementAccess().getGroup_7()); 
            // InternalSceneDsl.g:3431:2: ( rule__WallElement__Group_7__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==22) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSceneDsl.g:3431:3: rule__WallElement__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WallElement__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWallElementAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group__7__Impl"


    // $ANTLR start "rule__WallElement__Group__8"
    // InternalSceneDsl.g:3439:1: rule__WallElement__Group__8 : rule__WallElement__Group__8__Impl rule__WallElement__Group__9 ;
    public final void rule__WallElement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3443:1: ( rule__WallElement__Group__8__Impl rule__WallElement__Group__9 )
            // InternalSceneDsl.g:3444:2: rule__WallElement__Group__8__Impl rule__WallElement__Group__9
            {
            pushFollow(FOLLOW_22);
            rule__WallElement__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WallElement__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group__8"


    // $ANTLR start "rule__WallElement__Group__8__Impl"
    // InternalSceneDsl.g:3451:1: rule__WallElement__Group__8__Impl : ( ( rule__WallElement__Group_8__0 )? ) ;
    public final void rule__WallElement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3455:1: ( ( ( rule__WallElement__Group_8__0 )? ) )
            // InternalSceneDsl.g:3456:1: ( ( rule__WallElement__Group_8__0 )? )
            {
            // InternalSceneDsl.g:3456:1: ( ( rule__WallElement__Group_8__0 )? )
            // InternalSceneDsl.g:3457:2: ( rule__WallElement__Group_8__0 )?
            {
             before(grammarAccess.getWallElementAccess().getGroup_8()); 
            // InternalSceneDsl.g:3458:2: ( rule__WallElement__Group_8__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==23) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSceneDsl.g:3458:3: rule__WallElement__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WallElement__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWallElementAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group__8__Impl"


    // $ANTLR start "rule__WallElement__Group__9"
    // InternalSceneDsl.g:3466:1: rule__WallElement__Group__9 : rule__WallElement__Group__9__Impl ;
    public final void rule__WallElement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3470:1: ( rule__WallElement__Group__9__Impl )
            // InternalSceneDsl.g:3471:2: rule__WallElement__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WallElement__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group__9"


    // $ANTLR start "rule__WallElement__Group__9__Impl"
    // InternalSceneDsl.g:3477:1: rule__WallElement__Group__9__Impl : ( '}' ) ;
    public final void rule__WallElement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3481:1: ( ( '}' ) )
            // InternalSceneDsl.g:3482:1: ( '}' )
            {
            // InternalSceneDsl.g:3482:1: ( '}' )
            // InternalSceneDsl.g:3483:2: '}'
            {
             before(grammarAccess.getWallElementAccess().getRightCurlyBracketKeyword_9()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getWallElementAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group__9__Impl"


    // $ANTLR start "rule__WallElement__Group_4__0"
    // InternalSceneDsl.g:3493:1: rule__WallElement__Group_4__0 : rule__WallElement__Group_4__0__Impl rule__WallElement__Group_4__1 ;
    public final void rule__WallElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3497:1: ( rule__WallElement__Group_4__0__Impl rule__WallElement__Group_4__1 )
            // InternalSceneDsl.g:3498:2: rule__WallElement__Group_4__0__Impl rule__WallElement__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__WallElement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WallElement__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group_4__0"


    // $ANTLR start "rule__WallElement__Group_4__0__Impl"
    // InternalSceneDsl.g:3505:1: rule__WallElement__Group_4__0__Impl : ( 'width' ) ;
    public final void rule__WallElement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3509:1: ( ( 'width' ) )
            // InternalSceneDsl.g:3510:1: ( 'width' )
            {
            // InternalSceneDsl.g:3510:1: ( 'width' )
            // InternalSceneDsl.g:3511:2: 'width'
            {
             before(grammarAccess.getWallElementAccess().getWidthKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getWallElementAccess().getWidthKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group_4__0__Impl"


    // $ANTLR start "rule__WallElement__Group_4__1"
    // InternalSceneDsl.g:3520:1: rule__WallElement__Group_4__1 : rule__WallElement__Group_4__1__Impl ;
    public final void rule__WallElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3524:1: ( rule__WallElement__Group_4__1__Impl )
            // InternalSceneDsl.g:3525:2: rule__WallElement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WallElement__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group_4__1"


    // $ANTLR start "rule__WallElement__Group_4__1__Impl"
    // InternalSceneDsl.g:3531:1: rule__WallElement__Group_4__1__Impl : ( ( rule__WallElement__WidthAssignment_4_1 ) ) ;
    public final void rule__WallElement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3535:1: ( ( ( rule__WallElement__WidthAssignment_4_1 ) ) )
            // InternalSceneDsl.g:3536:1: ( ( rule__WallElement__WidthAssignment_4_1 ) )
            {
            // InternalSceneDsl.g:3536:1: ( ( rule__WallElement__WidthAssignment_4_1 ) )
            // InternalSceneDsl.g:3537:2: ( rule__WallElement__WidthAssignment_4_1 )
            {
             before(grammarAccess.getWallElementAccess().getWidthAssignment_4_1()); 
            // InternalSceneDsl.g:3538:2: ( rule__WallElement__WidthAssignment_4_1 )
            // InternalSceneDsl.g:3538:3: rule__WallElement__WidthAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__WallElement__WidthAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getWallElementAccess().getWidthAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group_4__1__Impl"


    // $ANTLR start "rule__WallElement__Group_5__0"
    // InternalSceneDsl.g:3547:1: rule__WallElement__Group_5__0 : rule__WallElement__Group_5__0__Impl rule__WallElement__Group_5__1 ;
    public final void rule__WallElement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3551:1: ( rule__WallElement__Group_5__0__Impl rule__WallElement__Group_5__1 )
            // InternalSceneDsl.g:3552:2: rule__WallElement__Group_5__0__Impl rule__WallElement__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__WallElement__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WallElement__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group_5__0"


    // $ANTLR start "rule__WallElement__Group_5__0__Impl"
    // InternalSceneDsl.g:3559:1: rule__WallElement__Group_5__0__Impl : ( 'height' ) ;
    public final void rule__WallElement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3563:1: ( ( 'height' ) )
            // InternalSceneDsl.g:3564:1: ( 'height' )
            {
            // InternalSceneDsl.g:3564:1: ( 'height' )
            // InternalSceneDsl.g:3565:2: 'height'
            {
             before(grammarAccess.getWallElementAccess().getHeightKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getWallElementAccess().getHeightKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group_5__0__Impl"


    // $ANTLR start "rule__WallElement__Group_5__1"
    // InternalSceneDsl.g:3574:1: rule__WallElement__Group_5__1 : rule__WallElement__Group_5__1__Impl ;
    public final void rule__WallElement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3578:1: ( rule__WallElement__Group_5__1__Impl )
            // InternalSceneDsl.g:3579:2: rule__WallElement__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WallElement__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group_5__1"


    // $ANTLR start "rule__WallElement__Group_5__1__Impl"
    // InternalSceneDsl.g:3585:1: rule__WallElement__Group_5__1__Impl : ( ( rule__WallElement__HeightAssignment_5_1 ) ) ;
    public final void rule__WallElement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3589:1: ( ( ( rule__WallElement__HeightAssignment_5_1 ) ) )
            // InternalSceneDsl.g:3590:1: ( ( rule__WallElement__HeightAssignment_5_1 ) )
            {
            // InternalSceneDsl.g:3590:1: ( ( rule__WallElement__HeightAssignment_5_1 ) )
            // InternalSceneDsl.g:3591:2: ( rule__WallElement__HeightAssignment_5_1 )
            {
             before(grammarAccess.getWallElementAccess().getHeightAssignment_5_1()); 
            // InternalSceneDsl.g:3592:2: ( rule__WallElement__HeightAssignment_5_1 )
            // InternalSceneDsl.g:3592:3: rule__WallElement__HeightAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__WallElement__HeightAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getWallElementAccess().getHeightAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group_5__1__Impl"


    // $ANTLR start "rule__WallElement__Group_6__0"
    // InternalSceneDsl.g:3601:1: rule__WallElement__Group_6__0 : rule__WallElement__Group_6__0__Impl rule__WallElement__Group_6__1 ;
    public final void rule__WallElement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3605:1: ( rule__WallElement__Group_6__0__Impl rule__WallElement__Group_6__1 )
            // InternalSceneDsl.g:3606:2: rule__WallElement__Group_6__0__Impl rule__WallElement__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__WallElement__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WallElement__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group_6__0"


    // $ANTLR start "rule__WallElement__Group_6__0__Impl"
    // InternalSceneDsl.g:3613:1: rule__WallElement__Group_6__0__Impl : ( 'placement' ) ;
    public final void rule__WallElement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3617:1: ( ( 'placement' ) )
            // InternalSceneDsl.g:3618:1: ( 'placement' )
            {
            // InternalSceneDsl.g:3618:1: ( 'placement' )
            // InternalSceneDsl.g:3619:2: 'placement'
            {
             before(grammarAccess.getWallElementAccess().getPlacementKeyword_6_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWallElementAccess().getPlacementKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group_6__0__Impl"


    // $ANTLR start "rule__WallElement__Group_6__1"
    // InternalSceneDsl.g:3628:1: rule__WallElement__Group_6__1 : rule__WallElement__Group_6__1__Impl ;
    public final void rule__WallElement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3632:1: ( rule__WallElement__Group_6__1__Impl )
            // InternalSceneDsl.g:3633:2: rule__WallElement__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WallElement__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group_6__1"


    // $ANTLR start "rule__WallElement__Group_6__1__Impl"
    // InternalSceneDsl.g:3639:1: rule__WallElement__Group_6__1__Impl : ( ( rule__WallElement__PlacementAssignment_6_1 ) ) ;
    public final void rule__WallElement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3643:1: ( ( ( rule__WallElement__PlacementAssignment_6_1 ) ) )
            // InternalSceneDsl.g:3644:1: ( ( rule__WallElement__PlacementAssignment_6_1 ) )
            {
            // InternalSceneDsl.g:3644:1: ( ( rule__WallElement__PlacementAssignment_6_1 ) )
            // InternalSceneDsl.g:3645:2: ( rule__WallElement__PlacementAssignment_6_1 )
            {
             before(grammarAccess.getWallElementAccess().getPlacementAssignment_6_1()); 
            // InternalSceneDsl.g:3646:2: ( rule__WallElement__PlacementAssignment_6_1 )
            // InternalSceneDsl.g:3646:3: rule__WallElement__PlacementAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__WallElement__PlacementAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getWallElementAccess().getPlacementAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group_6__1__Impl"


    // $ANTLR start "rule__WallElement__Group_7__0"
    // InternalSceneDsl.g:3655:1: rule__WallElement__Group_7__0 : rule__WallElement__Group_7__0__Impl rule__WallElement__Group_7__1 ;
    public final void rule__WallElement__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3659:1: ( rule__WallElement__Group_7__0__Impl rule__WallElement__Group_7__1 )
            // InternalSceneDsl.g:3660:2: rule__WallElement__Group_7__0__Impl rule__WallElement__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__WallElement__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WallElement__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group_7__0"


    // $ANTLR start "rule__WallElement__Group_7__0__Impl"
    // InternalSceneDsl.g:3667:1: rule__WallElement__Group_7__0__Impl : ( 'physicparameters' ) ;
    public final void rule__WallElement__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3671:1: ( ( 'physicparameters' ) )
            // InternalSceneDsl.g:3672:1: ( 'physicparameters' )
            {
            // InternalSceneDsl.g:3672:1: ( 'physicparameters' )
            // InternalSceneDsl.g:3673:2: 'physicparameters'
            {
             before(grammarAccess.getWallElementAccess().getPhysicparametersKeyword_7_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getWallElementAccess().getPhysicparametersKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group_7__0__Impl"


    // $ANTLR start "rule__WallElement__Group_7__1"
    // InternalSceneDsl.g:3682:1: rule__WallElement__Group_7__1 : rule__WallElement__Group_7__1__Impl ;
    public final void rule__WallElement__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3686:1: ( rule__WallElement__Group_7__1__Impl )
            // InternalSceneDsl.g:3687:2: rule__WallElement__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WallElement__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group_7__1"


    // $ANTLR start "rule__WallElement__Group_7__1__Impl"
    // InternalSceneDsl.g:3693:1: rule__WallElement__Group_7__1__Impl : ( ( rule__WallElement__PhysicparametersAssignment_7_1 ) ) ;
    public final void rule__WallElement__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3697:1: ( ( ( rule__WallElement__PhysicparametersAssignment_7_1 ) ) )
            // InternalSceneDsl.g:3698:1: ( ( rule__WallElement__PhysicparametersAssignment_7_1 ) )
            {
            // InternalSceneDsl.g:3698:1: ( ( rule__WallElement__PhysicparametersAssignment_7_1 ) )
            // InternalSceneDsl.g:3699:2: ( rule__WallElement__PhysicparametersAssignment_7_1 )
            {
             before(grammarAccess.getWallElementAccess().getPhysicparametersAssignment_7_1()); 
            // InternalSceneDsl.g:3700:2: ( rule__WallElement__PhysicparametersAssignment_7_1 )
            // InternalSceneDsl.g:3700:3: rule__WallElement__PhysicparametersAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__WallElement__PhysicparametersAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getWallElementAccess().getPhysicparametersAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group_7__1__Impl"


    // $ANTLR start "rule__WallElement__Group_8__0"
    // InternalSceneDsl.g:3709:1: rule__WallElement__Group_8__0 : rule__WallElement__Group_8__0__Impl rule__WallElement__Group_8__1 ;
    public final void rule__WallElement__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3713:1: ( rule__WallElement__Group_8__0__Impl rule__WallElement__Group_8__1 )
            // InternalSceneDsl.g:3714:2: rule__WallElement__Group_8__0__Impl rule__WallElement__Group_8__1
            {
            pushFollow(FOLLOW_15);
            rule__WallElement__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WallElement__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group_8__0"


    // $ANTLR start "rule__WallElement__Group_8__0__Impl"
    // InternalSceneDsl.g:3721:1: rule__WallElement__Group_8__0__Impl : ( 'material' ) ;
    public final void rule__WallElement__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3725:1: ( ( 'material' ) )
            // InternalSceneDsl.g:3726:1: ( 'material' )
            {
            // InternalSceneDsl.g:3726:1: ( 'material' )
            // InternalSceneDsl.g:3727:2: 'material'
            {
             before(grammarAccess.getWallElementAccess().getMaterialKeyword_8_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getWallElementAccess().getMaterialKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group_8__0__Impl"


    // $ANTLR start "rule__WallElement__Group_8__1"
    // InternalSceneDsl.g:3736:1: rule__WallElement__Group_8__1 : rule__WallElement__Group_8__1__Impl ;
    public final void rule__WallElement__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3740:1: ( rule__WallElement__Group_8__1__Impl )
            // InternalSceneDsl.g:3741:2: rule__WallElement__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WallElement__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group_8__1"


    // $ANTLR start "rule__WallElement__Group_8__1__Impl"
    // InternalSceneDsl.g:3747:1: rule__WallElement__Group_8__1__Impl : ( ( rule__WallElement__MaterialAssignment_8_1 ) ) ;
    public final void rule__WallElement__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3751:1: ( ( ( rule__WallElement__MaterialAssignment_8_1 ) ) )
            // InternalSceneDsl.g:3752:1: ( ( rule__WallElement__MaterialAssignment_8_1 ) )
            {
            // InternalSceneDsl.g:3752:1: ( ( rule__WallElement__MaterialAssignment_8_1 ) )
            // InternalSceneDsl.g:3753:2: ( rule__WallElement__MaterialAssignment_8_1 )
            {
             before(grammarAccess.getWallElementAccess().getMaterialAssignment_8_1()); 
            // InternalSceneDsl.g:3754:2: ( rule__WallElement__MaterialAssignment_8_1 )
            // InternalSceneDsl.g:3754:3: rule__WallElement__MaterialAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__WallElement__MaterialAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getWallElementAccess().getMaterialAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__Group_8__1__Impl"


    // $ANTLR start "rule__Placement__Group__0"
    // InternalSceneDsl.g:3763:1: rule__Placement__Group__0 : rule__Placement__Group__0__Impl rule__Placement__Group__1 ;
    public final void rule__Placement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3767:1: ( rule__Placement__Group__0__Impl rule__Placement__Group__1 )
            // InternalSceneDsl.g:3768:2: rule__Placement__Group__0__Impl rule__Placement__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Placement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Placement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group__0"


    // $ANTLR start "rule__Placement__Group__0__Impl"
    // InternalSceneDsl.g:3775:1: rule__Placement__Group__0__Impl : ( () ) ;
    public final void rule__Placement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3779:1: ( ( () ) )
            // InternalSceneDsl.g:3780:1: ( () )
            {
            // InternalSceneDsl.g:3780:1: ( () )
            // InternalSceneDsl.g:3781:2: ()
            {
             before(grammarAccess.getPlacementAccess().getPlacementAction_0()); 
            // InternalSceneDsl.g:3782:2: ()
            // InternalSceneDsl.g:3782:3: 
            {
            }

             after(grammarAccess.getPlacementAccess().getPlacementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group__0__Impl"


    // $ANTLR start "rule__Placement__Group__1"
    // InternalSceneDsl.g:3790:1: rule__Placement__Group__1 : rule__Placement__Group__1__Impl rule__Placement__Group__2 ;
    public final void rule__Placement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3794:1: ( rule__Placement__Group__1__Impl rule__Placement__Group__2 )
            // InternalSceneDsl.g:3795:2: rule__Placement__Group__1__Impl rule__Placement__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Placement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Placement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group__1"


    // $ANTLR start "rule__Placement__Group__1__Impl"
    // InternalSceneDsl.g:3802:1: rule__Placement__Group__1__Impl : ( '{' ) ;
    public final void rule__Placement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3806:1: ( ( '{' ) )
            // InternalSceneDsl.g:3807:1: ( '{' )
            {
            // InternalSceneDsl.g:3807:1: ( '{' )
            // InternalSceneDsl.g:3808:2: '{'
            {
             before(grammarAccess.getPlacementAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPlacementAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group__1__Impl"


    // $ANTLR start "rule__Placement__Group__2"
    // InternalSceneDsl.g:3817:1: rule__Placement__Group__2 : rule__Placement__Group__2__Impl rule__Placement__Group__3 ;
    public final void rule__Placement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3821:1: ( rule__Placement__Group__2__Impl rule__Placement__Group__3 )
            // InternalSceneDsl.g:3822:2: rule__Placement__Group__2__Impl rule__Placement__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Placement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Placement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group__2"


    // $ANTLR start "rule__Placement__Group__2__Impl"
    // InternalSceneDsl.g:3829:1: rule__Placement__Group__2__Impl : ( ( rule__Placement__Group_2__0 )? ) ;
    public final void rule__Placement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3833:1: ( ( ( rule__Placement__Group_2__0 )? ) )
            // InternalSceneDsl.g:3834:1: ( ( rule__Placement__Group_2__0 )? )
            {
            // InternalSceneDsl.g:3834:1: ( ( rule__Placement__Group_2__0 )? )
            // InternalSceneDsl.g:3835:2: ( rule__Placement__Group_2__0 )?
            {
             before(grammarAccess.getPlacementAccess().getGroup_2()); 
            // InternalSceneDsl.g:3836:2: ( rule__Placement__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==31) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSceneDsl.g:3836:3: rule__Placement__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Placement__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlacementAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group__2__Impl"


    // $ANTLR start "rule__Placement__Group__3"
    // InternalSceneDsl.g:3844:1: rule__Placement__Group__3 : rule__Placement__Group__3__Impl rule__Placement__Group__4 ;
    public final void rule__Placement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3848:1: ( rule__Placement__Group__3__Impl rule__Placement__Group__4 )
            // InternalSceneDsl.g:3849:2: rule__Placement__Group__3__Impl rule__Placement__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Placement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Placement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group__3"


    // $ANTLR start "rule__Placement__Group__3__Impl"
    // InternalSceneDsl.g:3856:1: rule__Placement__Group__3__Impl : ( ( rule__Placement__Group_3__0 )? ) ;
    public final void rule__Placement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3860:1: ( ( ( rule__Placement__Group_3__0 )? ) )
            // InternalSceneDsl.g:3861:1: ( ( rule__Placement__Group_3__0 )? )
            {
            // InternalSceneDsl.g:3861:1: ( ( rule__Placement__Group_3__0 )? )
            // InternalSceneDsl.g:3862:2: ( rule__Placement__Group_3__0 )?
            {
             before(grammarAccess.getPlacementAccess().getGroup_3()); 
            // InternalSceneDsl.g:3863:2: ( rule__Placement__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==32) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSceneDsl.g:3863:3: rule__Placement__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Placement__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlacementAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group__3__Impl"


    // $ANTLR start "rule__Placement__Group__4"
    // InternalSceneDsl.g:3871:1: rule__Placement__Group__4 : rule__Placement__Group__4__Impl ;
    public final void rule__Placement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3875:1: ( rule__Placement__Group__4__Impl )
            // InternalSceneDsl.g:3876:2: rule__Placement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Placement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group__4"


    // $ANTLR start "rule__Placement__Group__4__Impl"
    // InternalSceneDsl.g:3882:1: rule__Placement__Group__4__Impl : ( '}' ) ;
    public final void rule__Placement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3886:1: ( ( '}' ) )
            // InternalSceneDsl.g:3887:1: ( '}' )
            {
            // InternalSceneDsl.g:3887:1: ( '}' )
            // InternalSceneDsl.g:3888:2: '}'
            {
             before(grammarAccess.getPlacementAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPlacementAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group__4__Impl"


    // $ANTLR start "rule__Placement__Group_2__0"
    // InternalSceneDsl.g:3898:1: rule__Placement__Group_2__0 : rule__Placement__Group_2__0__Impl rule__Placement__Group_2__1 ;
    public final void rule__Placement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3902:1: ( rule__Placement__Group_2__0__Impl rule__Placement__Group_2__1 )
            // InternalSceneDsl.g:3903:2: rule__Placement__Group_2__0__Impl rule__Placement__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Placement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Placement__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group_2__0"


    // $ANTLR start "rule__Placement__Group_2__0__Impl"
    // InternalSceneDsl.g:3910:1: rule__Placement__Group_2__0__Impl : ( 'position' ) ;
    public final void rule__Placement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3914:1: ( ( 'position' ) )
            // InternalSceneDsl.g:3915:1: ( 'position' )
            {
            // InternalSceneDsl.g:3915:1: ( 'position' )
            // InternalSceneDsl.g:3916:2: 'position'
            {
             before(grammarAccess.getPlacementAccess().getPositionKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPlacementAccess().getPositionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group_2__0__Impl"


    // $ANTLR start "rule__Placement__Group_2__1"
    // InternalSceneDsl.g:3925:1: rule__Placement__Group_2__1 : rule__Placement__Group_2__1__Impl ;
    public final void rule__Placement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3929:1: ( rule__Placement__Group_2__1__Impl )
            // InternalSceneDsl.g:3930:2: rule__Placement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Placement__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group_2__1"


    // $ANTLR start "rule__Placement__Group_2__1__Impl"
    // InternalSceneDsl.g:3936:1: rule__Placement__Group_2__1__Impl : ( ( rule__Placement__PositionAssignment_2_1 ) ) ;
    public final void rule__Placement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3940:1: ( ( ( rule__Placement__PositionAssignment_2_1 ) ) )
            // InternalSceneDsl.g:3941:1: ( ( rule__Placement__PositionAssignment_2_1 ) )
            {
            // InternalSceneDsl.g:3941:1: ( ( rule__Placement__PositionAssignment_2_1 ) )
            // InternalSceneDsl.g:3942:2: ( rule__Placement__PositionAssignment_2_1 )
            {
             before(grammarAccess.getPlacementAccess().getPositionAssignment_2_1()); 
            // InternalSceneDsl.g:3943:2: ( rule__Placement__PositionAssignment_2_1 )
            // InternalSceneDsl.g:3943:3: rule__Placement__PositionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Placement__PositionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPlacementAccess().getPositionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group_2__1__Impl"


    // $ANTLR start "rule__Placement__Group_3__0"
    // InternalSceneDsl.g:3952:1: rule__Placement__Group_3__0 : rule__Placement__Group_3__0__Impl rule__Placement__Group_3__1 ;
    public final void rule__Placement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3956:1: ( rule__Placement__Group_3__0__Impl rule__Placement__Group_3__1 )
            // InternalSceneDsl.g:3957:2: rule__Placement__Group_3__0__Impl rule__Placement__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Placement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Placement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group_3__0"


    // $ANTLR start "rule__Placement__Group_3__0__Impl"
    // InternalSceneDsl.g:3964:1: rule__Placement__Group_3__0__Impl : ( 'rotation' ) ;
    public final void rule__Placement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3968:1: ( ( 'rotation' ) )
            // InternalSceneDsl.g:3969:1: ( 'rotation' )
            {
            // InternalSceneDsl.g:3969:1: ( 'rotation' )
            // InternalSceneDsl.g:3970:2: 'rotation'
            {
             before(grammarAccess.getPlacementAccess().getRotationKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPlacementAccess().getRotationKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group_3__0__Impl"


    // $ANTLR start "rule__Placement__Group_3__1"
    // InternalSceneDsl.g:3979:1: rule__Placement__Group_3__1 : rule__Placement__Group_3__1__Impl ;
    public final void rule__Placement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3983:1: ( rule__Placement__Group_3__1__Impl )
            // InternalSceneDsl.g:3984:2: rule__Placement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Placement__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group_3__1"


    // $ANTLR start "rule__Placement__Group_3__1__Impl"
    // InternalSceneDsl.g:3990:1: rule__Placement__Group_3__1__Impl : ( ( rule__Placement__RotationAssignment_3_1 ) ) ;
    public final void rule__Placement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:3994:1: ( ( ( rule__Placement__RotationAssignment_3_1 ) ) )
            // InternalSceneDsl.g:3995:1: ( ( rule__Placement__RotationAssignment_3_1 ) )
            {
            // InternalSceneDsl.g:3995:1: ( ( rule__Placement__RotationAssignment_3_1 ) )
            // InternalSceneDsl.g:3996:2: ( rule__Placement__RotationAssignment_3_1 )
            {
             before(grammarAccess.getPlacementAccess().getRotationAssignment_3_1()); 
            // InternalSceneDsl.g:3997:2: ( rule__Placement__RotationAssignment_3_1 )
            // InternalSceneDsl.g:3997:3: rule__Placement__RotationAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Placement__RotationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPlacementAccess().getRotationAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group_3__1__Impl"


    // $ANTLR start "rule__Vec3__Group__0"
    // InternalSceneDsl.g:4006:1: rule__Vec3__Group__0 : rule__Vec3__Group__0__Impl rule__Vec3__Group__1 ;
    public final void rule__Vec3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4010:1: ( rule__Vec3__Group__0__Impl rule__Vec3__Group__1 )
            // InternalSceneDsl.g:4011:2: rule__Vec3__Group__0__Impl rule__Vec3__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Vec3__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vec3__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vec3__Group__0"


    // $ANTLR start "rule__Vec3__Group__0__Impl"
    // InternalSceneDsl.g:4018:1: rule__Vec3__Group__0__Impl : ( () ) ;
    public final void rule__Vec3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4022:1: ( ( () ) )
            // InternalSceneDsl.g:4023:1: ( () )
            {
            // InternalSceneDsl.g:4023:1: ( () )
            // InternalSceneDsl.g:4024:2: ()
            {
             before(grammarAccess.getVec3Access().getVec3Action_0()); 
            // InternalSceneDsl.g:4025:2: ()
            // InternalSceneDsl.g:4025:3: 
            {
            }

             after(grammarAccess.getVec3Access().getVec3Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vec3__Group__0__Impl"


    // $ANTLR start "rule__Vec3__Group__1"
    // InternalSceneDsl.g:4033:1: rule__Vec3__Group__1 : rule__Vec3__Group__1__Impl rule__Vec3__Group__2 ;
    public final void rule__Vec3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4037:1: ( rule__Vec3__Group__1__Impl rule__Vec3__Group__2 )
            // InternalSceneDsl.g:4038:2: rule__Vec3__Group__1__Impl rule__Vec3__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Vec3__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vec3__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vec3__Group__1"


    // $ANTLR start "rule__Vec3__Group__1__Impl"
    // InternalSceneDsl.g:4045:1: rule__Vec3__Group__1__Impl : ( '{' ) ;
    public final void rule__Vec3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4049:1: ( ( '{' ) )
            // InternalSceneDsl.g:4050:1: ( '{' )
            {
            // InternalSceneDsl.g:4050:1: ( '{' )
            // InternalSceneDsl.g:4051:2: '{'
            {
             before(grammarAccess.getVec3Access().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getVec3Access().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vec3__Group__1__Impl"


    // $ANTLR start "rule__Vec3__Group__2"
    // InternalSceneDsl.g:4060:1: rule__Vec3__Group__2 : rule__Vec3__Group__2__Impl rule__Vec3__Group__3 ;
    public final void rule__Vec3__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4064:1: ( rule__Vec3__Group__2__Impl rule__Vec3__Group__3 )
            // InternalSceneDsl.g:4065:2: rule__Vec3__Group__2__Impl rule__Vec3__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Vec3__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vec3__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vec3__Group__2"


    // $ANTLR start "rule__Vec3__Group__2__Impl"
    // InternalSceneDsl.g:4072:1: rule__Vec3__Group__2__Impl : ( ( rule__Vec3__Group_2__0 )? ) ;
    public final void rule__Vec3__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4076:1: ( ( ( rule__Vec3__Group_2__0 )? ) )
            // InternalSceneDsl.g:4077:1: ( ( rule__Vec3__Group_2__0 )? )
            {
            // InternalSceneDsl.g:4077:1: ( ( rule__Vec3__Group_2__0 )? )
            // InternalSceneDsl.g:4078:2: ( rule__Vec3__Group_2__0 )?
            {
             before(grammarAccess.getVec3Access().getGroup_2()); 
            // InternalSceneDsl.g:4079:2: ( rule__Vec3__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==33) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSceneDsl.g:4079:3: rule__Vec3__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Vec3__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVec3Access().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vec3__Group__2__Impl"


    // $ANTLR start "rule__Vec3__Group__3"
    // InternalSceneDsl.g:4087:1: rule__Vec3__Group__3 : rule__Vec3__Group__3__Impl rule__Vec3__Group__4 ;
    public final void rule__Vec3__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4091:1: ( rule__Vec3__Group__3__Impl rule__Vec3__Group__4 )
            // InternalSceneDsl.g:4092:2: rule__Vec3__Group__3__Impl rule__Vec3__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Vec3__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vec3__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vec3__Group__3"


    // $ANTLR start "rule__Vec3__Group__3__Impl"
    // InternalSceneDsl.g:4099:1: rule__Vec3__Group__3__Impl : ( ( rule__Vec3__Group_3__0 )? ) ;
    public final void rule__Vec3__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4103:1: ( ( ( rule__Vec3__Group_3__0 )? ) )
            // InternalSceneDsl.g:4104:1: ( ( rule__Vec3__Group_3__0 )? )
            {
            // InternalSceneDsl.g:4104:1: ( ( rule__Vec3__Group_3__0 )? )
            // InternalSceneDsl.g:4105:2: ( rule__Vec3__Group_3__0 )?
            {
             before(grammarAccess.getVec3Access().getGroup_3()); 
            // InternalSceneDsl.g:4106:2: ( rule__Vec3__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==34) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSceneDsl.g:4106:3: rule__Vec3__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Vec3__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVec3Access().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vec3__Group__3__Impl"


    // $ANTLR start "rule__Vec3__Group__4"
    // InternalSceneDsl.g:4114:1: rule__Vec3__Group__4 : rule__Vec3__Group__4__Impl rule__Vec3__Group__5 ;
    public final void rule__Vec3__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4118:1: ( rule__Vec3__Group__4__Impl rule__Vec3__Group__5 )
            // InternalSceneDsl.g:4119:2: rule__Vec3__Group__4__Impl rule__Vec3__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Vec3__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vec3__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vec3__Group__4"


    // $ANTLR start "rule__Vec3__Group__4__Impl"
    // InternalSceneDsl.g:4126:1: rule__Vec3__Group__4__Impl : ( ( rule__Vec3__Group_4__0 )? ) ;
    public final void rule__Vec3__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4130:1: ( ( ( rule__Vec3__Group_4__0 )? ) )
            // InternalSceneDsl.g:4131:1: ( ( rule__Vec3__Group_4__0 )? )
            {
            // InternalSceneDsl.g:4131:1: ( ( rule__Vec3__Group_4__0 )? )
            // InternalSceneDsl.g:4132:2: ( rule__Vec3__Group_4__0 )?
            {
             before(grammarAccess.getVec3Access().getGroup_4()); 
            // InternalSceneDsl.g:4133:2: ( rule__Vec3__Group_4__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==35) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSceneDsl.g:4133:3: rule__Vec3__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Vec3__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVec3Access().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vec3__Group__4__Impl"


    // $ANTLR start "rule__Vec3__Group__5"
    // InternalSceneDsl.g:4141:1: rule__Vec3__Group__5 : rule__Vec3__Group__5__Impl ;
    public final void rule__Vec3__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4145:1: ( rule__Vec3__Group__5__Impl )
            // InternalSceneDsl.g:4146:2: rule__Vec3__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vec3__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vec3__Group__5"


    // $ANTLR start "rule__Vec3__Group__5__Impl"
    // InternalSceneDsl.g:4152:1: rule__Vec3__Group__5__Impl : ( '}' ) ;
    public final void rule__Vec3__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4156:1: ( ( '}' ) )
            // InternalSceneDsl.g:4157:1: ( '}' )
            {
            // InternalSceneDsl.g:4157:1: ( '}' )
            // InternalSceneDsl.g:4158:2: '}'
            {
             before(grammarAccess.getVec3Access().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getVec3Access().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vec3__Group__5__Impl"


    // $ANTLR start "rule__Vec3__Group_2__0"
    // InternalSceneDsl.g:4168:1: rule__Vec3__Group_2__0 : rule__Vec3__Group_2__0__Impl rule__Vec3__Group_2__1 ;
    public final void rule__Vec3__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4172:1: ( rule__Vec3__Group_2__0__Impl rule__Vec3__Group_2__1 )
            // InternalSceneDsl.g:4173:2: rule__Vec3__Group_2__0__Impl rule__Vec3__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__Vec3__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vec3__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vec3__Group_2__0"


    // $ANTLR start "rule__Vec3__Group_2__0__Impl"
    // InternalSceneDsl.g:4180:1: rule__Vec3__Group_2__0__Impl : ( 'x' ) ;
    public final void rule__Vec3__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4184:1: ( ( 'x' ) )
            // InternalSceneDsl.g:4185:1: ( 'x' )
            {
            // InternalSceneDsl.g:4185:1: ( 'x' )
            // InternalSceneDsl.g:4186:2: 'x'
            {
             before(grammarAccess.getVec3Access().getXKeyword_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getVec3Access().getXKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vec3__Group_2__0__Impl"


    // $ANTLR start "rule__Vec3__Group_2__1"
    // InternalSceneDsl.g:4195:1: rule__Vec3__Group_2__1 : rule__Vec3__Group_2__1__Impl ;
    public final void rule__Vec3__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4199:1: ( rule__Vec3__Group_2__1__Impl )
            // InternalSceneDsl.g:4200:2: rule__Vec3__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vec3__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vec3__Group_2__1"


    // $ANTLR start "rule__Vec3__Group_2__1__Impl"
    // InternalSceneDsl.g:4206:1: rule__Vec3__Group_2__1__Impl : ( ( rule__Vec3__XAssignment_2_1 ) ) ;
    public final void rule__Vec3__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4210:1: ( ( ( rule__Vec3__XAssignment_2_1 ) ) )
            // InternalSceneDsl.g:4211:1: ( ( rule__Vec3__XAssignment_2_1 ) )
            {
            // InternalSceneDsl.g:4211:1: ( ( rule__Vec3__XAssignment_2_1 ) )
            // InternalSceneDsl.g:4212:2: ( rule__Vec3__XAssignment_2_1 )
            {
             before(grammarAccess.getVec3Access().getXAssignment_2_1()); 
            // InternalSceneDsl.g:4213:2: ( rule__Vec3__XAssignment_2_1 )
            // InternalSceneDsl.g:4213:3: rule__Vec3__XAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Vec3__XAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVec3Access().getXAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vec3__Group_2__1__Impl"


    // $ANTLR start "rule__Vec3__Group_3__0"
    // InternalSceneDsl.g:4222:1: rule__Vec3__Group_3__0 : rule__Vec3__Group_3__0__Impl rule__Vec3__Group_3__1 ;
    public final void rule__Vec3__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4226:1: ( rule__Vec3__Group_3__0__Impl rule__Vec3__Group_3__1 )
            // InternalSceneDsl.g:4227:2: rule__Vec3__Group_3__0__Impl rule__Vec3__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Vec3__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vec3__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vec3__Group_3__0"


    // $ANTLR start "rule__Vec3__Group_3__0__Impl"
    // InternalSceneDsl.g:4234:1: rule__Vec3__Group_3__0__Impl : ( 'y' ) ;
    public final void rule__Vec3__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4238:1: ( ( 'y' ) )
            // InternalSceneDsl.g:4239:1: ( 'y' )
            {
            // InternalSceneDsl.g:4239:1: ( 'y' )
            // InternalSceneDsl.g:4240:2: 'y'
            {
             before(grammarAccess.getVec3Access().getYKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getVec3Access().getYKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vec3__Group_3__0__Impl"


    // $ANTLR start "rule__Vec3__Group_3__1"
    // InternalSceneDsl.g:4249:1: rule__Vec3__Group_3__1 : rule__Vec3__Group_3__1__Impl ;
    public final void rule__Vec3__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4253:1: ( rule__Vec3__Group_3__1__Impl )
            // InternalSceneDsl.g:4254:2: rule__Vec3__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vec3__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vec3__Group_3__1"


    // $ANTLR start "rule__Vec3__Group_3__1__Impl"
    // InternalSceneDsl.g:4260:1: rule__Vec3__Group_3__1__Impl : ( ( rule__Vec3__YAssignment_3_1 ) ) ;
    public final void rule__Vec3__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4264:1: ( ( ( rule__Vec3__YAssignment_3_1 ) ) )
            // InternalSceneDsl.g:4265:1: ( ( rule__Vec3__YAssignment_3_1 ) )
            {
            // InternalSceneDsl.g:4265:1: ( ( rule__Vec3__YAssignment_3_1 ) )
            // InternalSceneDsl.g:4266:2: ( rule__Vec3__YAssignment_3_1 )
            {
             before(grammarAccess.getVec3Access().getYAssignment_3_1()); 
            // InternalSceneDsl.g:4267:2: ( rule__Vec3__YAssignment_3_1 )
            // InternalSceneDsl.g:4267:3: rule__Vec3__YAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Vec3__YAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVec3Access().getYAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vec3__Group_3__1__Impl"


    // $ANTLR start "rule__Vec3__Group_4__0"
    // InternalSceneDsl.g:4276:1: rule__Vec3__Group_4__0 : rule__Vec3__Group_4__0__Impl rule__Vec3__Group_4__1 ;
    public final void rule__Vec3__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4280:1: ( rule__Vec3__Group_4__0__Impl rule__Vec3__Group_4__1 )
            // InternalSceneDsl.g:4281:2: rule__Vec3__Group_4__0__Impl rule__Vec3__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Vec3__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vec3__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vec3__Group_4__0"


    // $ANTLR start "rule__Vec3__Group_4__0__Impl"
    // InternalSceneDsl.g:4288:1: rule__Vec3__Group_4__0__Impl : ( 'z' ) ;
    public final void rule__Vec3__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4292:1: ( ( 'z' ) )
            // InternalSceneDsl.g:4293:1: ( 'z' )
            {
            // InternalSceneDsl.g:4293:1: ( 'z' )
            // InternalSceneDsl.g:4294:2: 'z'
            {
             before(grammarAccess.getVec3Access().getZKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getVec3Access().getZKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vec3__Group_4__0__Impl"


    // $ANTLR start "rule__Vec3__Group_4__1"
    // InternalSceneDsl.g:4303:1: rule__Vec3__Group_4__1 : rule__Vec3__Group_4__1__Impl ;
    public final void rule__Vec3__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4307:1: ( rule__Vec3__Group_4__1__Impl )
            // InternalSceneDsl.g:4308:2: rule__Vec3__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vec3__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vec3__Group_4__1"


    // $ANTLR start "rule__Vec3__Group_4__1__Impl"
    // InternalSceneDsl.g:4314:1: rule__Vec3__Group_4__1__Impl : ( ( rule__Vec3__ZAssignment_4_1 ) ) ;
    public final void rule__Vec3__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4318:1: ( ( ( rule__Vec3__ZAssignment_4_1 ) ) )
            // InternalSceneDsl.g:4319:1: ( ( rule__Vec3__ZAssignment_4_1 ) )
            {
            // InternalSceneDsl.g:4319:1: ( ( rule__Vec3__ZAssignment_4_1 ) )
            // InternalSceneDsl.g:4320:2: ( rule__Vec3__ZAssignment_4_1 )
            {
             before(grammarAccess.getVec3Access().getZAssignment_4_1()); 
            // InternalSceneDsl.g:4321:2: ( rule__Vec3__ZAssignment_4_1 )
            // InternalSceneDsl.g:4321:3: rule__Vec3__ZAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Vec3__ZAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getVec3Access().getZAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vec3__Group_4__1__Impl"


    // $ANTLR start "rule__Rotation__Group__0"
    // InternalSceneDsl.g:4330:1: rule__Rotation__Group__0 : rule__Rotation__Group__0__Impl rule__Rotation__Group__1 ;
    public final void rule__Rotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4334:1: ( rule__Rotation__Group__0__Impl rule__Rotation__Group__1 )
            // InternalSceneDsl.g:4335:2: rule__Rotation__Group__0__Impl rule__Rotation__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Rotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__0"


    // $ANTLR start "rule__Rotation__Group__0__Impl"
    // InternalSceneDsl.g:4342:1: rule__Rotation__Group__0__Impl : ( () ) ;
    public final void rule__Rotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4346:1: ( ( () ) )
            // InternalSceneDsl.g:4347:1: ( () )
            {
            // InternalSceneDsl.g:4347:1: ( () )
            // InternalSceneDsl.g:4348:2: ()
            {
             before(grammarAccess.getRotationAccess().getRotationAction_0()); 
            // InternalSceneDsl.g:4349:2: ()
            // InternalSceneDsl.g:4349:3: 
            {
            }

             after(grammarAccess.getRotationAccess().getRotationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__0__Impl"


    // $ANTLR start "rule__Rotation__Group__1"
    // InternalSceneDsl.g:4357:1: rule__Rotation__Group__1 : rule__Rotation__Group__1__Impl rule__Rotation__Group__2 ;
    public final void rule__Rotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4361:1: ( rule__Rotation__Group__1__Impl rule__Rotation__Group__2 )
            // InternalSceneDsl.g:4362:2: rule__Rotation__Group__1__Impl rule__Rotation__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Rotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__1"


    // $ANTLR start "rule__Rotation__Group__1__Impl"
    // InternalSceneDsl.g:4369:1: rule__Rotation__Group__1__Impl : ( '{' ) ;
    public final void rule__Rotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4373:1: ( ( '{' ) )
            // InternalSceneDsl.g:4374:1: ( '{' )
            {
            // InternalSceneDsl.g:4374:1: ( '{' )
            // InternalSceneDsl.g:4375:2: '{'
            {
             before(grammarAccess.getRotationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRotationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__1__Impl"


    // $ANTLR start "rule__Rotation__Group__2"
    // InternalSceneDsl.g:4384:1: rule__Rotation__Group__2 : rule__Rotation__Group__2__Impl rule__Rotation__Group__3 ;
    public final void rule__Rotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4388:1: ( rule__Rotation__Group__2__Impl rule__Rotation__Group__3 )
            // InternalSceneDsl.g:4389:2: rule__Rotation__Group__2__Impl rule__Rotation__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Rotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__2"


    // $ANTLR start "rule__Rotation__Group__2__Impl"
    // InternalSceneDsl.g:4396:1: rule__Rotation__Group__2__Impl : ( ( rule__Rotation__Group_2__0 )? ) ;
    public final void rule__Rotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4400:1: ( ( ( rule__Rotation__Group_2__0 )? ) )
            // InternalSceneDsl.g:4401:1: ( ( rule__Rotation__Group_2__0 )? )
            {
            // InternalSceneDsl.g:4401:1: ( ( rule__Rotation__Group_2__0 )? )
            // InternalSceneDsl.g:4402:2: ( rule__Rotation__Group_2__0 )?
            {
             before(grammarAccess.getRotationAccess().getGroup_2()); 
            // InternalSceneDsl.g:4403:2: ( rule__Rotation__Group_2__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==36) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSceneDsl.g:4403:3: rule__Rotation__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rotation__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRotationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__2__Impl"


    // $ANTLR start "rule__Rotation__Group__3"
    // InternalSceneDsl.g:4411:1: rule__Rotation__Group__3 : rule__Rotation__Group__3__Impl rule__Rotation__Group__4 ;
    public final void rule__Rotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4415:1: ( rule__Rotation__Group__3__Impl rule__Rotation__Group__4 )
            // InternalSceneDsl.g:4416:2: rule__Rotation__Group__3__Impl rule__Rotation__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Rotation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__3"


    // $ANTLR start "rule__Rotation__Group__3__Impl"
    // InternalSceneDsl.g:4423:1: rule__Rotation__Group__3__Impl : ( ( rule__Rotation__Group_3__0 )? ) ;
    public final void rule__Rotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4427:1: ( ( ( rule__Rotation__Group_3__0 )? ) )
            // InternalSceneDsl.g:4428:1: ( ( rule__Rotation__Group_3__0 )? )
            {
            // InternalSceneDsl.g:4428:1: ( ( rule__Rotation__Group_3__0 )? )
            // InternalSceneDsl.g:4429:2: ( rule__Rotation__Group_3__0 )?
            {
             before(grammarAccess.getRotationAccess().getGroup_3()); 
            // InternalSceneDsl.g:4430:2: ( rule__Rotation__Group_3__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==37) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSceneDsl.g:4430:3: rule__Rotation__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rotation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRotationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__3__Impl"


    // $ANTLR start "rule__Rotation__Group__4"
    // InternalSceneDsl.g:4438:1: rule__Rotation__Group__4 : rule__Rotation__Group__4__Impl rule__Rotation__Group__5 ;
    public final void rule__Rotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4442:1: ( rule__Rotation__Group__4__Impl rule__Rotation__Group__5 )
            // InternalSceneDsl.g:4443:2: rule__Rotation__Group__4__Impl rule__Rotation__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Rotation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__4"


    // $ANTLR start "rule__Rotation__Group__4__Impl"
    // InternalSceneDsl.g:4450:1: rule__Rotation__Group__4__Impl : ( ( rule__Rotation__Group_4__0 )? ) ;
    public final void rule__Rotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4454:1: ( ( ( rule__Rotation__Group_4__0 )? ) )
            // InternalSceneDsl.g:4455:1: ( ( rule__Rotation__Group_4__0 )? )
            {
            // InternalSceneDsl.g:4455:1: ( ( rule__Rotation__Group_4__0 )? )
            // InternalSceneDsl.g:4456:2: ( rule__Rotation__Group_4__0 )?
            {
             before(grammarAccess.getRotationAccess().getGroup_4()); 
            // InternalSceneDsl.g:4457:2: ( rule__Rotation__Group_4__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==38) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSceneDsl.g:4457:3: rule__Rotation__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rotation__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRotationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__4__Impl"


    // $ANTLR start "rule__Rotation__Group__5"
    // InternalSceneDsl.g:4465:1: rule__Rotation__Group__5 : rule__Rotation__Group__5__Impl ;
    public final void rule__Rotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4469:1: ( rule__Rotation__Group__5__Impl )
            // InternalSceneDsl.g:4470:2: rule__Rotation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rotation__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__5"


    // $ANTLR start "rule__Rotation__Group__5__Impl"
    // InternalSceneDsl.g:4476:1: rule__Rotation__Group__5__Impl : ( '}' ) ;
    public final void rule__Rotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4480:1: ( ( '}' ) )
            // InternalSceneDsl.g:4481:1: ( '}' )
            {
            // InternalSceneDsl.g:4481:1: ( '}' )
            // InternalSceneDsl.g:4482:2: '}'
            {
             before(grammarAccess.getRotationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRotationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__5__Impl"


    // $ANTLR start "rule__Rotation__Group_2__0"
    // InternalSceneDsl.g:4492:1: rule__Rotation__Group_2__0 : rule__Rotation__Group_2__0__Impl rule__Rotation__Group_2__1 ;
    public final void rule__Rotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4496:1: ( rule__Rotation__Group_2__0__Impl rule__Rotation__Group_2__1 )
            // InternalSceneDsl.g:4497:2: rule__Rotation__Group_2__0__Impl rule__Rotation__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__Rotation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group_2__0"


    // $ANTLR start "rule__Rotation__Group_2__0__Impl"
    // InternalSceneDsl.g:4504:1: rule__Rotation__Group_2__0__Impl : ( 'roll' ) ;
    public final void rule__Rotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4508:1: ( ( 'roll' ) )
            // InternalSceneDsl.g:4509:1: ( 'roll' )
            {
            // InternalSceneDsl.g:4509:1: ( 'roll' )
            // InternalSceneDsl.g:4510:2: 'roll'
            {
             before(grammarAccess.getRotationAccess().getRollKeyword_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRotationAccess().getRollKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group_2__0__Impl"


    // $ANTLR start "rule__Rotation__Group_2__1"
    // InternalSceneDsl.g:4519:1: rule__Rotation__Group_2__1 : rule__Rotation__Group_2__1__Impl ;
    public final void rule__Rotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4523:1: ( rule__Rotation__Group_2__1__Impl )
            // InternalSceneDsl.g:4524:2: rule__Rotation__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rotation__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group_2__1"


    // $ANTLR start "rule__Rotation__Group_2__1__Impl"
    // InternalSceneDsl.g:4530:1: rule__Rotation__Group_2__1__Impl : ( ( rule__Rotation__RollAssignment_2_1 ) ) ;
    public final void rule__Rotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4534:1: ( ( ( rule__Rotation__RollAssignment_2_1 ) ) )
            // InternalSceneDsl.g:4535:1: ( ( rule__Rotation__RollAssignment_2_1 ) )
            {
            // InternalSceneDsl.g:4535:1: ( ( rule__Rotation__RollAssignment_2_1 ) )
            // InternalSceneDsl.g:4536:2: ( rule__Rotation__RollAssignment_2_1 )
            {
             before(grammarAccess.getRotationAccess().getRollAssignment_2_1()); 
            // InternalSceneDsl.g:4537:2: ( rule__Rotation__RollAssignment_2_1 )
            // InternalSceneDsl.g:4537:3: rule__Rotation__RollAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Rotation__RollAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRotationAccess().getRollAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group_2__1__Impl"


    // $ANTLR start "rule__Rotation__Group_3__0"
    // InternalSceneDsl.g:4546:1: rule__Rotation__Group_3__0 : rule__Rotation__Group_3__0__Impl rule__Rotation__Group_3__1 ;
    public final void rule__Rotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4550:1: ( rule__Rotation__Group_3__0__Impl rule__Rotation__Group_3__1 )
            // InternalSceneDsl.g:4551:2: rule__Rotation__Group_3__0__Impl rule__Rotation__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Rotation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group_3__0"


    // $ANTLR start "rule__Rotation__Group_3__0__Impl"
    // InternalSceneDsl.g:4558:1: rule__Rotation__Group_3__0__Impl : ( 'pitch' ) ;
    public final void rule__Rotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4562:1: ( ( 'pitch' ) )
            // InternalSceneDsl.g:4563:1: ( 'pitch' )
            {
            // InternalSceneDsl.g:4563:1: ( 'pitch' )
            // InternalSceneDsl.g:4564:2: 'pitch'
            {
             before(grammarAccess.getRotationAccess().getPitchKeyword_3_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRotationAccess().getPitchKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group_3__0__Impl"


    // $ANTLR start "rule__Rotation__Group_3__1"
    // InternalSceneDsl.g:4573:1: rule__Rotation__Group_3__1 : rule__Rotation__Group_3__1__Impl ;
    public final void rule__Rotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4577:1: ( rule__Rotation__Group_3__1__Impl )
            // InternalSceneDsl.g:4578:2: rule__Rotation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rotation__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group_3__1"


    // $ANTLR start "rule__Rotation__Group_3__1__Impl"
    // InternalSceneDsl.g:4584:1: rule__Rotation__Group_3__1__Impl : ( ( rule__Rotation__PitchAssignment_3_1 ) ) ;
    public final void rule__Rotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4588:1: ( ( ( rule__Rotation__PitchAssignment_3_1 ) ) )
            // InternalSceneDsl.g:4589:1: ( ( rule__Rotation__PitchAssignment_3_1 ) )
            {
            // InternalSceneDsl.g:4589:1: ( ( rule__Rotation__PitchAssignment_3_1 ) )
            // InternalSceneDsl.g:4590:2: ( rule__Rotation__PitchAssignment_3_1 )
            {
             before(grammarAccess.getRotationAccess().getPitchAssignment_3_1()); 
            // InternalSceneDsl.g:4591:2: ( rule__Rotation__PitchAssignment_3_1 )
            // InternalSceneDsl.g:4591:3: rule__Rotation__PitchAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Rotation__PitchAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRotationAccess().getPitchAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group_3__1__Impl"


    // $ANTLR start "rule__Rotation__Group_4__0"
    // InternalSceneDsl.g:4600:1: rule__Rotation__Group_4__0 : rule__Rotation__Group_4__0__Impl rule__Rotation__Group_4__1 ;
    public final void rule__Rotation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4604:1: ( rule__Rotation__Group_4__0__Impl rule__Rotation__Group_4__1 )
            // InternalSceneDsl.g:4605:2: rule__Rotation__Group_4__0__Impl rule__Rotation__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Rotation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group_4__0"


    // $ANTLR start "rule__Rotation__Group_4__0__Impl"
    // InternalSceneDsl.g:4612:1: rule__Rotation__Group_4__0__Impl : ( 'yaw' ) ;
    public final void rule__Rotation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4616:1: ( ( 'yaw' ) )
            // InternalSceneDsl.g:4617:1: ( 'yaw' )
            {
            // InternalSceneDsl.g:4617:1: ( 'yaw' )
            // InternalSceneDsl.g:4618:2: 'yaw'
            {
             before(grammarAccess.getRotationAccess().getYawKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRotationAccess().getYawKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group_4__0__Impl"


    // $ANTLR start "rule__Rotation__Group_4__1"
    // InternalSceneDsl.g:4627:1: rule__Rotation__Group_4__1 : rule__Rotation__Group_4__1__Impl ;
    public final void rule__Rotation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4631:1: ( rule__Rotation__Group_4__1__Impl )
            // InternalSceneDsl.g:4632:2: rule__Rotation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rotation__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group_4__1"


    // $ANTLR start "rule__Rotation__Group_4__1__Impl"
    // InternalSceneDsl.g:4638:1: rule__Rotation__Group_4__1__Impl : ( ( rule__Rotation__YawAssignment_4_1 ) ) ;
    public final void rule__Rotation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4642:1: ( ( ( rule__Rotation__YawAssignment_4_1 ) ) )
            // InternalSceneDsl.g:4643:1: ( ( rule__Rotation__YawAssignment_4_1 ) )
            {
            // InternalSceneDsl.g:4643:1: ( ( rule__Rotation__YawAssignment_4_1 ) )
            // InternalSceneDsl.g:4644:2: ( rule__Rotation__YawAssignment_4_1 )
            {
             before(grammarAccess.getRotationAccess().getYawAssignment_4_1()); 
            // InternalSceneDsl.g:4645:2: ( rule__Rotation__YawAssignment_4_1 )
            // InternalSceneDsl.g:4645:3: rule__Rotation__YawAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Rotation__YawAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRotationAccess().getYawAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalSceneDsl.g:4654:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4658:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalSceneDsl.g:4659:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalSceneDsl.g:4666:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4670:1: ( ( ( '-' )? ) )
            // InternalSceneDsl.g:4671:1: ( ( '-' )? )
            {
            // InternalSceneDsl.g:4671:1: ( ( '-' )? )
            // InternalSceneDsl.g:4672:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalSceneDsl.g:4673:2: ( '-' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==39) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSceneDsl.g:4673:3: '-'
                    {
                    match(input,39,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalSceneDsl.g:4681:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4685:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalSceneDsl.g:4686:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalSceneDsl.g:4693:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4697:1: ( ( ( RULE_INT )? ) )
            // InternalSceneDsl.g:4698:1: ( ( RULE_INT )? )
            {
            // InternalSceneDsl.g:4698:1: ( ( RULE_INT )? )
            // InternalSceneDsl.g:4699:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalSceneDsl.g:4700:2: ( RULE_INT )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_INT) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSceneDsl.g:4700:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalSceneDsl.g:4708:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4712:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalSceneDsl.g:4713:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalSceneDsl.g:4720:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4724:1: ( ( '.' ) )
            // InternalSceneDsl.g:4725:1: ( '.' )
            {
            // InternalSceneDsl.g:4725:1: ( '.' )
            // InternalSceneDsl.g:4726:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalSceneDsl.g:4735:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4739:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalSceneDsl.g:4740:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalSceneDsl.g:4747:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4751:1: ( ( RULE_INT ) )
            // InternalSceneDsl.g:4752:1: ( RULE_INT )
            {
            // InternalSceneDsl.g:4752:1: ( RULE_INT )
            // InternalSceneDsl.g:4753:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalSceneDsl.g:4762:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4766:1: ( rule__EDouble__Group__4__Impl )
            // InternalSceneDsl.g:4767:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalSceneDsl.g:4773:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4777:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalSceneDsl.g:4778:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalSceneDsl.g:4778:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalSceneDsl.g:4779:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalSceneDsl.g:4780:2: ( rule__EDouble__Group_4__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=11 && LA43_0<=12)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSceneDsl.g:4780:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalSceneDsl.g:4789:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4793:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalSceneDsl.g:4794:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_28);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalSceneDsl.g:4801:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4805:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalSceneDsl.g:4806:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalSceneDsl.g:4806:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalSceneDsl.g:4807:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalSceneDsl.g:4808:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalSceneDsl.g:4808:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalSceneDsl.g:4816:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4820:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalSceneDsl.g:4821:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_28);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalSceneDsl.g:4828:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4832:1: ( ( ( '-' )? ) )
            // InternalSceneDsl.g:4833:1: ( ( '-' )? )
            {
            // InternalSceneDsl.g:4833:1: ( ( '-' )? )
            // InternalSceneDsl.g:4834:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalSceneDsl.g:4835:2: ( '-' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==39) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSceneDsl.g:4835:3: '-'
                    {
                    match(input,39,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalSceneDsl.g:4843:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4847:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalSceneDsl.g:4848:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalSceneDsl.g:4854:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4858:1: ( ( RULE_INT ) )
            // InternalSceneDsl.g:4859:1: ( RULE_INT )
            {
            // InternalSceneDsl.g:4859:1: ( RULE_INT )
            // InternalSceneDsl.g:4860:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__PhysicParameters__Group__0"
    // InternalSceneDsl.g:4870:1: rule__PhysicParameters__Group__0 : rule__PhysicParameters__Group__0__Impl rule__PhysicParameters__Group__1 ;
    public final void rule__PhysicParameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4874:1: ( rule__PhysicParameters__Group__0__Impl rule__PhysicParameters__Group__1 )
            // InternalSceneDsl.g:4875:2: rule__PhysicParameters__Group__0__Impl rule__PhysicParameters__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PhysicParameters__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicParameters__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicParameters__Group__0"


    // $ANTLR start "rule__PhysicParameters__Group__0__Impl"
    // InternalSceneDsl.g:4882:1: rule__PhysicParameters__Group__0__Impl : ( () ) ;
    public final void rule__PhysicParameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4886:1: ( ( () ) )
            // InternalSceneDsl.g:4887:1: ( () )
            {
            // InternalSceneDsl.g:4887:1: ( () )
            // InternalSceneDsl.g:4888:2: ()
            {
             before(grammarAccess.getPhysicParametersAccess().getPhysicParametersAction_0()); 
            // InternalSceneDsl.g:4889:2: ()
            // InternalSceneDsl.g:4889:3: 
            {
            }

             after(grammarAccess.getPhysicParametersAccess().getPhysicParametersAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicParameters__Group__0__Impl"


    // $ANTLR start "rule__PhysicParameters__Group__1"
    // InternalSceneDsl.g:4897:1: rule__PhysicParameters__Group__1 : rule__PhysicParameters__Group__1__Impl rule__PhysicParameters__Group__2 ;
    public final void rule__PhysicParameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4901:1: ( rule__PhysicParameters__Group__1__Impl rule__PhysicParameters__Group__2 )
            // InternalSceneDsl.g:4902:2: rule__PhysicParameters__Group__1__Impl rule__PhysicParameters__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__PhysicParameters__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicParameters__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicParameters__Group__1"


    // $ANTLR start "rule__PhysicParameters__Group__1__Impl"
    // InternalSceneDsl.g:4909:1: rule__PhysicParameters__Group__1__Impl : ( '{' ) ;
    public final void rule__PhysicParameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4913:1: ( ( '{' ) )
            // InternalSceneDsl.g:4914:1: ( '{' )
            {
            // InternalSceneDsl.g:4914:1: ( '{' )
            // InternalSceneDsl.g:4915:2: '{'
            {
             before(grammarAccess.getPhysicParametersAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPhysicParametersAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicParameters__Group__1__Impl"


    // $ANTLR start "rule__PhysicParameters__Group__2"
    // InternalSceneDsl.g:4924:1: rule__PhysicParameters__Group__2 : rule__PhysicParameters__Group__2__Impl rule__PhysicParameters__Group__3 ;
    public final void rule__PhysicParameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4928:1: ( rule__PhysicParameters__Group__2__Impl rule__PhysicParameters__Group__3 )
            // InternalSceneDsl.g:4929:2: rule__PhysicParameters__Group__2__Impl rule__PhysicParameters__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__PhysicParameters__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicParameters__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicParameters__Group__2"


    // $ANTLR start "rule__PhysicParameters__Group__2__Impl"
    // InternalSceneDsl.g:4936:1: rule__PhysicParameters__Group__2__Impl : ( ( rule__PhysicParameters__Group_2__0 )? ) ;
    public final void rule__PhysicParameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4940:1: ( ( ( rule__PhysicParameters__Group_2__0 )? ) )
            // InternalSceneDsl.g:4941:1: ( ( rule__PhysicParameters__Group_2__0 )? )
            {
            // InternalSceneDsl.g:4941:1: ( ( rule__PhysicParameters__Group_2__0 )? )
            // InternalSceneDsl.g:4942:2: ( rule__PhysicParameters__Group_2__0 )?
            {
             before(grammarAccess.getPhysicParametersAccess().getGroup_2()); 
            // InternalSceneDsl.g:4943:2: ( rule__PhysicParameters__Group_2__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==41) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSceneDsl.g:4943:3: rule__PhysicParameters__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PhysicParameters__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhysicParametersAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicParameters__Group__2__Impl"


    // $ANTLR start "rule__PhysicParameters__Group__3"
    // InternalSceneDsl.g:4951:1: rule__PhysicParameters__Group__3 : rule__PhysicParameters__Group__3__Impl ;
    public final void rule__PhysicParameters__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4955:1: ( rule__PhysicParameters__Group__3__Impl )
            // InternalSceneDsl.g:4956:2: rule__PhysicParameters__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PhysicParameters__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicParameters__Group__3"


    // $ANTLR start "rule__PhysicParameters__Group__3__Impl"
    // InternalSceneDsl.g:4962:1: rule__PhysicParameters__Group__3__Impl : ( '}' ) ;
    public final void rule__PhysicParameters__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4966:1: ( ( '}' ) )
            // InternalSceneDsl.g:4967:1: ( '}' )
            {
            // InternalSceneDsl.g:4967:1: ( '}' )
            // InternalSceneDsl.g:4968:2: '}'
            {
             before(grammarAccess.getPhysicParametersAccess().getRightCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPhysicParametersAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicParameters__Group__3__Impl"


    // $ANTLR start "rule__PhysicParameters__Group_2__0"
    // InternalSceneDsl.g:4978:1: rule__PhysicParameters__Group_2__0 : rule__PhysicParameters__Group_2__0__Impl rule__PhysicParameters__Group_2__1 ;
    public final void rule__PhysicParameters__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4982:1: ( rule__PhysicParameters__Group_2__0__Impl rule__PhysicParameters__Group_2__1 )
            // InternalSceneDsl.g:4983:2: rule__PhysicParameters__Group_2__0__Impl rule__PhysicParameters__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__PhysicParameters__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicParameters__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicParameters__Group_2__0"


    // $ANTLR start "rule__PhysicParameters__Group_2__0__Impl"
    // InternalSceneDsl.g:4990:1: rule__PhysicParameters__Group_2__0__Impl : ( 'mass' ) ;
    public final void rule__PhysicParameters__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:4994:1: ( ( 'mass' ) )
            // InternalSceneDsl.g:4995:1: ( 'mass' )
            {
            // InternalSceneDsl.g:4995:1: ( 'mass' )
            // InternalSceneDsl.g:4996:2: 'mass'
            {
             before(grammarAccess.getPhysicParametersAccess().getMassKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPhysicParametersAccess().getMassKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicParameters__Group_2__0__Impl"


    // $ANTLR start "rule__PhysicParameters__Group_2__1"
    // InternalSceneDsl.g:5005:1: rule__PhysicParameters__Group_2__1 : rule__PhysicParameters__Group_2__1__Impl ;
    public final void rule__PhysicParameters__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5009:1: ( rule__PhysicParameters__Group_2__1__Impl )
            // InternalSceneDsl.g:5010:2: rule__PhysicParameters__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PhysicParameters__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicParameters__Group_2__1"


    // $ANTLR start "rule__PhysicParameters__Group_2__1__Impl"
    // InternalSceneDsl.g:5016:1: rule__PhysicParameters__Group_2__1__Impl : ( ( rule__PhysicParameters__MassAssignment_2_1 ) ) ;
    public final void rule__PhysicParameters__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5020:1: ( ( ( rule__PhysicParameters__MassAssignment_2_1 ) ) )
            // InternalSceneDsl.g:5021:1: ( ( rule__PhysicParameters__MassAssignment_2_1 ) )
            {
            // InternalSceneDsl.g:5021:1: ( ( rule__PhysicParameters__MassAssignment_2_1 ) )
            // InternalSceneDsl.g:5022:2: ( rule__PhysicParameters__MassAssignment_2_1 )
            {
             before(grammarAccess.getPhysicParametersAccess().getMassAssignment_2_1()); 
            // InternalSceneDsl.g:5023:2: ( rule__PhysicParameters__MassAssignment_2_1 )
            // InternalSceneDsl.g:5023:3: rule__PhysicParameters__MassAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PhysicParameters__MassAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPhysicParametersAccess().getMassAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicParameters__Group_2__1__Impl"


    // $ANTLR start "rule__Color__Group__0"
    // InternalSceneDsl.g:5032:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5036:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // InternalSceneDsl.g:5037:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Color__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__0"


    // $ANTLR start "rule__Color__Group__0__Impl"
    // InternalSceneDsl.g:5044:1: rule__Color__Group__0__Impl : ( () ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5048:1: ( ( () ) )
            // InternalSceneDsl.g:5049:1: ( () )
            {
            // InternalSceneDsl.g:5049:1: ( () )
            // InternalSceneDsl.g:5050:2: ()
            {
             before(grammarAccess.getColorAccess().getColorAction_0()); 
            // InternalSceneDsl.g:5051:2: ()
            // InternalSceneDsl.g:5051:3: 
            {
            }

             after(grammarAccess.getColorAccess().getColorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__0__Impl"


    // $ANTLR start "rule__Color__Group__1"
    // InternalSceneDsl.g:5059:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5063:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // InternalSceneDsl.g:5064:2: rule__Color__Group__1__Impl rule__Color__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Color__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__1"


    // $ANTLR start "rule__Color__Group__1__Impl"
    // InternalSceneDsl.g:5071:1: rule__Color__Group__1__Impl : ( 'color' ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5075:1: ( ( 'color' ) )
            // InternalSceneDsl.g:5076:1: ( 'color' )
            {
            // InternalSceneDsl.g:5076:1: ( 'color' )
            // InternalSceneDsl.g:5077:2: 'color'
            {
             before(grammarAccess.getColorAccess().getColorKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getColorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__1__Impl"


    // $ANTLR start "rule__Color__Group__2"
    // InternalSceneDsl.g:5086:1: rule__Color__Group__2 : rule__Color__Group__2__Impl rule__Color__Group__3 ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5090:1: ( rule__Color__Group__2__Impl rule__Color__Group__3 )
            // InternalSceneDsl.g:5091:2: rule__Color__Group__2__Impl rule__Color__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Color__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__2"


    // $ANTLR start "rule__Color__Group__2__Impl"
    // InternalSceneDsl.g:5098:1: rule__Color__Group__2__Impl : ( '{' ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5102:1: ( ( '{' ) )
            // InternalSceneDsl.g:5103:1: ( '{' )
            {
            // InternalSceneDsl.g:5103:1: ( '{' )
            // InternalSceneDsl.g:5104:2: '{'
            {
             before(grammarAccess.getColorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__2__Impl"


    // $ANTLR start "rule__Color__Group__3"
    // InternalSceneDsl.g:5113:1: rule__Color__Group__3 : rule__Color__Group__3__Impl rule__Color__Group__4 ;
    public final void rule__Color__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5117:1: ( rule__Color__Group__3__Impl rule__Color__Group__4 )
            // InternalSceneDsl.g:5118:2: rule__Color__Group__3__Impl rule__Color__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__Color__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__3"


    // $ANTLR start "rule__Color__Group__3__Impl"
    // InternalSceneDsl.g:5125:1: rule__Color__Group__3__Impl : ( ( rule__Color__Group_3__0 )? ) ;
    public final void rule__Color__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5129:1: ( ( ( rule__Color__Group_3__0 )? ) )
            // InternalSceneDsl.g:5130:1: ( ( rule__Color__Group_3__0 )? )
            {
            // InternalSceneDsl.g:5130:1: ( ( rule__Color__Group_3__0 )? )
            // InternalSceneDsl.g:5131:2: ( rule__Color__Group_3__0 )?
            {
             before(grammarAccess.getColorAccess().getGroup_3()); 
            // InternalSceneDsl.g:5132:2: ( rule__Color__Group_3__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==43) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSceneDsl.g:5132:3: rule__Color__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Color__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColorAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__3__Impl"


    // $ANTLR start "rule__Color__Group__4"
    // InternalSceneDsl.g:5140:1: rule__Color__Group__4 : rule__Color__Group__4__Impl rule__Color__Group__5 ;
    public final void rule__Color__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5144:1: ( rule__Color__Group__4__Impl rule__Color__Group__5 )
            // InternalSceneDsl.g:5145:2: rule__Color__Group__4__Impl rule__Color__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__Color__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__4"


    // $ANTLR start "rule__Color__Group__4__Impl"
    // InternalSceneDsl.g:5152:1: rule__Color__Group__4__Impl : ( ( rule__Color__Group_4__0 )? ) ;
    public final void rule__Color__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5156:1: ( ( ( rule__Color__Group_4__0 )? ) )
            // InternalSceneDsl.g:5157:1: ( ( rule__Color__Group_4__0 )? )
            {
            // InternalSceneDsl.g:5157:1: ( ( rule__Color__Group_4__0 )? )
            // InternalSceneDsl.g:5158:2: ( rule__Color__Group_4__0 )?
            {
             before(grammarAccess.getColorAccess().getGroup_4()); 
            // InternalSceneDsl.g:5159:2: ( rule__Color__Group_4__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==44) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSceneDsl.g:5159:3: rule__Color__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Color__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColorAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__4__Impl"


    // $ANTLR start "rule__Color__Group__5"
    // InternalSceneDsl.g:5167:1: rule__Color__Group__5 : rule__Color__Group__5__Impl rule__Color__Group__6 ;
    public final void rule__Color__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5171:1: ( rule__Color__Group__5__Impl rule__Color__Group__6 )
            // InternalSceneDsl.g:5172:2: rule__Color__Group__5__Impl rule__Color__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__Color__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__5"


    // $ANTLR start "rule__Color__Group__5__Impl"
    // InternalSceneDsl.g:5179:1: rule__Color__Group__5__Impl : ( ( rule__Color__Group_5__0 )? ) ;
    public final void rule__Color__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5183:1: ( ( ( rule__Color__Group_5__0 )? ) )
            // InternalSceneDsl.g:5184:1: ( ( rule__Color__Group_5__0 )? )
            {
            // InternalSceneDsl.g:5184:1: ( ( rule__Color__Group_5__0 )? )
            // InternalSceneDsl.g:5185:2: ( rule__Color__Group_5__0 )?
            {
             before(grammarAccess.getColorAccess().getGroup_5()); 
            // InternalSceneDsl.g:5186:2: ( rule__Color__Group_5__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==45) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSceneDsl.g:5186:3: rule__Color__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Color__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColorAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__5__Impl"


    // $ANTLR start "rule__Color__Group__6"
    // InternalSceneDsl.g:5194:1: rule__Color__Group__6 : rule__Color__Group__6__Impl rule__Color__Group__7 ;
    public final void rule__Color__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5198:1: ( rule__Color__Group__6__Impl rule__Color__Group__7 )
            // InternalSceneDsl.g:5199:2: rule__Color__Group__6__Impl rule__Color__Group__7
            {
            pushFollow(FOLLOW_31);
            rule__Color__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__6"


    // $ANTLR start "rule__Color__Group__6__Impl"
    // InternalSceneDsl.g:5206:1: rule__Color__Group__6__Impl : ( ( rule__Color__Group_6__0 )? ) ;
    public final void rule__Color__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5210:1: ( ( ( rule__Color__Group_6__0 )? ) )
            // InternalSceneDsl.g:5211:1: ( ( rule__Color__Group_6__0 )? )
            {
            // InternalSceneDsl.g:5211:1: ( ( rule__Color__Group_6__0 )? )
            // InternalSceneDsl.g:5212:2: ( rule__Color__Group_6__0 )?
            {
             before(grammarAccess.getColorAccess().getGroup_6()); 
            // InternalSceneDsl.g:5213:2: ( rule__Color__Group_6__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==46) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSceneDsl.g:5213:3: rule__Color__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Color__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColorAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__6__Impl"


    // $ANTLR start "rule__Color__Group__7"
    // InternalSceneDsl.g:5221:1: rule__Color__Group__7 : rule__Color__Group__7__Impl ;
    public final void rule__Color__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5225:1: ( rule__Color__Group__7__Impl )
            // InternalSceneDsl.g:5226:2: rule__Color__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__7"


    // $ANTLR start "rule__Color__Group__7__Impl"
    // InternalSceneDsl.g:5232:1: rule__Color__Group__7__Impl : ( '}' ) ;
    public final void rule__Color__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5236:1: ( ( '}' ) )
            // InternalSceneDsl.g:5237:1: ( '}' )
            {
            // InternalSceneDsl.g:5237:1: ( '}' )
            // InternalSceneDsl.g:5238:2: '}'
            {
             before(grammarAccess.getColorAccess().getRightCurlyBracketKeyword_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__7__Impl"


    // $ANTLR start "rule__Color__Group_3__0"
    // InternalSceneDsl.g:5248:1: rule__Color__Group_3__0 : rule__Color__Group_3__0__Impl rule__Color__Group_3__1 ;
    public final void rule__Color__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5252:1: ( rule__Color__Group_3__0__Impl rule__Color__Group_3__1 )
            // InternalSceneDsl.g:5253:2: rule__Color__Group_3__0__Impl rule__Color__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Color__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_3__0"


    // $ANTLR start "rule__Color__Group_3__0__Impl"
    // InternalSceneDsl.g:5260:1: rule__Color__Group_3__0__Impl : ( 'red' ) ;
    public final void rule__Color__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5264:1: ( ( 'red' ) )
            // InternalSceneDsl.g:5265:1: ( 'red' )
            {
            // InternalSceneDsl.g:5265:1: ( 'red' )
            // InternalSceneDsl.g:5266:2: 'red'
            {
             before(grammarAccess.getColorAccess().getRedKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getRedKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_3__0__Impl"


    // $ANTLR start "rule__Color__Group_3__1"
    // InternalSceneDsl.g:5275:1: rule__Color__Group_3__1 : rule__Color__Group_3__1__Impl ;
    public final void rule__Color__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5279:1: ( rule__Color__Group_3__1__Impl )
            // InternalSceneDsl.g:5280:2: rule__Color__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_3__1"


    // $ANTLR start "rule__Color__Group_3__1__Impl"
    // InternalSceneDsl.g:5286:1: rule__Color__Group_3__1__Impl : ( ( rule__Color__RedAssignment_3_1 ) ) ;
    public final void rule__Color__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5290:1: ( ( ( rule__Color__RedAssignment_3_1 ) ) )
            // InternalSceneDsl.g:5291:1: ( ( rule__Color__RedAssignment_3_1 ) )
            {
            // InternalSceneDsl.g:5291:1: ( ( rule__Color__RedAssignment_3_1 ) )
            // InternalSceneDsl.g:5292:2: ( rule__Color__RedAssignment_3_1 )
            {
             before(grammarAccess.getColorAccess().getRedAssignment_3_1()); 
            // InternalSceneDsl.g:5293:2: ( rule__Color__RedAssignment_3_1 )
            // InternalSceneDsl.g:5293:3: rule__Color__RedAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Color__RedAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getRedAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_3__1__Impl"


    // $ANTLR start "rule__Color__Group_4__0"
    // InternalSceneDsl.g:5302:1: rule__Color__Group_4__0 : rule__Color__Group_4__0__Impl rule__Color__Group_4__1 ;
    public final void rule__Color__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5306:1: ( rule__Color__Group_4__0__Impl rule__Color__Group_4__1 )
            // InternalSceneDsl.g:5307:2: rule__Color__Group_4__0__Impl rule__Color__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Color__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_4__0"


    // $ANTLR start "rule__Color__Group_4__0__Impl"
    // InternalSceneDsl.g:5314:1: rule__Color__Group_4__0__Impl : ( 'green' ) ;
    public final void rule__Color__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5318:1: ( ( 'green' ) )
            // InternalSceneDsl.g:5319:1: ( 'green' )
            {
            // InternalSceneDsl.g:5319:1: ( 'green' )
            // InternalSceneDsl.g:5320:2: 'green'
            {
             before(grammarAccess.getColorAccess().getGreenKeyword_4_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getGreenKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_4__0__Impl"


    // $ANTLR start "rule__Color__Group_4__1"
    // InternalSceneDsl.g:5329:1: rule__Color__Group_4__1 : rule__Color__Group_4__1__Impl ;
    public final void rule__Color__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5333:1: ( rule__Color__Group_4__1__Impl )
            // InternalSceneDsl.g:5334:2: rule__Color__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_4__1"


    // $ANTLR start "rule__Color__Group_4__1__Impl"
    // InternalSceneDsl.g:5340:1: rule__Color__Group_4__1__Impl : ( ( rule__Color__GreenAssignment_4_1 ) ) ;
    public final void rule__Color__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5344:1: ( ( ( rule__Color__GreenAssignment_4_1 ) ) )
            // InternalSceneDsl.g:5345:1: ( ( rule__Color__GreenAssignment_4_1 ) )
            {
            // InternalSceneDsl.g:5345:1: ( ( rule__Color__GreenAssignment_4_1 ) )
            // InternalSceneDsl.g:5346:2: ( rule__Color__GreenAssignment_4_1 )
            {
             before(grammarAccess.getColorAccess().getGreenAssignment_4_1()); 
            // InternalSceneDsl.g:5347:2: ( rule__Color__GreenAssignment_4_1 )
            // InternalSceneDsl.g:5347:3: rule__Color__GreenAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Color__GreenAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGreenAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_4__1__Impl"


    // $ANTLR start "rule__Color__Group_5__0"
    // InternalSceneDsl.g:5356:1: rule__Color__Group_5__0 : rule__Color__Group_5__0__Impl rule__Color__Group_5__1 ;
    public final void rule__Color__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5360:1: ( rule__Color__Group_5__0__Impl rule__Color__Group_5__1 )
            // InternalSceneDsl.g:5361:2: rule__Color__Group_5__0__Impl rule__Color__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__Color__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_5__0"


    // $ANTLR start "rule__Color__Group_5__0__Impl"
    // InternalSceneDsl.g:5368:1: rule__Color__Group_5__0__Impl : ( 'blue' ) ;
    public final void rule__Color__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5372:1: ( ( 'blue' ) )
            // InternalSceneDsl.g:5373:1: ( 'blue' )
            {
            // InternalSceneDsl.g:5373:1: ( 'blue' )
            // InternalSceneDsl.g:5374:2: 'blue'
            {
             before(grammarAccess.getColorAccess().getBlueKeyword_5_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getBlueKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_5__0__Impl"


    // $ANTLR start "rule__Color__Group_5__1"
    // InternalSceneDsl.g:5383:1: rule__Color__Group_5__1 : rule__Color__Group_5__1__Impl ;
    public final void rule__Color__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5387:1: ( rule__Color__Group_5__1__Impl )
            // InternalSceneDsl.g:5388:2: rule__Color__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_5__1"


    // $ANTLR start "rule__Color__Group_5__1__Impl"
    // InternalSceneDsl.g:5394:1: rule__Color__Group_5__1__Impl : ( ( rule__Color__BlueAssignment_5_1 ) ) ;
    public final void rule__Color__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5398:1: ( ( ( rule__Color__BlueAssignment_5_1 ) ) )
            // InternalSceneDsl.g:5399:1: ( ( rule__Color__BlueAssignment_5_1 ) )
            {
            // InternalSceneDsl.g:5399:1: ( ( rule__Color__BlueAssignment_5_1 ) )
            // InternalSceneDsl.g:5400:2: ( rule__Color__BlueAssignment_5_1 )
            {
             before(grammarAccess.getColorAccess().getBlueAssignment_5_1()); 
            // InternalSceneDsl.g:5401:2: ( rule__Color__BlueAssignment_5_1 )
            // InternalSceneDsl.g:5401:3: rule__Color__BlueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Color__BlueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getBlueAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_5__1__Impl"


    // $ANTLR start "rule__Color__Group_6__0"
    // InternalSceneDsl.g:5410:1: rule__Color__Group_6__0 : rule__Color__Group_6__0__Impl rule__Color__Group_6__1 ;
    public final void rule__Color__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5414:1: ( rule__Color__Group_6__0__Impl rule__Color__Group_6__1 )
            // InternalSceneDsl.g:5415:2: rule__Color__Group_6__0__Impl rule__Color__Group_6__1
            {
            pushFollow(FOLLOW_14);
            rule__Color__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_6__0"


    // $ANTLR start "rule__Color__Group_6__0__Impl"
    // InternalSceneDsl.g:5422:1: rule__Color__Group_6__0__Impl : ( 'alpha' ) ;
    public final void rule__Color__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5426:1: ( ( 'alpha' ) )
            // InternalSceneDsl.g:5427:1: ( 'alpha' )
            {
            // InternalSceneDsl.g:5427:1: ( 'alpha' )
            // InternalSceneDsl.g:5428:2: 'alpha'
            {
             before(grammarAccess.getColorAccess().getAlphaKeyword_6_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getAlphaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_6__0__Impl"


    // $ANTLR start "rule__Color__Group_6__1"
    // InternalSceneDsl.g:5437:1: rule__Color__Group_6__1 : rule__Color__Group_6__1__Impl ;
    public final void rule__Color__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5441:1: ( rule__Color__Group_6__1__Impl )
            // InternalSceneDsl.g:5442:2: rule__Color__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_6__1"


    // $ANTLR start "rule__Color__Group_6__1__Impl"
    // InternalSceneDsl.g:5448:1: rule__Color__Group_6__1__Impl : ( ( rule__Color__AlphaAssignment_6_1 ) ) ;
    public final void rule__Color__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5452:1: ( ( ( rule__Color__AlphaAssignment_6_1 ) ) )
            // InternalSceneDsl.g:5453:1: ( ( rule__Color__AlphaAssignment_6_1 ) )
            {
            // InternalSceneDsl.g:5453:1: ( ( rule__Color__AlphaAssignment_6_1 ) )
            // InternalSceneDsl.g:5454:2: ( rule__Color__AlphaAssignment_6_1 )
            {
             before(grammarAccess.getColorAccess().getAlphaAssignment_6_1()); 
            // InternalSceneDsl.g:5455:2: ( rule__Color__AlphaAssignment_6_1 )
            // InternalSceneDsl.g:5455:3: rule__Color__AlphaAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Color__AlphaAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getAlphaAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_6__1__Impl"


    // $ANTLR start "rule__Texture__Group__0"
    // InternalSceneDsl.g:5464:1: rule__Texture__Group__0 : rule__Texture__Group__0__Impl rule__Texture__Group__1 ;
    public final void rule__Texture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5468:1: ( rule__Texture__Group__0__Impl rule__Texture__Group__1 )
            // InternalSceneDsl.g:5469:2: rule__Texture__Group__0__Impl rule__Texture__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Texture__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Texture__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__0"


    // $ANTLR start "rule__Texture__Group__0__Impl"
    // InternalSceneDsl.g:5476:1: rule__Texture__Group__0__Impl : ( () ) ;
    public final void rule__Texture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5480:1: ( ( () ) )
            // InternalSceneDsl.g:5481:1: ( () )
            {
            // InternalSceneDsl.g:5481:1: ( () )
            // InternalSceneDsl.g:5482:2: ()
            {
             before(grammarAccess.getTextureAccess().getTextureAction_0()); 
            // InternalSceneDsl.g:5483:2: ()
            // InternalSceneDsl.g:5483:3: 
            {
            }

             after(grammarAccess.getTextureAccess().getTextureAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__0__Impl"


    // $ANTLR start "rule__Texture__Group__1"
    // InternalSceneDsl.g:5491:1: rule__Texture__Group__1 : rule__Texture__Group__1__Impl rule__Texture__Group__2 ;
    public final void rule__Texture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5495:1: ( rule__Texture__Group__1__Impl rule__Texture__Group__2 )
            // InternalSceneDsl.g:5496:2: rule__Texture__Group__1__Impl rule__Texture__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Texture__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Texture__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__1"


    // $ANTLR start "rule__Texture__Group__1__Impl"
    // InternalSceneDsl.g:5503:1: rule__Texture__Group__1__Impl : ( 'texture' ) ;
    public final void rule__Texture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5507:1: ( ( 'texture' ) )
            // InternalSceneDsl.g:5508:1: ( 'texture' )
            {
            // InternalSceneDsl.g:5508:1: ( 'texture' )
            // InternalSceneDsl.g:5509:2: 'texture'
            {
             before(grammarAccess.getTextureAccess().getTextureKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTextureAccess().getTextureKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__1__Impl"


    // $ANTLR start "rule__Texture__Group__2"
    // InternalSceneDsl.g:5518:1: rule__Texture__Group__2 : rule__Texture__Group__2__Impl rule__Texture__Group__3 ;
    public final void rule__Texture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5522:1: ( rule__Texture__Group__2__Impl rule__Texture__Group__3 )
            // InternalSceneDsl.g:5523:2: rule__Texture__Group__2__Impl rule__Texture__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__Texture__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Texture__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__2"


    // $ANTLR start "rule__Texture__Group__2__Impl"
    // InternalSceneDsl.g:5530:1: rule__Texture__Group__2__Impl : ( '{' ) ;
    public final void rule__Texture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5534:1: ( ( '{' ) )
            // InternalSceneDsl.g:5535:1: ( '{' )
            {
            // InternalSceneDsl.g:5535:1: ( '{' )
            // InternalSceneDsl.g:5536:2: '{'
            {
             before(grammarAccess.getTextureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTextureAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__2__Impl"


    // $ANTLR start "rule__Texture__Group__3"
    // InternalSceneDsl.g:5545:1: rule__Texture__Group__3 : rule__Texture__Group__3__Impl rule__Texture__Group__4 ;
    public final void rule__Texture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5549:1: ( rule__Texture__Group__3__Impl rule__Texture__Group__4 )
            // InternalSceneDsl.g:5550:2: rule__Texture__Group__3__Impl rule__Texture__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__Texture__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Texture__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__3"


    // $ANTLR start "rule__Texture__Group__3__Impl"
    // InternalSceneDsl.g:5557:1: rule__Texture__Group__3__Impl : ( ( rule__Texture__Group_3__0 )? ) ;
    public final void rule__Texture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5561:1: ( ( ( rule__Texture__Group_3__0 )? ) )
            // InternalSceneDsl.g:5562:1: ( ( rule__Texture__Group_3__0 )? )
            {
            // InternalSceneDsl.g:5562:1: ( ( rule__Texture__Group_3__0 )? )
            // InternalSceneDsl.g:5563:2: ( rule__Texture__Group_3__0 )?
            {
             before(grammarAccess.getTextureAccess().getGroup_3()); 
            // InternalSceneDsl.g:5564:2: ( rule__Texture__Group_3__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==18) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalSceneDsl.g:5564:3: rule__Texture__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Texture__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextureAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__3__Impl"


    // $ANTLR start "rule__Texture__Group__4"
    // InternalSceneDsl.g:5572:1: rule__Texture__Group__4 : rule__Texture__Group__4__Impl ;
    public final void rule__Texture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5576:1: ( rule__Texture__Group__4__Impl )
            // InternalSceneDsl.g:5577:2: rule__Texture__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Texture__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__4"


    // $ANTLR start "rule__Texture__Group__4__Impl"
    // InternalSceneDsl.g:5583:1: rule__Texture__Group__4__Impl : ( '}' ) ;
    public final void rule__Texture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5587:1: ( ( '}' ) )
            // InternalSceneDsl.g:5588:1: ( '}' )
            {
            // InternalSceneDsl.g:5588:1: ( '}' )
            // InternalSceneDsl.g:5589:2: '}'
            {
             before(grammarAccess.getTextureAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTextureAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__4__Impl"


    // $ANTLR start "rule__Texture__Group_3__0"
    // InternalSceneDsl.g:5599:1: rule__Texture__Group_3__0 : rule__Texture__Group_3__0__Impl rule__Texture__Group_3__1 ;
    public final void rule__Texture__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5603:1: ( rule__Texture__Group_3__0__Impl rule__Texture__Group_3__1 )
            // InternalSceneDsl.g:5604:2: rule__Texture__Group_3__0__Impl rule__Texture__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Texture__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Texture__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group_3__0"


    // $ANTLR start "rule__Texture__Group_3__0__Impl"
    // InternalSceneDsl.g:5611:1: rule__Texture__Group_3__0__Impl : ( 'path' ) ;
    public final void rule__Texture__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5615:1: ( ( 'path' ) )
            // InternalSceneDsl.g:5616:1: ( 'path' )
            {
            // InternalSceneDsl.g:5616:1: ( 'path' )
            // InternalSceneDsl.g:5617:2: 'path'
            {
             before(grammarAccess.getTextureAccess().getPathKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTextureAccess().getPathKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group_3__0__Impl"


    // $ANTLR start "rule__Texture__Group_3__1"
    // InternalSceneDsl.g:5626:1: rule__Texture__Group_3__1 : rule__Texture__Group_3__1__Impl ;
    public final void rule__Texture__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5630:1: ( rule__Texture__Group_3__1__Impl )
            // InternalSceneDsl.g:5631:2: rule__Texture__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Texture__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group_3__1"


    // $ANTLR start "rule__Texture__Group_3__1__Impl"
    // InternalSceneDsl.g:5637:1: rule__Texture__Group_3__1__Impl : ( ( rule__Texture__PathAssignment_3_1 ) ) ;
    public final void rule__Texture__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5641:1: ( ( ( rule__Texture__PathAssignment_3_1 ) ) )
            // InternalSceneDsl.g:5642:1: ( ( rule__Texture__PathAssignment_3_1 ) )
            {
            // InternalSceneDsl.g:5642:1: ( ( rule__Texture__PathAssignment_3_1 ) )
            // InternalSceneDsl.g:5643:2: ( rule__Texture__PathAssignment_3_1 )
            {
             before(grammarAccess.getTextureAccess().getPathAssignment_3_1()); 
            // InternalSceneDsl.g:5644:2: ( rule__Texture__PathAssignment_3_1 )
            // InternalSceneDsl.g:5644:3: rule__Texture__PathAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Texture__PathAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTextureAccess().getPathAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group_3__1__Impl"


    // $ANTLR start "rule__Scene__NameAssignment_2"
    // InternalSceneDsl.g:5653:1: rule__Scene__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Scene__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5657:1: ( ( ruleEString ) )
            // InternalSceneDsl.g:5658:2: ( ruleEString )
            {
            // InternalSceneDsl.g:5658:2: ( ruleEString )
            // InternalSceneDsl.g:5659:3: ruleEString
            {
             before(grammarAccess.getSceneAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSceneAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__NameAssignment_2"


    // $ANTLR start "rule__Scene__ModelAssignment_4_2"
    // InternalSceneDsl.g:5668:1: rule__Scene__ModelAssignment_4_2 : ( ruleModel ) ;
    public final void rule__Scene__ModelAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5672:1: ( ( ruleModel ) )
            // InternalSceneDsl.g:5673:2: ( ruleModel )
            {
            // InternalSceneDsl.g:5673:2: ( ruleModel )
            // InternalSceneDsl.g:5674:3: ruleModel
            {
             before(grammarAccess.getSceneAccess().getModelModelParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getSceneAccess().getModelModelParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__ModelAssignment_4_2"


    // $ANTLR start "rule__Scene__ModelAssignment_4_3"
    // InternalSceneDsl.g:5683:1: rule__Scene__ModelAssignment_4_3 : ( ruleModel ) ;
    public final void rule__Scene__ModelAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5687:1: ( ( ruleModel ) )
            // InternalSceneDsl.g:5688:2: ( ruleModel )
            {
            // InternalSceneDsl.g:5688:2: ( ruleModel )
            // InternalSceneDsl.g:5689:3: ruleModel
            {
             before(grammarAccess.getSceneAccess().getModelModelParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getSceneAccess().getModelModelParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__ModelAssignment_4_3"


    // $ANTLR start "rule__ExternalModel__NameAssignment_2"
    // InternalSceneDsl.g:5698:1: rule__ExternalModel__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ExternalModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5702:1: ( ( ruleEString ) )
            // InternalSceneDsl.g:5703:2: ( ruleEString )
            {
            // InternalSceneDsl.g:5703:2: ( ruleEString )
            // InternalSceneDsl.g:5704:3: ruleEString
            {
             before(grammarAccess.getExternalModelAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExternalModelAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModel__NameAssignment_2"


    // $ANTLR start "rule__ExternalModel__PathAssignment_4_1"
    // InternalSceneDsl.g:5713:1: rule__ExternalModel__PathAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ExternalModel__PathAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5717:1: ( ( ruleEString ) )
            // InternalSceneDsl.g:5718:2: ( ruleEString )
            {
            // InternalSceneDsl.g:5718:2: ( ruleEString )
            // InternalSceneDsl.g:5719:3: ruleEString
            {
             before(grammarAccess.getExternalModelAccess().getPathEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExternalModelAccess().getPathEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModel__PathAssignment_4_1"


    // $ANTLR start "rule__ExternalModel__PlacementAssignment_5_1"
    // InternalSceneDsl.g:5728:1: rule__ExternalModel__PlacementAssignment_5_1 : ( rulePlacement ) ;
    public final void rule__ExternalModel__PlacementAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5732:1: ( ( rulePlacement ) )
            // InternalSceneDsl.g:5733:2: ( rulePlacement )
            {
            // InternalSceneDsl.g:5733:2: ( rulePlacement )
            // InternalSceneDsl.g:5734:3: rulePlacement
            {
             before(grammarAccess.getExternalModelAccess().getPlacementPlacementParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlacement();

            state._fsp--;

             after(grammarAccess.getExternalModelAccess().getPlacementPlacementParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModel__PlacementAssignment_5_1"


    // $ANTLR start "rule__Sphere__NameAssignment_2"
    // InternalSceneDsl.g:5743:1: rule__Sphere__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Sphere__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5747:1: ( ( ruleEString ) )
            // InternalSceneDsl.g:5748:2: ( ruleEString )
            {
            // InternalSceneDsl.g:5748:2: ( ruleEString )
            // InternalSceneDsl.g:5749:3: ruleEString
            {
             before(grammarAccess.getSphereAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSphereAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__NameAssignment_2"


    // $ANTLR start "rule__Sphere__RadiusAssignment_4_1"
    // InternalSceneDsl.g:5758:1: rule__Sphere__RadiusAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__Sphere__RadiusAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5762:1: ( ( ruleEDouble ) )
            // InternalSceneDsl.g:5763:2: ( ruleEDouble )
            {
            // InternalSceneDsl.g:5763:2: ( ruleEDouble )
            // InternalSceneDsl.g:5764:3: ruleEDouble
            {
             before(grammarAccess.getSphereAccess().getRadiusEDoubleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getSphereAccess().getRadiusEDoubleParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__RadiusAssignment_4_1"


    // $ANTLR start "rule__Sphere__PlacementAssignment_5_1"
    // InternalSceneDsl.g:5773:1: rule__Sphere__PlacementAssignment_5_1 : ( rulePlacement ) ;
    public final void rule__Sphere__PlacementAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5777:1: ( ( rulePlacement ) )
            // InternalSceneDsl.g:5778:2: ( rulePlacement )
            {
            // InternalSceneDsl.g:5778:2: ( rulePlacement )
            // InternalSceneDsl.g:5779:3: rulePlacement
            {
             before(grammarAccess.getSphereAccess().getPlacementPlacementParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlacement();

            state._fsp--;

             after(grammarAccess.getSphereAccess().getPlacementPlacementParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__PlacementAssignment_5_1"


    // $ANTLR start "rule__Sphere__PhysicparametersAssignment_6_1"
    // InternalSceneDsl.g:5788:1: rule__Sphere__PhysicparametersAssignment_6_1 : ( rulePhysicParameters ) ;
    public final void rule__Sphere__PhysicparametersAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5792:1: ( ( rulePhysicParameters ) )
            // InternalSceneDsl.g:5793:2: ( rulePhysicParameters )
            {
            // InternalSceneDsl.g:5793:2: ( rulePhysicParameters )
            // InternalSceneDsl.g:5794:3: rulePhysicParameters
            {
             before(grammarAccess.getSphereAccess().getPhysicparametersPhysicParametersParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhysicParameters();

            state._fsp--;

             after(grammarAccess.getSphereAccess().getPhysicparametersPhysicParametersParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__PhysicparametersAssignment_6_1"


    // $ANTLR start "rule__Sphere__MaterialAssignment_7_1"
    // InternalSceneDsl.g:5803:1: rule__Sphere__MaterialAssignment_7_1 : ( ruleMaterial ) ;
    public final void rule__Sphere__MaterialAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5807:1: ( ( ruleMaterial ) )
            // InternalSceneDsl.g:5808:2: ( ruleMaterial )
            {
            // InternalSceneDsl.g:5808:2: ( ruleMaterial )
            // InternalSceneDsl.g:5809:3: ruleMaterial
            {
             before(grammarAccess.getSphereAccess().getMaterialMaterialParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMaterial();

            state._fsp--;

             after(grammarAccess.getSphereAccess().getMaterialMaterialParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__MaterialAssignment_7_1"


    // $ANTLR start "rule__Box__NameAssignment_2"
    // InternalSceneDsl.g:5818:1: rule__Box__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Box__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5822:1: ( ( ruleEString ) )
            // InternalSceneDsl.g:5823:2: ( ruleEString )
            {
            // InternalSceneDsl.g:5823:2: ( ruleEString )
            // InternalSceneDsl.g:5824:3: ruleEString
            {
             before(grammarAccess.getBoxAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__NameAssignment_2"


    // $ANTLR start "rule__Box__WidthAssignment_4_1"
    // InternalSceneDsl.g:5833:1: rule__Box__WidthAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__Box__WidthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5837:1: ( ( ruleEDouble ) )
            // InternalSceneDsl.g:5838:2: ( ruleEDouble )
            {
            // InternalSceneDsl.g:5838:2: ( ruleEDouble )
            // InternalSceneDsl.g:5839:3: ruleEDouble
            {
             before(grammarAccess.getBoxAccess().getWidthEDoubleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getWidthEDoubleParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__WidthAssignment_4_1"


    // $ANTLR start "rule__Box__HeightAssignment_5_1"
    // InternalSceneDsl.g:5848:1: rule__Box__HeightAssignment_5_1 : ( ruleEDouble ) ;
    public final void rule__Box__HeightAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5852:1: ( ( ruleEDouble ) )
            // InternalSceneDsl.g:5853:2: ( ruleEDouble )
            {
            // InternalSceneDsl.g:5853:2: ( ruleEDouble )
            // InternalSceneDsl.g:5854:3: ruleEDouble
            {
             before(grammarAccess.getBoxAccess().getHeightEDoubleParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getHeightEDoubleParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__HeightAssignment_5_1"


    // $ANTLR start "rule__Box__DepthAssignment_6_1"
    // InternalSceneDsl.g:5863:1: rule__Box__DepthAssignment_6_1 : ( ruleEDouble ) ;
    public final void rule__Box__DepthAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5867:1: ( ( ruleEDouble ) )
            // InternalSceneDsl.g:5868:2: ( ruleEDouble )
            {
            // InternalSceneDsl.g:5868:2: ( ruleEDouble )
            // InternalSceneDsl.g:5869:3: ruleEDouble
            {
             before(grammarAccess.getBoxAccess().getDepthEDoubleParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getDepthEDoubleParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__DepthAssignment_6_1"


    // $ANTLR start "rule__Box__PlacementAssignment_7_1"
    // InternalSceneDsl.g:5878:1: rule__Box__PlacementAssignment_7_1 : ( rulePlacement ) ;
    public final void rule__Box__PlacementAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5882:1: ( ( rulePlacement ) )
            // InternalSceneDsl.g:5883:2: ( rulePlacement )
            {
            // InternalSceneDsl.g:5883:2: ( rulePlacement )
            // InternalSceneDsl.g:5884:3: rulePlacement
            {
             before(grammarAccess.getBoxAccess().getPlacementPlacementParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlacement();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getPlacementPlacementParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__PlacementAssignment_7_1"


    // $ANTLR start "rule__Box__PhysicparametersAssignment_8_1"
    // InternalSceneDsl.g:5893:1: rule__Box__PhysicparametersAssignment_8_1 : ( rulePhysicParameters ) ;
    public final void rule__Box__PhysicparametersAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5897:1: ( ( rulePhysicParameters ) )
            // InternalSceneDsl.g:5898:2: ( rulePhysicParameters )
            {
            // InternalSceneDsl.g:5898:2: ( rulePhysicParameters )
            // InternalSceneDsl.g:5899:3: rulePhysicParameters
            {
             before(grammarAccess.getBoxAccess().getPhysicparametersPhysicParametersParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhysicParameters();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getPhysicparametersPhysicParametersParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__PhysicparametersAssignment_8_1"


    // $ANTLR start "rule__Box__MaterialAssignment_9_1"
    // InternalSceneDsl.g:5908:1: rule__Box__MaterialAssignment_9_1 : ( ruleMaterial ) ;
    public final void rule__Box__MaterialAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5912:1: ( ( ruleMaterial ) )
            // InternalSceneDsl.g:5913:2: ( ruleMaterial )
            {
            // InternalSceneDsl.g:5913:2: ( ruleMaterial )
            // InternalSceneDsl.g:5914:3: ruleMaterial
            {
             before(grammarAccess.getBoxAccess().getMaterialMaterialParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMaterial();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getMaterialMaterialParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__MaterialAssignment_9_1"


    // $ANTLR start "rule__Cylinder__NameAssignment_2"
    // InternalSceneDsl.g:5923:1: rule__Cylinder__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Cylinder__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5927:1: ( ( ruleEString ) )
            // InternalSceneDsl.g:5928:2: ( ruleEString )
            {
            // InternalSceneDsl.g:5928:2: ( ruleEString )
            // InternalSceneDsl.g:5929:3: ruleEString
            {
             before(grammarAccess.getCylinderAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCylinderAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__NameAssignment_2"


    // $ANTLR start "rule__Cylinder__RadiusAssignment_4_1"
    // InternalSceneDsl.g:5938:1: rule__Cylinder__RadiusAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__Cylinder__RadiusAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5942:1: ( ( ruleEDouble ) )
            // InternalSceneDsl.g:5943:2: ( ruleEDouble )
            {
            // InternalSceneDsl.g:5943:2: ( ruleEDouble )
            // InternalSceneDsl.g:5944:3: ruleEDouble
            {
             before(grammarAccess.getCylinderAccess().getRadiusEDoubleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getCylinderAccess().getRadiusEDoubleParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__RadiusAssignment_4_1"


    // $ANTLR start "rule__Cylinder__HeightAssignment_5_1"
    // InternalSceneDsl.g:5953:1: rule__Cylinder__HeightAssignment_5_1 : ( ruleEDouble ) ;
    public final void rule__Cylinder__HeightAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5957:1: ( ( ruleEDouble ) )
            // InternalSceneDsl.g:5958:2: ( ruleEDouble )
            {
            // InternalSceneDsl.g:5958:2: ( ruleEDouble )
            // InternalSceneDsl.g:5959:3: ruleEDouble
            {
             before(grammarAccess.getCylinderAccess().getHeightEDoubleParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getCylinderAccess().getHeightEDoubleParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__HeightAssignment_5_1"


    // $ANTLR start "rule__Cylinder__PlacementAssignment_6_1"
    // InternalSceneDsl.g:5968:1: rule__Cylinder__PlacementAssignment_6_1 : ( rulePlacement ) ;
    public final void rule__Cylinder__PlacementAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5972:1: ( ( rulePlacement ) )
            // InternalSceneDsl.g:5973:2: ( rulePlacement )
            {
            // InternalSceneDsl.g:5973:2: ( rulePlacement )
            // InternalSceneDsl.g:5974:3: rulePlacement
            {
             before(grammarAccess.getCylinderAccess().getPlacementPlacementParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlacement();

            state._fsp--;

             after(grammarAccess.getCylinderAccess().getPlacementPlacementParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__PlacementAssignment_6_1"


    // $ANTLR start "rule__Cylinder__PhysicparametersAssignment_7_1"
    // InternalSceneDsl.g:5983:1: rule__Cylinder__PhysicparametersAssignment_7_1 : ( rulePhysicParameters ) ;
    public final void rule__Cylinder__PhysicparametersAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:5987:1: ( ( rulePhysicParameters ) )
            // InternalSceneDsl.g:5988:2: ( rulePhysicParameters )
            {
            // InternalSceneDsl.g:5988:2: ( rulePhysicParameters )
            // InternalSceneDsl.g:5989:3: rulePhysicParameters
            {
             before(grammarAccess.getCylinderAccess().getPhysicparametersPhysicParametersParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhysicParameters();

            state._fsp--;

             after(grammarAccess.getCylinderAccess().getPhysicparametersPhysicParametersParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__PhysicparametersAssignment_7_1"


    // $ANTLR start "rule__Cylinder__MaterialAssignment_8_1"
    // InternalSceneDsl.g:5998:1: rule__Cylinder__MaterialAssignment_8_1 : ( ruleMaterial ) ;
    public final void rule__Cylinder__MaterialAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:6002:1: ( ( ruleMaterial ) )
            // InternalSceneDsl.g:6003:2: ( ruleMaterial )
            {
            // InternalSceneDsl.g:6003:2: ( ruleMaterial )
            // InternalSceneDsl.g:6004:3: ruleMaterial
            {
             before(grammarAccess.getCylinderAccess().getMaterialMaterialParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMaterial();

            state._fsp--;

             after(grammarAccess.getCylinderAccess().getMaterialMaterialParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__MaterialAssignment_8_1"


    // $ANTLR start "rule__Floor__NameAssignment_2"
    // InternalSceneDsl.g:6013:1: rule__Floor__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Floor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:6017:1: ( ( ruleEString ) )
            // InternalSceneDsl.g:6018:2: ( ruleEString )
            {
            // InternalSceneDsl.g:6018:2: ( ruleEString )
            // InternalSceneDsl.g:6019:3: ruleEString
            {
             before(grammarAccess.getFloorAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFloorAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__NameAssignment_2"


    // $ANTLR start "rule__Floor__PlacementAssignment_4_1"
    // InternalSceneDsl.g:6028:1: rule__Floor__PlacementAssignment_4_1 : ( rulePlacement ) ;
    public final void rule__Floor__PlacementAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:6032:1: ( ( rulePlacement ) )
            // InternalSceneDsl.g:6033:2: ( rulePlacement )
            {
            // InternalSceneDsl.g:6033:2: ( rulePlacement )
            // InternalSceneDsl.g:6034:3: rulePlacement
            {
             before(grammarAccess.getFloorAccess().getPlacementPlacementParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlacement();

            state._fsp--;

             after(grammarAccess.getFloorAccess().getPlacementPlacementParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__PlacementAssignment_4_1"


    // $ANTLR start "rule__Floor__PhysicparametersAssignment_5_1"
    // InternalSceneDsl.g:6043:1: rule__Floor__PhysicparametersAssignment_5_1 : ( rulePhysicParameters ) ;
    public final void rule__Floor__PhysicparametersAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:6047:1: ( ( rulePhysicParameters ) )
            // InternalSceneDsl.g:6048:2: ( rulePhysicParameters )
            {
            // InternalSceneDsl.g:6048:2: ( rulePhysicParameters )
            // InternalSceneDsl.g:6049:3: rulePhysicParameters
            {
             before(grammarAccess.getFloorAccess().getPhysicparametersPhysicParametersParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhysicParameters();

            state._fsp--;

             after(grammarAccess.getFloorAccess().getPhysicparametersPhysicParametersParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__PhysicparametersAssignment_5_1"


    // $ANTLR start "rule__Floor__MaterialAssignment_6_1"
    // InternalSceneDsl.g:6058:1: rule__Floor__MaterialAssignment_6_1 : ( ruleMaterial ) ;
    public final void rule__Floor__MaterialAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:6062:1: ( ( ruleMaterial ) )
            // InternalSceneDsl.g:6063:2: ( ruleMaterial )
            {
            // InternalSceneDsl.g:6063:2: ( ruleMaterial )
            // InternalSceneDsl.g:6064:3: ruleMaterial
            {
             before(grammarAccess.getFloorAccess().getMaterialMaterialParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMaterial();

            state._fsp--;

             after(grammarAccess.getFloorAccess().getMaterialMaterialParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__MaterialAssignment_6_1"


    // $ANTLR start "rule__WallElement__NameAssignment_2"
    // InternalSceneDsl.g:6073:1: rule__WallElement__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__WallElement__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:6077:1: ( ( ruleEString ) )
            // InternalSceneDsl.g:6078:2: ( ruleEString )
            {
            // InternalSceneDsl.g:6078:2: ( ruleEString )
            // InternalSceneDsl.g:6079:3: ruleEString
            {
             before(grammarAccess.getWallElementAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWallElementAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__NameAssignment_2"


    // $ANTLR start "rule__WallElement__WidthAssignment_4_1"
    // InternalSceneDsl.g:6088:1: rule__WallElement__WidthAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__WallElement__WidthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:6092:1: ( ( ruleEDouble ) )
            // InternalSceneDsl.g:6093:2: ( ruleEDouble )
            {
            // InternalSceneDsl.g:6093:2: ( ruleEDouble )
            // InternalSceneDsl.g:6094:3: ruleEDouble
            {
             before(grammarAccess.getWallElementAccess().getWidthEDoubleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getWallElementAccess().getWidthEDoubleParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__WidthAssignment_4_1"


    // $ANTLR start "rule__WallElement__HeightAssignment_5_1"
    // InternalSceneDsl.g:6103:1: rule__WallElement__HeightAssignment_5_1 : ( ruleEDouble ) ;
    public final void rule__WallElement__HeightAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:6107:1: ( ( ruleEDouble ) )
            // InternalSceneDsl.g:6108:2: ( ruleEDouble )
            {
            // InternalSceneDsl.g:6108:2: ( ruleEDouble )
            // InternalSceneDsl.g:6109:3: ruleEDouble
            {
             before(grammarAccess.getWallElementAccess().getHeightEDoubleParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getWallElementAccess().getHeightEDoubleParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__HeightAssignment_5_1"


    // $ANTLR start "rule__WallElement__PlacementAssignment_6_1"
    // InternalSceneDsl.g:6118:1: rule__WallElement__PlacementAssignment_6_1 : ( rulePlacement ) ;
    public final void rule__WallElement__PlacementAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:6122:1: ( ( rulePlacement ) )
            // InternalSceneDsl.g:6123:2: ( rulePlacement )
            {
            // InternalSceneDsl.g:6123:2: ( rulePlacement )
            // InternalSceneDsl.g:6124:3: rulePlacement
            {
             before(grammarAccess.getWallElementAccess().getPlacementPlacementParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlacement();

            state._fsp--;

             after(grammarAccess.getWallElementAccess().getPlacementPlacementParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__PlacementAssignment_6_1"


    // $ANTLR start "rule__WallElement__PhysicparametersAssignment_7_1"
    // InternalSceneDsl.g:6133:1: rule__WallElement__PhysicparametersAssignment_7_1 : ( rulePhysicParameters ) ;
    public final void rule__WallElement__PhysicparametersAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:6137:1: ( ( rulePhysicParameters ) )
            // InternalSceneDsl.g:6138:2: ( rulePhysicParameters )
            {
            // InternalSceneDsl.g:6138:2: ( rulePhysicParameters )
            // InternalSceneDsl.g:6139:3: rulePhysicParameters
            {
             before(grammarAccess.getWallElementAccess().getPhysicparametersPhysicParametersParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhysicParameters();

            state._fsp--;

             after(grammarAccess.getWallElementAccess().getPhysicparametersPhysicParametersParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__PhysicparametersAssignment_7_1"


    // $ANTLR start "rule__WallElement__MaterialAssignment_8_1"
    // InternalSceneDsl.g:6148:1: rule__WallElement__MaterialAssignment_8_1 : ( ruleMaterial ) ;
    public final void rule__WallElement__MaterialAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:6152:1: ( ( ruleMaterial ) )
            // InternalSceneDsl.g:6153:2: ( ruleMaterial )
            {
            // InternalSceneDsl.g:6153:2: ( ruleMaterial )
            // InternalSceneDsl.g:6154:3: ruleMaterial
            {
             before(grammarAccess.getWallElementAccess().getMaterialMaterialParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMaterial();

            state._fsp--;

             after(grammarAccess.getWallElementAccess().getMaterialMaterialParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallElement__MaterialAssignment_8_1"


    // $ANTLR start "rule__Placement__PositionAssignment_2_1"
    // InternalSceneDsl.g:6163:1: rule__Placement__PositionAssignment_2_1 : ( ruleVec3 ) ;
    public final void rule__Placement__PositionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:6167:1: ( ( ruleVec3 ) )
            // InternalSceneDsl.g:6168:2: ( ruleVec3 )
            {
            // InternalSceneDsl.g:6168:2: ( ruleVec3 )
            // InternalSceneDsl.g:6169:3: ruleVec3
            {
             before(grammarAccess.getPlacementAccess().getPositionVec3ParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVec3();

            state._fsp--;

             after(grammarAccess.getPlacementAccess().getPositionVec3ParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__PositionAssignment_2_1"


    // $ANTLR start "rule__Placement__RotationAssignment_3_1"
    // InternalSceneDsl.g:6178:1: rule__Placement__RotationAssignment_3_1 : ( ruleRotation ) ;
    public final void rule__Placement__RotationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:6182:1: ( ( ruleRotation ) )
            // InternalSceneDsl.g:6183:2: ( ruleRotation )
            {
            // InternalSceneDsl.g:6183:2: ( ruleRotation )
            // InternalSceneDsl.g:6184:3: ruleRotation
            {
             before(grammarAccess.getPlacementAccess().getRotationRotationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRotation();

            state._fsp--;

             after(grammarAccess.getPlacementAccess().getRotationRotationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__RotationAssignment_3_1"


    // $ANTLR start "rule__Vec3__XAssignment_2_1"
    // InternalSceneDsl.g:6193:1: rule__Vec3__XAssignment_2_1 : ( ruleEDouble ) ;
    public final void rule__Vec3__XAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:6197:1: ( ( ruleEDouble ) )
            // InternalSceneDsl.g:6198:2: ( ruleEDouble )
            {
            // InternalSceneDsl.g:6198:2: ( ruleEDouble )
            // InternalSceneDsl.g:6199:3: ruleEDouble
            {
             before(grammarAccess.getVec3Access().getXEDoubleParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getVec3Access().getXEDoubleParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vec3__XAssignment_2_1"


    // $ANTLR start "rule__Vec3__YAssignment_3_1"
    // InternalSceneDsl.g:6208:1: rule__Vec3__YAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__Vec3__YAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:6212:1: ( ( ruleEDouble ) )
            // InternalSceneDsl.g:6213:2: ( ruleEDouble )
            {
            // InternalSceneDsl.g:6213:2: ( ruleEDouble )
            // InternalSceneDsl.g:6214:3: ruleEDouble
            {
             before(grammarAccess.getVec3Access().getYEDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getVec3Access().getYEDoubleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vec3__YAssignment_3_1"


    // $ANTLR start "rule__Vec3__ZAssignment_4_1"
    // InternalSceneDsl.g:6223:1: rule__Vec3__ZAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__Vec3__ZAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:6227:1: ( ( ruleEDouble ) )
            // InternalSceneDsl.g:6228:2: ( ruleEDouble )
            {
            // InternalSceneDsl.g:6228:2: ( ruleEDouble )
            // InternalSceneDsl.g:6229:3: ruleEDouble
            {
             before(grammarAccess.getVec3Access().getZEDoubleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getVec3Access().getZEDoubleParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vec3__ZAssignment_4_1"


    // $ANTLR start "rule__Rotation__RollAssignment_2_1"
    // InternalSceneDsl.g:6238:1: rule__Rotation__RollAssignment_2_1 : ( ruleEDouble ) ;
    public final void rule__Rotation__RollAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:6242:1: ( ( ruleEDouble ) )
            // InternalSceneDsl.g:6243:2: ( ruleEDouble )
            {
            // InternalSceneDsl.g:6243:2: ( ruleEDouble )
            // InternalSceneDsl.g:6244:3: ruleEDouble
            {
             before(grammarAccess.getRotationAccess().getRollEDoubleParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getRotationAccess().getRollEDoubleParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__RollAssignment_2_1"


    // $ANTLR start "rule__Rotation__PitchAssignment_3_1"
    // InternalSceneDsl.g:6253:1: rule__Rotation__PitchAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__Rotation__PitchAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:6257:1: ( ( ruleEDouble ) )
            // InternalSceneDsl.g:6258:2: ( ruleEDouble )
            {
            // InternalSceneDsl.g:6258:2: ( ruleEDouble )
            // InternalSceneDsl.g:6259:3: ruleEDouble
            {
             before(grammarAccess.getRotationAccess().getPitchEDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getRotationAccess().getPitchEDoubleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__PitchAssignment_3_1"


    // $ANTLR start "rule__Rotation__YawAssignment_4_1"
    // InternalSceneDsl.g:6268:1: rule__Rotation__YawAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__Rotation__YawAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:6272:1: ( ( ruleEDouble ) )
            // InternalSceneDsl.g:6273:2: ( ruleEDouble )
            {
            // InternalSceneDsl.g:6273:2: ( ruleEDouble )
            // InternalSceneDsl.g:6274:3: ruleEDouble
            {
             before(grammarAccess.getRotationAccess().getYawEDoubleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getRotationAccess().getYawEDoubleParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__YawAssignment_4_1"


    // $ANTLR start "rule__PhysicParameters__MassAssignment_2_1"
    // InternalSceneDsl.g:6283:1: rule__PhysicParameters__MassAssignment_2_1 : ( ruleEDouble ) ;
    public final void rule__PhysicParameters__MassAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:6287:1: ( ( ruleEDouble ) )
            // InternalSceneDsl.g:6288:2: ( ruleEDouble )
            {
            // InternalSceneDsl.g:6288:2: ( ruleEDouble )
            // InternalSceneDsl.g:6289:3: ruleEDouble
            {
             before(grammarAccess.getPhysicParametersAccess().getMassEDoubleParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPhysicParametersAccess().getMassEDoubleParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicParameters__MassAssignment_2_1"


    // $ANTLR start "rule__Color__RedAssignment_3_1"
    // InternalSceneDsl.g:6298:1: rule__Color__RedAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__Color__RedAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:6302:1: ( ( ruleEDouble ) )
            // InternalSceneDsl.g:6303:2: ( ruleEDouble )
            {
            // InternalSceneDsl.g:6303:2: ( ruleEDouble )
            // InternalSceneDsl.g:6304:3: ruleEDouble
            {
             before(grammarAccess.getColorAccess().getRedEDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getColorAccess().getRedEDoubleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__RedAssignment_3_1"


    // $ANTLR start "rule__Color__GreenAssignment_4_1"
    // InternalSceneDsl.g:6313:1: rule__Color__GreenAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__Color__GreenAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:6317:1: ( ( ruleEDouble ) )
            // InternalSceneDsl.g:6318:2: ( ruleEDouble )
            {
            // InternalSceneDsl.g:6318:2: ( ruleEDouble )
            // InternalSceneDsl.g:6319:3: ruleEDouble
            {
             before(grammarAccess.getColorAccess().getGreenEDoubleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getColorAccess().getGreenEDoubleParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__GreenAssignment_4_1"


    // $ANTLR start "rule__Color__BlueAssignment_5_1"
    // InternalSceneDsl.g:6328:1: rule__Color__BlueAssignment_5_1 : ( ruleEDouble ) ;
    public final void rule__Color__BlueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:6332:1: ( ( ruleEDouble ) )
            // InternalSceneDsl.g:6333:2: ( ruleEDouble )
            {
            // InternalSceneDsl.g:6333:2: ( ruleEDouble )
            // InternalSceneDsl.g:6334:3: ruleEDouble
            {
             before(grammarAccess.getColorAccess().getBlueEDoubleParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getColorAccess().getBlueEDoubleParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__BlueAssignment_5_1"


    // $ANTLR start "rule__Color__AlphaAssignment_6_1"
    // InternalSceneDsl.g:6343:1: rule__Color__AlphaAssignment_6_1 : ( ruleEDouble ) ;
    public final void rule__Color__AlphaAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:6347:1: ( ( ruleEDouble ) )
            // InternalSceneDsl.g:6348:2: ( ruleEDouble )
            {
            // InternalSceneDsl.g:6348:2: ( ruleEDouble )
            // InternalSceneDsl.g:6349:3: ruleEDouble
            {
             before(grammarAccess.getColorAccess().getAlphaEDoubleParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getColorAccess().getAlphaEDoubleParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__AlphaAssignment_6_1"


    // $ANTLR start "rule__Texture__PathAssignment_3_1"
    // InternalSceneDsl.g:6358:1: rule__Texture__PathAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Texture__PathAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDsl.g:6362:1: ( ( ruleEString ) )
            // InternalSceneDsl.g:6363:2: ( ruleEString )
            {
            // InternalSceneDsl.g:6363:2: ( ruleEString )
            // InternalSceneDsl.g:6364:3: ruleEString
            {
             before(grammarAccess.getTextureAccess().getPathEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTextureAccess().getPathEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__PathAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000071120000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000071128000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000071120002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C8000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000E88000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000018000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000840000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000EC88000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004E88000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000C88000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000006C88000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000180008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000E00008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000007000008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000780000008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000048000L});

}