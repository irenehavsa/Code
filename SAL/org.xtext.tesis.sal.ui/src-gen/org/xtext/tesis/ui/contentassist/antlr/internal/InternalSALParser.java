package org.xtext.tesis.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.tesis.services.SALGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSALParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TO BE CONTINUED'", "': CONTEXT='", "'BEGIN'", "'END'", "': TYPE={'", "'};'", "': MODULE='", "'INPUT'", "'OUTPUT'", "'LOCAL'", "'DEFINITION'", "'INITIALIZATION'", "'TRANSITION ['", "']'", "':'", "'['", "'..'", "'='", "';'", "'-->'", "'\\'='"
    };
    public static final int RULE_ID=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalSALParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSALParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSALParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g"; }


     
     	private SALGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SALGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleContext"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:60:1: entryRuleContext : ruleContext EOF ;
    public final void entryRuleContext() throws RecognitionException {
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:61:1: ( ruleContext EOF )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:62:1: ruleContext EOF
            {
             before(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_ruleContext_in_entryRuleContext61);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getContextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContext68); 

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
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:69:1: ruleContext : ( ( rule__Context__Group__0 ) ) ;
    public final void ruleContext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:73:2: ( ( ( rule__Context__Group__0 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:74:1: ( ( rule__Context__Group__0 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:74:1: ( ( rule__Context__Group__0 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:75:1: ( rule__Context__Group__0 )
            {
             before(grammarAccess.getContextAccess().getGroup()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:76:1: ( rule__Context__Group__0 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:76:2: rule__Context__Group__0
            {
            pushFollow(FOLLOW_rule__Context__Group__0_in_ruleContext94);
            rule__Context__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getGroup()); 

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
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleBody"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:88:1: entryRuleBody : ruleBody EOF ;
    public final void entryRuleBody() throws RecognitionException {
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:89:1: ( ruleBody EOF )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:90:1: ruleBody EOF
            {
             before(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody121);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getBodyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody128); 

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
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:97:1: ruleBody : ( ( rule__Body__Group__0 ) ) ;
    public final void ruleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:101:2: ( ( ( rule__Body__Group__0 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:102:1: ( ( rule__Body__Group__0 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:102:1: ( ( rule__Body__Group__0 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:103:1: ( rule__Body__Group__0 )
            {
             before(grammarAccess.getBodyAccess().getGroup()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:104:1: ( rule__Body__Group__0 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:104:2: rule__Body__Group__0
            {
            pushFollow(FOLLOW_rule__Body__Group__0_in_ruleBody154);
            rule__Body__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBodyAccess().getGroup()); 

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
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleTypeDeclaration"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:116:1: entryRuleTypeDeclaration : ruleTypeDeclaration EOF ;
    public final void entryRuleTypeDeclaration() throws RecognitionException {
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:117:1: ( ruleTypeDeclaration EOF )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:118:1: ruleTypeDeclaration EOF
            {
             before(grammarAccess.getTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleTypeDeclaration_in_entryRuleTypeDeclaration181);
            ruleTypeDeclaration();

            state._fsp--;

             after(grammarAccess.getTypeDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDeclaration188); 

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
    // $ANTLR end "entryRuleTypeDeclaration"


    // $ANTLR start "ruleTypeDeclaration"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:125:1: ruleTypeDeclaration : ( ( rule__TypeDeclaration__Group__0 ) ) ;
    public final void ruleTypeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:129:2: ( ( ( rule__TypeDeclaration__Group__0 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:130:1: ( ( rule__TypeDeclaration__Group__0 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:130:1: ( ( rule__TypeDeclaration__Group__0 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:131:1: ( rule__TypeDeclaration__Group__0 )
            {
             before(grammarAccess.getTypeDeclarationAccess().getGroup()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:132:1: ( rule__TypeDeclaration__Group__0 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:132:2: rule__TypeDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__TypeDeclaration__Group__0_in_ruleTypeDeclaration214);
            rule__TypeDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleTypeDeclaration"


    // $ANTLR start "entryRuleModuleDeclaration"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:144:1: entryRuleModuleDeclaration : ruleModuleDeclaration EOF ;
    public final void entryRuleModuleDeclaration() throws RecognitionException {
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:145:1: ( ruleModuleDeclaration EOF )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:146:1: ruleModuleDeclaration EOF
            {
             before(grammarAccess.getModuleDeclarationRule()); 
            pushFollow(FOLLOW_ruleModuleDeclaration_in_entryRuleModuleDeclaration241);
            ruleModuleDeclaration();

            state._fsp--;

             after(grammarAccess.getModuleDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleDeclaration248); 

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
    // $ANTLR end "entryRuleModuleDeclaration"


    // $ANTLR start "ruleModuleDeclaration"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:153:1: ruleModuleDeclaration : ( ( rule__ModuleDeclaration__Group__0 ) ) ;
    public final void ruleModuleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:157:2: ( ( ( rule__ModuleDeclaration__Group__0 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:158:1: ( ( rule__ModuleDeclaration__Group__0 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:158:1: ( ( rule__ModuleDeclaration__Group__0 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:159:1: ( rule__ModuleDeclaration__Group__0 )
            {
             before(grammarAccess.getModuleDeclarationAccess().getGroup()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:160:1: ( rule__ModuleDeclaration__Group__0 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:160:2: rule__ModuleDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ModuleDeclaration__Group__0_in_ruleModuleDeclaration274);
            rule__ModuleDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleModuleDeclaration"


    // $ANTLR start "entryRuleModule"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:172:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:173:1: ( ruleModule EOF )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:174:1: ruleModule EOF
            {
             before(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule301);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule308); 

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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:181:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:185:2: ( ( ( rule__Module__Group__0 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:186:1: ( ( rule__Module__Group__0 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:186:1: ( ( rule__Module__Group__0 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:187:1: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:188:1: ( rule__Module__Group__0 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:188:2: rule__Module__Group__0
            {
            pushFollow(FOLLOW_rule__Module__Group__0_in_ruleModule334);
            rule__Module__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getGroup()); 

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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleDeclarations"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:200:1: entryRuleDeclarations : ruleDeclarations EOF ;
    public final void entryRuleDeclarations() throws RecognitionException {
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:201:1: ( ruleDeclarations EOF )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:202:1: ruleDeclarations EOF
            {
             before(grammarAccess.getDeclarationsRule()); 
            pushFollow(FOLLOW_ruleDeclarations_in_entryRuleDeclarations361);
            ruleDeclarations();

            state._fsp--;

             after(grammarAccess.getDeclarationsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarations368); 

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
    // $ANTLR end "entryRuleDeclarations"


    // $ANTLR start "ruleDeclarations"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:209:1: ruleDeclarations : ( ( rule__Declarations__Alternatives ) ) ;
    public final void ruleDeclarations() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:213:2: ( ( ( rule__Declarations__Alternatives ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:214:1: ( ( rule__Declarations__Alternatives ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:214:1: ( ( rule__Declarations__Alternatives ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:215:1: ( rule__Declarations__Alternatives )
            {
             before(grammarAccess.getDeclarationsAccess().getAlternatives()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:216:1: ( rule__Declarations__Alternatives )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:216:2: rule__Declarations__Alternatives
            {
            pushFollow(FOLLOW_rule__Declarations__Alternatives_in_ruleDeclarations394);
            rule__Declarations__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDeclarations"


    // $ANTLR start "entryRuleVarDecl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:228:1: entryRuleVarDecl : ruleVarDecl EOF ;
    public final void entryRuleVarDecl() throws RecognitionException {
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:229:1: ( ruleVarDecl EOF )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:230:1: ruleVarDecl EOF
            {
             before(grammarAccess.getVarDeclRule()); 
            pushFollow(FOLLOW_ruleVarDecl_in_entryRuleVarDecl421);
            ruleVarDecl();

            state._fsp--;

             after(grammarAccess.getVarDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDecl428); 

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
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:237:1: ruleVarDecl : ( ( rule__VarDecl__Group__0 ) ) ;
    public final void ruleVarDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:241:2: ( ( ( rule__VarDecl__Group__0 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:242:1: ( ( rule__VarDecl__Group__0 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:242:1: ( ( rule__VarDecl__Group__0 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:243:1: ( rule__VarDecl__Group__0 )
            {
             before(grammarAccess.getVarDeclAccess().getGroup()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:244:1: ( rule__VarDecl__Group__0 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:244:2: rule__VarDecl__Group__0
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__0_in_ruleVarDecl454);
            rule__VarDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclAccess().getGroup()); 

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
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRuleValueSet"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:256:1: entryRuleValueSet : ruleValueSet EOF ;
    public final void entryRuleValueSet() throws RecognitionException {
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:257:1: ( ruleValueSet EOF )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:258:1: ruleValueSet EOF
            {
             before(grammarAccess.getValueSetRule()); 
            pushFollow(FOLLOW_ruleValueSet_in_entryRuleValueSet481);
            ruleValueSet();

            state._fsp--;

             after(grammarAccess.getValueSetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueSet488); 

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
    // $ANTLR end "entryRuleValueSet"


    // $ANTLR start "ruleValueSet"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:265:1: ruleValueSet : ( ( rule__ValueSet__Alternatives ) ) ;
    public final void ruleValueSet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:269:2: ( ( ( rule__ValueSet__Alternatives ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:270:1: ( ( rule__ValueSet__Alternatives ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:270:1: ( ( rule__ValueSet__Alternatives ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:271:1: ( rule__ValueSet__Alternatives )
            {
             before(grammarAccess.getValueSetAccess().getAlternatives()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:272:1: ( rule__ValueSet__Alternatives )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:272:2: rule__ValueSet__Alternatives
            {
            pushFollow(FOLLOW_rule__ValueSet__Alternatives_in_ruleValueSet514);
            rule__ValueSet__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueSetAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValueSet"


    // $ANTLR start "entryRuleScalar"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:284:1: entryRuleScalar : ruleScalar EOF ;
    public final void entryRuleScalar() throws RecognitionException {
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:285:1: ( ruleScalar EOF )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:286:1: ruleScalar EOF
            {
             before(grammarAccess.getScalarRule()); 
            pushFollow(FOLLOW_ruleScalar_in_entryRuleScalar541);
            ruleScalar();

            state._fsp--;

             after(grammarAccess.getScalarRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScalar548); 

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
    // $ANTLR end "entryRuleScalar"


    // $ANTLR start "ruleScalar"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:293:1: ruleScalar : ( ( rule__Scalar__NameAssignment ) ) ;
    public final void ruleScalar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:297:2: ( ( ( rule__Scalar__NameAssignment ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:298:1: ( ( rule__Scalar__NameAssignment ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:298:1: ( ( rule__Scalar__NameAssignment ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:299:1: ( rule__Scalar__NameAssignment )
            {
             before(grammarAccess.getScalarAccess().getNameAssignment()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:300:1: ( rule__Scalar__NameAssignment )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:300:2: rule__Scalar__NameAssignment
            {
            pushFollow(FOLLOW_rule__Scalar__NameAssignment_in_ruleScalar574);
            rule__Scalar__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getScalarAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleScalar"


    // $ANTLR start "entryRuleSubrange"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:312:1: entryRuleSubrange : ruleSubrange EOF ;
    public final void entryRuleSubrange() throws RecognitionException {
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:313:1: ( ruleSubrange EOF )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:314:1: ruleSubrange EOF
            {
             before(grammarAccess.getSubrangeRule()); 
            pushFollow(FOLLOW_ruleSubrange_in_entryRuleSubrange601);
            ruleSubrange();

            state._fsp--;

             after(grammarAccess.getSubrangeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubrange608); 

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
    // $ANTLR end "entryRuleSubrange"


    // $ANTLR start "ruleSubrange"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:321:1: ruleSubrange : ( ( rule__Subrange__Group__0 ) ) ;
    public final void ruleSubrange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:325:2: ( ( ( rule__Subrange__Group__0 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:326:1: ( ( rule__Subrange__Group__0 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:326:1: ( ( rule__Subrange__Group__0 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:327:1: ( rule__Subrange__Group__0 )
            {
             before(grammarAccess.getSubrangeAccess().getGroup()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:328:1: ( rule__Subrange__Group__0 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:328:2: rule__Subrange__Group__0
            {
            pushFollow(FOLLOW_rule__Subrange__Group__0_in_ruleSubrange634);
            rule__Subrange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubrangeAccess().getGroup()); 

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
    // $ANTLR end "ruleSubrange"


    // $ANTLR start "entryRuleDefinition"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:340:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:341:1: ( ruleDefinition EOF )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:342:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition661);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition668); 

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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:349:1: ruleDefinition : ( 'TO BE CONTINUED' ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:353:2: ( ( 'TO BE CONTINUED' ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:354:1: ( 'TO BE CONTINUED' )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:354:1: ( 'TO BE CONTINUED' )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:355:1: 'TO BE CONTINUED'
            {
             before(grammarAccess.getDefinitionAccess().getTOBECONTINUEDKeyword()); 
            match(input,11,FOLLOW_11_in_ruleDefinition695); 
             after(grammarAccess.getDefinitionAccess().getTOBECONTINUEDKeyword()); 

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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleInitialisation"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:370:1: entryRuleInitialisation : ruleInitialisation EOF ;
    public final void entryRuleInitialisation() throws RecognitionException {
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:371:1: ( ruleInitialisation EOF )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:372:1: ruleInitialisation EOF
            {
             before(grammarAccess.getInitialisationRule()); 
            pushFollow(FOLLOW_ruleInitialisation_in_entryRuleInitialisation723);
            ruleInitialisation();

            state._fsp--;

             after(grammarAccess.getInitialisationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitialisation730); 

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
    // $ANTLR end "entryRuleInitialisation"


    // $ANTLR start "ruleInitialisation"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:379:1: ruleInitialisation : ( ( rule__Initialisation__Group__0 ) ) ;
    public final void ruleInitialisation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:383:2: ( ( ( rule__Initialisation__Group__0 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:384:1: ( ( rule__Initialisation__Group__0 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:384:1: ( ( rule__Initialisation__Group__0 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:385:1: ( rule__Initialisation__Group__0 )
            {
             before(grammarAccess.getInitialisationAccess().getGroup()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:386:1: ( rule__Initialisation__Group__0 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:386:2: rule__Initialisation__Group__0
            {
            pushFollow(FOLLOW_rule__Initialisation__Group__0_in_ruleInitialisation756);
            rule__Initialisation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialisationAccess().getGroup()); 

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
    // $ANTLR end "ruleInitialisation"


    // $ANTLR start "entryRuleTransition"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:398:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:399:1: ( ruleTransition EOF )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:400:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition783);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition790); 

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:407:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:411:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:412:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:412:1: ( ( rule__Transition__Group__0 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:413:1: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:414:1: ( rule__Transition__Group__0 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:414:2: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_rule__Transition__Group__0_in_ruleTransition816);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleGuard"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:426:1: entryRuleGuard : ruleGuard EOF ;
    public final void entryRuleGuard() throws RecognitionException {
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:427:1: ( ruleGuard EOF )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:428:1: ruleGuard EOF
            {
             before(grammarAccess.getGuardRule()); 
            pushFollow(FOLLOW_ruleGuard_in_entryRuleGuard843);
            ruleGuard();

            state._fsp--;

             after(grammarAccess.getGuardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuard850); 

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
    // $ANTLR end "entryRuleGuard"


    // $ANTLR start "ruleGuard"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:435:1: ruleGuard : ( ( rule__Guard__Group__0 ) ) ;
    public final void ruleGuard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:439:2: ( ( ( rule__Guard__Group__0 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:440:1: ( ( rule__Guard__Group__0 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:440:1: ( ( rule__Guard__Group__0 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:441:1: ( rule__Guard__Group__0 )
            {
             before(grammarAccess.getGuardAccess().getGroup()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:442:1: ( rule__Guard__Group__0 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:442:2: rule__Guard__Group__0
            {
            pushFollow(FOLLOW_rule__Guard__Group__0_in_ruleGuard876);
            rule__Guard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuardAccess().getGroup()); 

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
    // $ANTLR end "ruleGuard"


    // $ANTLR start "entryRuleAssignment"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:454:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:455:1: ( ruleAssignment EOF )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:456:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment903);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment910); 

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:463:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:467:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:468:1: ( ( rule__Assignment__Group__0 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:468:1: ( ( rule__Assignment__Group__0 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:469:1: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:470:1: ( rule__Assignment__Group__0 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:470:2: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0_in_ruleAssignment936);
            rule__Assignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "rule__Declarations__Alternatives"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:482:1: rule__Declarations__Alternatives : ( ( ( rule__Declarations__Group_0__0 ) ) | ( ( rule__Declarations__Group_1__0 ) ) | ( ( rule__Declarations__Group_2__0 ) ) | ( ( rule__Declarations__Group_3__0 ) ) | ( ( rule__Declarations__Group_4__0 ) ) | ( ( rule__Declarations__Group_5__0 ) ) );
    public final void rule__Declarations__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:486:1: ( ( ( rule__Declarations__Group_0__0 ) ) | ( ( rule__Declarations__Group_1__0 ) ) | ( ( rule__Declarations__Group_2__0 ) ) | ( ( rule__Declarations__Group_3__0 ) ) | ( ( rule__Declarations__Group_4__0 ) ) | ( ( rule__Declarations__Group_5__0 ) ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 19:
                {
                alt1=2;
                }
                break;
            case 20:
                {
                alt1=3;
                }
                break;
            case 21:
                {
                alt1=4;
                }
                break;
            case 22:
                {
                alt1=5;
                }
                break;
            case 23:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:487:1: ( ( rule__Declarations__Group_0__0 ) )
                    {
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:487:1: ( ( rule__Declarations__Group_0__0 ) )
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:488:1: ( rule__Declarations__Group_0__0 )
                    {
                     before(grammarAccess.getDeclarationsAccess().getGroup_0()); 
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:489:1: ( rule__Declarations__Group_0__0 )
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:489:2: rule__Declarations__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Declarations__Group_0__0_in_rule__Declarations__Alternatives972);
                    rule__Declarations__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclarationsAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:493:6: ( ( rule__Declarations__Group_1__0 ) )
                    {
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:493:6: ( ( rule__Declarations__Group_1__0 ) )
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:494:1: ( rule__Declarations__Group_1__0 )
                    {
                     before(grammarAccess.getDeclarationsAccess().getGroup_1()); 
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:495:1: ( rule__Declarations__Group_1__0 )
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:495:2: rule__Declarations__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Declarations__Group_1__0_in_rule__Declarations__Alternatives990);
                    rule__Declarations__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclarationsAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:499:6: ( ( rule__Declarations__Group_2__0 ) )
                    {
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:499:6: ( ( rule__Declarations__Group_2__0 ) )
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:500:1: ( rule__Declarations__Group_2__0 )
                    {
                     before(grammarAccess.getDeclarationsAccess().getGroup_2()); 
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:501:1: ( rule__Declarations__Group_2__0 )
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:501:2: rule__Declarations__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Declarations__Group_2__0_in_rule__Declarations__Alternatives1008);
                    rule__Declarations__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclarationsAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:505:6: ( ( rule__Declarations__Group_3__0 ) )
                    {
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:505:6: ( ( rule__Declarations__Group_3__0 ) )
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:506:1: ( rule__Declarations__Group_3__0 )
                    {
                     before(grammarAccess.getDeclarationsAccess().getGroup_3()); 
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:507:1: ( rule__Declarations__Group_3__0 )
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:507:2: rule__Declarations__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Declarations__Group_3__0_in_rule__Declarations__Alternatives1026);
                    rule__Declarations__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclarationsAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:511:6: ( ( rule__Declarations__Group_4__0 ) )
                    {
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:511:6: ( ( rule__Declarations__Group_4__0 ) )
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:512:1: ( rule__Declarations__Group_4__0 )
                    {
                     before(grammarAccess.getDeclarationsAccess().getGroup_4()); 
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:513:1: ( rule__Declarations__Group_4__0 )
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:513:2: rule__Declarations__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Declarations__Group_4__0_in_rule__Declarations__Alternatives1044);
                    rule__Declarations__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclarationsAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:517:6: ( ( rule__Declarations__Group_5__0 ) )
                    {
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:517:6: ( ( rule__Declarations__Group_5__0 ) )
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:518:1: ( rule__Declarations__Group_5__0 )
                    {
                     before(grammarAccess.getDeclarationsAccess().getGroup_5()); 
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:519:1: ( rule__Declarations__Group_5__0 )
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:519:2: rule__Declarations__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Declarations__Group_5__0_in_rule__Declarations__Alternatives1062);
                    rule__Declarations__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclarationsAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Declarations__Alternatives"


    // $ANTLR start "rule__ValueSet__Alternatives"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:528:1: rule__ValueSet__Alternatives : ( ( ruleScalar ) | ( ruleSubrange ) );
    public final void rule__ValueSet__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:532:1: ( ( ruleScalar ) | ( ruleSubrange ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==26) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:533:1: ( ruleScalar )
                    {
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:533:1: ( ruleScalar )
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:534:1: ruleScalar
                    {
                     before(grammarAccess.getValueSetAccess().getScalarParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleScalar_in_rule__ValueSet__Alternatives1095);
                    ruleScalar();

                    state._fsp--;

                     after(grammarAccess.getValueSetAccess().getScalarParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:539:6: ( ruleSubrange )
                    {
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:539:6: ( ruleSubrange )
                    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:540:1: ruleSubrange
                    {
                     before(grammarAccess.getValueSetAccess().getSubrangeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSubrange_in_rule__ValueSet__Alternatives1112);
                    ruleSubrange();

                    state._fsp--;

                     after(grammarAccess.getValueSetAccess().getSubrangeParserRuleCall_1()); 

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
    // $ANTLR end "rule__ValueSet__Alternatives"


    // $ANTLR start "rule__Context__Group__0"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:552:1: rule__Context__Group__0 : rule__Context__Group__0__Impl rule__Context__Group__1 ;
    public final void rule__Context__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:556:1: ( rule__Context__Group__0__Impl rule__Context__Group__1 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:557:2: rule__Context__Group__0__Impl rule__Context__Group__1
            {
            pushFollow(FOLLOW_rule__Context__Group__0__Impl_in_rule__Context__Group__01142);
            rule__Context__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Context__Group__1_in_rule__Context__Group__01145);
            rule__Context__Group__1();

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
    // $ANTLR end "rule__Context__Group__0"


    // $ANTLR start "rule__Context__Group__0__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:564:1: rule__Context__Group__0__Impl : ( ( rule__Context__ContextNameAssignment_0 ) ) ;
    public final void rule__Context__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:568:1: ( ( ( rule__Context__ContextNameAssignment_0 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:569:1: ( ( rule__Context__ContextNameAssignment_0 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:569:1: ( ( rule__Context__ContextNameAssignment_0 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:570:1: ( rule__Context__ContextNameAssignment_0 )
            {
             before(grammarAccess.getContextAccess().getContextNameAssignment_0()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:571:1: ( rule__Context__ContextNameAssignment_0 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:571:2: rule__Context__ContextNameAssignment_0
            {
            pushFollow(FOLLOW_rule__Context__ContextNameAssignment_0_in_rule__Context__Group__0__Impl1172);
            rule__Context__ContextNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getContextNameAssignment_0()); 

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
    // $ANTLR end "rule__Context__Group__0__Impl"


    // $ANTLR start "rule__Context__Group__1"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:581:1: rule__Context__Group__1 : rule__Context__Group__1__Impl rule__Context__Group__2 ;
    public final void rule__Context__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:585:1: ( rule__Context__Group__1__Impl rule__Context__Group__2 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:586:2: rule__Context__Group__1__Impl rule__Context__Group__2
            {
            pushFollow(FOLLOW_rule__Context__Group__1__Impl_in_rule__Context__Group__11202);
            rule__Context__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Context__Group__2_in_rule__Context__Group__11205);
            rule__Context__Group__2();

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
    // $ANTLR end "rule__Context__Group__1"


    // $ANTLR start "rule__Context__Group__1__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:593:1: rule__Context__Group__1__Impl : ( ': CONTEXT=' ) ;
    public final void rule__Context__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:597:1: ( ( ': CONTEXT=' ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:598:1: ( ': CONTEXT=' )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:598:1: ( ': CONTEXT=' )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:599:1: ': CONTEXT='
            {
             before(grammarAccess.getContextAccess().getCONTEXTKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__Context__Group__1__Impl1233); 
             after(grammarAccess.getContextAccess().getCONTEXTKeyword_1()); 

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
    // $ANTLR end "rule__Context__Group__1__Impl"


    // $ANTLR start "rule__Context__Group__2"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:612:1: rule__Context__Group__2 : rule__Context__Group__2__Impl ;
    public final void rule__Context__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:616:1: ( rule__Context__Group__2__Impl )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:617:2: rule__Context__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Context__Group__2__Impl_in_rule__Context__Group__21264);
            rule__Context__Group__2__Impl();

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
    // $ANTLR end "rule__Context__Group__2"


    // $ANTLR start "rule__Context__Group__2__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:623:1: rule__Context__Group__2__Impl : ( ( rule__Context__BodyAssignment_2 ) ) ;
    public final void rule__Context__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:627:1: ( ( ( rule__Context__BodyAssignment_2 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:628:1: ( ( rule__Context__BodyAssignment_2 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:628:1: ( ( rule__Context__BodyAssignment_2 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:629:1: ( rule__Context__BodyAssignment_2 )
            {
             before(grammarAccess.getContextAccess().getBodyAssignment_2()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:630:1: ( rule__Context__BodyAssignment_2 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:630:2: rule__Context__BodyAssignment_2
            {
            pushFollow(FOLLOW_rule__Context__BodyAssignment_2_in_rule__Context__Group__2__Impl1291);
            rule__Context__BodyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getBodyAssignment_2()); 

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
    // $ANTLR end "rule__Context__Group__2__Impl"


    // $ANTLR start "rule__Body__Group__0"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:646:1: rule__Body__Group__0 : rule__Body__Group__0__Impl rule__Body__Group__1 ;
    public final void rule__Body__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:650:1: ( rule__Body__Group__0__Impl rule__Body__Group__1 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:651:2: rule__Body__Group__0__Impl rule__Body__Group__1
            {
            pushFollow(FOLLOW_rule__Body__Group__0__Impl_in_rule__Body__Group__01327);
            rule__Body__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__1_in_rule__Body__Group__01330);
            rule__Body__Group__1();

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
    // $ANTLR end "rule__Body__Group__0"


    // $ANTLR start "rule__Body__Group__0__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:658:1: rule__Body__Group__0__Impl : ( 'BEGIN' ) ;
    public final void rule__Body__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:662:1: ( ( 'BEGIN' ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:663:1: ( 'BEGIN' )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:663:1: ( 'BEGIN' )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:664:1: 'BEGIN'
            {
             before(grammarAccess.getBodyAccess().getBEGINKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Body__Group__0__Impl1358); 
             after(grammarAccess.getBodyAccess().getBEGINKeyword_0()); 

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
    // $ANTLR end "rule__Body__Group__0__Impl"


    // $ANTLR start "rule__Body__Group__1"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:677:1: rule__Body__Group__1 : rule__Body__Group__1__Impl rule__Body__Group__2 ;
    public final void rule__Body__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:681:1: ( rule__Body__Group__1__Impl rule__Body__Group__2 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:682:2: rule__Body__Group__1__Impl rule__Body__Group__2
            {
            pushFollow(FOLLOW_rule__Body__Group__1__Impl_in_rule__Body__Group__11389);
            rule__Body__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__2_in_rule__Body__Group__11392);
            rule__Body__Group__2();

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
    // $ANTLR end "rule__Body__Group__1"


    // $ANTLR start "rule__Body__Group__1__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:689:1: rule__Body__Group__1__Impl : ( ( rule__Body__TypesAssignment_1 ) ) ;
    public final void rule__Body__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:693:1: ( ( ( rule__Body__TypesAssignment_1 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:694:1: ( ( rule__Body__TypesAssignment_1 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:694:1: ( ( rule__Body__TypesAssignment_1 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:695:1: ( rule__Body__TypesAssignment_1 )
            {
             before(grammarAccess.getBodyAccess().getTypesAssignment_1()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:696:1: ( rule__Body__TypesAssignment_1 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:696:2: rule__Body__TypesAssignment_1
            {
            pushFollow(FOLLOW_rule__Body__TypesAssignment_1_in_rule__Body__Group__1__Impl1419);
            rule__Body__TypesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBodyAccess().getTypesAssignment_1()); 

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
    // $ANTLR end "rule__Body__Group__1__Impl"


    // $ANTLR start "rule__Body__Group__2"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:706:1: rule__Body__Group__2 : rule__Body__Group__2__Impl rule__Body__Group__3 ;
    public final void rule__Body__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:710:1: ( rule__Body__Group__2__Impl rule__Body__Group__3 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:711:2: rule__Body__Group__2__Impl rule__Body__Group__3
            {
            pushFollow(FOLLOW_rule__Body__Group__2__Impl_in_rule__Body__Group__21449);
            rule__Body__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__3_in_rule__Body__Group__21452);
            rule__Body__Group__3();

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
    // $ANTLR end "rule__Body__Group__2"


    // $ANTLR start "rule__Body__Group__2__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:718:1: rule__Body__Group__2__Impl : ( ( rule__Body__ModuleAssignment_2 ) ) ;
    public final void rule__Body__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:722:1: ( ( ( rule__Body__ModuleAssignment_2 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:723:1: ( ( rule__Body__ModuleAssignment_2 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:723:1: ( ( rule__Body__ModuleAssignment_2 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:724:1: ( rule__Body__ModuleAssignment_2 )
            {
             before(grammarAccess.getBodyAccess().getModuleAssignment_2()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:725:1: ( rule__Body__ModuleAssignment_2 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:725:2: rule__Body__ModuleAssignment_2
            {
            pushFollow(FOLLOW_rule__Body__ModuleAssignment_2_in_rule__Body__Group__2__Impl1479);
            rule__Body__ModuleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBodyAccess().getModuleAssignment_2()); 

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
    // $ANTLR end "rule__Body__Group__2__Impl"


    // $ANTLR start "rule__Body__Group__3"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:735:1: rule__Body__Group__3 : rule__Body__Group__3__Impl ;
    public final void rule__Body__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:739:1: ( rule__Body__Group__3__Impl )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:740:2: rule__Body__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group__3__Impl_in_rule__Body__Group__31509);
            rule__Body__Group__3__Impl();

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
    // $ANTLR end "rule__Body__Group__3"


    // $ANTLR start "rule__Body__Group__3__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:746:1: rule__Body__Group__3__Impl : ( 'END' ) ;
    public final void rule__Body__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:750:1: ( ( 'END' ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:751:1: ( 'END' )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:751:1: ( 'END' )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:752:1: 'END'
            {
             before(grammarAccess.getBodyAccess().getENDKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Body__Group__3__Impl1537); 
             after(grammarAccess.getBodyAccess().getENDKeyword_3()); 

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
    // $ANTLR end "rule__Body__Group__3__Impl"


    // $ANTLR start "rule__TypeDeclaration__Group__0"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:773:1: rule__TypeDeclaration__Group__0 : rule__TypeDeclaration__Group__0__Impl rule__TypeDeclaration__Group__1 ;
    public final void rule__TypeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:777:1: ( rule__TypeDeclaration__Group__0__Impl rule__TypeDeclaration__Group__1 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:778:2: rule__TypeDeclaration__Group__0__Impl rule__TypeDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__TypeDeclaration__Group__0__Impl_in_rule__TypeDeclaration__Group__01576);
            rule__TypeDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDeclaration__Group__1_in_rule__TypeDeclaration__Group__01579);
            rule__TypeDeclaration__Group__1();

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
    // $ANTLR end "rule__TypeDeclaration__Group__0"


    // $ANTLR start "rule__TypeDeclaration__Group__0__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:785:1: rule__TypeDeclaration__Group__0__Impl : ( ( rule__TypeDeclaration__TypeNameAssignment_0 ) ) ;
    public final void rule__TypeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:789:1: ( ( ( rule__TypeDeclaration__TypeNameAssignment_0 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:790:1: ( ( rule__TypeDeclaration__TypeNameAssignment_0 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:790:1: ( ( rule__TypeDeclaration__TypeNameAssignment_0 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:791:1: ( rule__TypeDeclaration__TypeNameAssignment_0 )
            {
             before(grammarAccess.getTypeDeclarationAccess().getTypeNameAssignment_0()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:792:1: ( rule__TypeDeclaration__TypeNameAssignment_0 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:792:2: rule__TypeDeclaration__TypeNameAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeDeclaration__TypeNameAssignment_0_in_rule__TypeDeclaration__Group__0__Impl1606);
            rule__TypeDeclaration__TypeNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclarationAccess().getTypeNameAssignment_0()); 

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
    // $ANTLR end "rule__TypeDeclaration__Group__0__Impl"


    // $ANTLR start "rule__TypeDeclaration__Group__1"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:802:1: rule__TypeDeclaration__Group__1 : rule__TypeDeclaration__Group__1__Impl rule__TypeDeclaration__Group__2 ;
    public final void rule__TypeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:806:1: ( rule__TypeDeclaration__Group__1__Impl rule__TypeDeclaration__Group__2 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:807:2: rule__TypeDeclaration__Group__1__Impl rule__TypeDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__TypeDeclaration__Group__1__Impl_in_rule__TypeDeclaration__Group__11636);
            rule__TypeDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDeclaration__Group__2_in_rule__TypeDeclaration__Group__11639);
            rule__TypeDeclaration__Group__2();

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
    // $ANTLR end "rule__TypeDeclaration__Group__1"


    // $ANTLR start "rule__TypeDeclaration__Group__1__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:814:1: rule__TypeDeclaration__Group__1__Impl : ( ': TYPE={' ) ;
    public final void rule__TypeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:818:1: ( ( ': TYPE={' ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:819:1: ( ': TYPE={' )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:819:1: ( ': TYPE={' )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:820:1: ': TYPE={'
            {
             before(grammarAccess.getTypeDeclarationAccess().getTYPEKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__TypeDeclaration__Group__1__Impl1667); 
             after(grammarAccess.getTypeDeclarationAccess().getTYPEKeyword_1()); 

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
    // $ANTLR end "rule__TypeDeclaration__Group__1__Impl"


    // $ANTLR start "rule__TypeDeclaration__Group__2"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:833:1: rule__TypeDeclaration__Group__2 : rule__TypeDeclaration__Group__2__Impl rule__TypeDeclaration__Group__3 ;
    public final void rule__TypeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:837:1: ( rule__TypeDeclaration__Group__2__Impl rule__TypeDeclaration__Group__3 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:838:2: rule__TypeDeclaration__Group__2__Impl rule__TypeDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__TypeDeclaration__Group__2__Impl_in_rule__TypeDeclaration__Group__21698);
            rule__TypeDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDeclaration__Group__3_in_rule__TypeDeclaration__Group__21701);
            rule__TypeDeclaration__Group__3();

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
    // $ANTLR end "rule__TypeDeclaration__Group__2"


    // $ANTLR start "rule__TypeDeclaration__Group__2__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:845:1: rule__TypeDeclaration__Group__2__Impl : ( ( rule__TypeDeclaration__TypeValuesAssignment_2 ) ) ;
    public final void rule__TypeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:849:1: ( ( ( rule__TypeDeclaration__TypeValuesAssignment_2 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:850:1: ( ( rule__TypeDeclaration__TypeValuesAssignment_2 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:850:1: ( ( rule__TypeDeclaration__TypeValuesAssignment_2 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:851:1: ( rule__TypeDeclaration__TypeValuesAssignment_2 )
            {
             before(grammarAccess.getTypeDeclarationAccess().getTypeValuesAssignment_2()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:852:1: ( rule__TypeDeclaration__TypeValuesAssignment_2 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:852:2: rule__TypeDeclaration__TypeValuesAssignment_2
            {
            pushFollow(FOLLOW_rule__TypeDeclaration__TypeValuesAssignment_2_in_rule__TypeDeclaration__Group__2__Impl1728);
            rule__TypeDeclaration__TypeValuesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclarationAccess().getTypeValuesAssignment_2()); 

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
    // $ANTLR end "rule__TypeDeclaration__Group__2__Impl"


    // $ANTLR start "rule__TypeDeclaration__Group__3"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:862:1: rule__TypeDeclaration__Group__3 : rule__TypeDeclaration__Group__3__Impl ;
    public final void rule__TypeDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:866:1: ( rule__TypeDeclaration__Group__3__Impl )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:867:2: rule__TypeDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TypeDeclaration__Group__3__Impl_in_rule__TypeDeclaration__Group__31758);
            rule__TypeDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__TypeDeclaration__Group__3"


    // $ANTLR start "rule__TypeDeclaration__Group__3__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:873:1: rule__TypeDeclaration__Group__3__Impl : ( '};' ) ;
    public final void rule__TypeDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:877:1: ( ( '};' ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:878:1: ( '};' )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:878:1: ( '};' )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:879:1: '};'
            {
             before(grammarAccess.getTypeDeclarationAccess().getRightCurlyBracketSemicolonKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__TypeDeclaration__Group__3__Impl1786); 
             after(grammarAccess.getTypeDeclarationAccess().getRightCurlyBracketSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__TypeDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ModuleDeclaration__Group__0"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:900:1: rule__ModuleDeclaration__Group__0 : rule__ModuleDeclaration__Group__0__Impl rule__ModuleDeclaration__Group__1 ;
    public final void rule__ModuleDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:904:1: ( rule__ModuleDeclaration__Group__0__Impl rule__ModuleDeclaration__Group__1 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:905:2: rule__ModuleDeclaration__Group__0__Impl rule__ModuleDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ModuleDeclaration__Group__0__Impl_in_rule__ModuleDeclaration__Group__01825);
            rule__ModuleDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleDeclaration__Group__1_in_rule__ModuleDeclaration__Group__01828);
            rule__ModuleDeclaration__Group__1();

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
    // $ANTLR end "rule__ModuleDeclaration__Group__0"


    // $ANTLR start "rule__ModuleDeclaration__Group__0__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:912:1: rule__ModuleDeclaration__Group__0__Impl : ( ( rule__ModuleDeclaration__ModuleNameAssignment_0 ) ) ;
    public final void rule__ModuleDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:916:1: ( ( ( rule__ModuleDeclaration__ModuleNameAssignment_0 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:917:1: ( ( rule__ModuleDeclaration__ModuleNameAssignment_0 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:917:1: ( ( rule__ModuleDeclaration__ModuleNameAssignment_0 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:918:1: ( rule__ModuleDeclaration__ModuleNameAssignment_0 )
            {
             before(grammarAccess.getModuleDeclarationAccess().getModuleNameAssignment_0()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:919:1: ( rule__ModuleDeclaration__ModuleNameAssignment_0 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:919:2: rule__ModuleDeclaration__ModuleNameAssignment_0
            {
            pushFollow(FOLLOW_rule__ModuleDeclaration__ModuleNameAssignment_0_in_rule__ModuleDeclaration__Group__0__Impl1855);
            rule__ModuleDeclaration__ModuleNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModuleDeclarationAccess().getModuleNameAssignment_0()); 

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
    // $ANTLR end "rule__ModuleDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ModuleDeclaration__Group__1"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:929:1: rule__ModuleDeclaration__Group__1 : rule__ModuleDeclaration__Group__1__Impl rule__ModuleDeclaration__Group__2 ;
    public final void rule__ModuleDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:933:1: ( rule__ModuleDeclaration__Group__1__Impl rule__ModuleDeclaration__Group__2 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:934:2: rule__ModuleDeclaration__Group__1__Impl rule__ModuleDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ModuleDeclaration__Group__1__Impl_in_rule__ModuleDeclaration__Group__11885);
            rule__ModuleDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleDeclaration__Group__2_in_rule__ModuleDeclaration__Group__11888);
            rule__ModuleDeclaration__Group__2();

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
    // $ANTLR end "rule__ModuleDeclaration__Group__1"


    // $ANTLR start "rule__ModuleDeclaration__Group__1__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:941:1: rule__ModuleDeclaration__Group__1__Impl : ( ': MODULE=' ) ;
    public final void rule__ModuleDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:945:1: ( ( ': MODULE=' ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:946:1: ( ': MODULE=' )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:946:1: ( ': MODULE=' )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:947:1: ': MODULE='
            {
             before(grammarAccess.getModuleDeclarationAccess().getMODULEKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__ModuleDeclaration__Group__1__Impl1916); 
             after(grammarAccess.getModuleDeclarationAccess().getMODULEKeyword_1()); 

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
    // $ANTLR end "rule__ModuleDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ModuleDeclaration__Group__2"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:960:1: rule__ModuleDeclaration__Group__2 : rule__ModuleDeclaration__Group__2__Impl ;
    public final void rule__ModuleDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:964:1: ( rule__ModuleDeclaration__Group__2__Impl )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:965:2: rule__ModuleDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ModuleDeclaration__Group__2__Impl_in_rule__ModuleDeclaration__Group__21947);
            rule__ModuleDeclaration__Group__2__Impl();

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
    // $ANTLR end "rule__ModuleDeclaration__Group__2"


    // $ANTLR start "rule__ModuleDeclaration__Group__2__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:971:1: rule__ModuleDeclaration__Group__2__Impl : ( ( rule__ModuleDeclaration__ModuleAssignment_2 ) ) ;
    public final void rule__ModuleDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:975:1: ( ( ( rule__ModuleDeclaration__ModuleAssignment_2 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:976:1: ( ( rule__ModuleDeclaration__ModuleAssignment_2 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:976:1: ( ( rule__ModuleDeclaration__ModuleAssignment_2 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:977:1: ( rule__ModuleDeclaration__ModuleAssignment_2 )
            {
             before(grammarAccess.getModuleDeclarationAccess().getModuleAssignment_2()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:978:1: ( rule__ModuleDeclaration__ModuleAssignment_2 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:978:2: rule__ModuleDeclaration__ModuleAssignment_2
            {
            pushFollow(FOLLOW_rule__ModuleDeclaration__ModuleAssignment_2_in_rule__ModuleDeclaration__Group__2__Impl1974);
            rule__ModuleDeclaration__ModuleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModuleDeclarationAccess().getModuleAssignment_2()); 

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
    // $ANTLR end "rule__ModuleDeclaration__Group__2__Impl"


    // $ANTLR start "rule__Module__Group__0"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:994:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:998:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:999:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__02010);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__1_in_rule__Module__Group__02013);
            rule__Module__Group__1();

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
    // $ANTLR end "rule__Module__Group__0"


    // $ANTLR start "rule__Module__Group__0__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1006:1: rule__Module__Group__0__Impl : ( 'BEGIN' ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1010:1: ( ( 'BEGIN' ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1011:1: ( 'BEGIN' )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1011:1: ( 'BEGIN' )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1012:1: 'BEGIN'
            {
             before(grammarAccess.getModuleAccess().getBEGINKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Module__Group__0__Impl2041); 
             after(grammarAccess.getModuleAccess().getBEGINKeyword_0()); 

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
    // $ANTLR end "rule__Module__Group__0__Impl"


    // $ANTLR start "rule__Module__Group__1"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1025:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1029:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1030:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__12072);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__2_in_rule__Module__Group__12075);
            rule__Module__Group__2();

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
    // $ANTLR end "rule__Module__Group__1"


    // $ANTLR start "rule__Module__Group__1__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1037:1: rule__Module__Group__1__Impl : ( ( rule__Module__DeclarationAssignment_1 ) ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1041:1: ( ( ( rule__Module__DeclarationAssignment_1 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1042:1: ( ( rule__Module__DeclarationAssignment_1 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1042:1: ( ( rule__Module__DeclarationAssignment_1 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1043:1: ( rule__Module__DeclarationAssignment_1 )
            {
             before(grammarAccess.getModuleAccess().getDeclarationAssignment_1()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1044:1: ( rule__Module__DeclarationAssignment_1 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1044:2: rule__Module__DeclarationAssignment_1
            {
            pushFollow(FOLLOW_rule__Module__DeclarationAssignment_1_in_rule__Module__Group__1__Impl2102);
            rule__Module__DeclarationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getDeclarationAssignment_1()); 

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
    // $ANTLR end "rule__Module__Group__1__Impl"


    // $ANTLR start "rule__Module__Group__2"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1054:1: rule__Module__Group__2 : rule__Module__Group__2__Impl ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1058:1: ( rule__Module__Group__2__Impl )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1059:2: rule__Module__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__22132);
            rule__Module__Group__2__Impl();

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
    // $ANTLR end "rule__Module__Group__2"


    // $ANTLR start "rule__Module__Group__2__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1065:1: rule__Module__Group__2__Impl : ( 'END' ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1069:1: ( ( 'END' ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1070:1: ( 'END' )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1070:1: ( 'END' )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1071:1: 'END'
            {
             before(grammarAccess.getModuleAccess().getENDKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Module__Group__2__Impl2160); 
             after(grammarAccess.getModuleAccess().getENDKeyword_2()); 

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
    // $ANTLR end "rule__Module__Group__2__Impl"


    // $ANTLR start "rule__Declarations__Group_0__0"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1090:1: rule__Declarations__Group_0__0 : rule__Declarations__Group_0__0__Impl rule__Declarations__Group_0__1 ;
    public final void rule__Declarations__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1094:1: ( rule__Declarations__Group_0__0__Impl rule__Declarations__Group_0__1 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1095:2: rule__Declarations__Group_0__0__Impl rule__Declarations__Group_0__1
            {
            pushFollow(FOLLOW_rule__Declarations__Group_0__0__Impl_in_rule__Declarations__Group_0__02197);
            rule__Declarations__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declarations__Group_0__1_in_rule__Declarations__Group_0__02200);
            rule__Declarations__Group_0__1();

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
    // $ANTLR end "rule__Declarations__Group_0__0"


    // $ANTLR start "rule__Declarations__Group_0__0__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1102:1: rule__Declarations__Group_0__0__Impl : ( 'INPUT' ) ;
    public final void rule__Declarations__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1106:1: ( ( 'INPUT' ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1107:1: ( 'INPUT' )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1107:1: ( 'INPUT' )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1108:1: 'INPUT'
            {
             before(grammarAccess.getDeclarationsAccess().getINPUTKeyword_0_0()); 
            match(input,18,FOLLOW_18_in_rule__Declarations__Group_0__0__Impl2228); 
             after(grammarAccess.getDeclarationsAccess().getINPUTKeyword_0_0()); 

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
    // $ANTLR end "rule__Declarations__Group_0__0__Impl"


    // $ANTLR start "rule__Declarations__Group_0__1"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1121:1: rule__Declarations__Group_0__1 : rule__Declarations__Group_0__1__Impl ;
    public final void rule__Declarations__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1125:1: ( rule__Declarations__Group_0__1__Impl )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1126:2: rule__Declarations__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Declarations__Group_0__1__Impl_in_rule__Declarations__Group_0__12259);
            rule__Declarations__Group_0__1__Impl();

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
    // $ANTLR end "rule__Declarations__Group_0__1"


    // $ANTLR start "rule__Declarations__Group_0__1__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1132:1: rule__Declarations__Group_0__1__Impl : ( ( rule__Declarations__VariableDeclarationsAssignment_0_1 ) ) ;
    public final void rule__Declarations__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1136:1: ( ( ( rule__Declarations__VariableDeclarationsAssignment_0_1 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1137:1: ( ( rule__Declarations__VariableDeclarationsAssignment_0_1 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1137:1: ( ( rule__Declarations__VariableDeclarationsAssignment_0_1 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1138:1: ( rule__Declarations__VariableDeclarationsAssignment_0_1 )
            {
             before(grammarAccess.getDeclarationsAccess().getVariableDeclarationsAssignment_0_1()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1139:1: ( rule__Declarations__VariableDeclarationsAssignment_0_1 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1139:2: rule__Declarations__VariableDeclarationsAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Declarations__VariableDeclarationsAssignment_0_1_in_rule__Declarations__Group_0__1__Impl2286);
            rule__Declarations__VariableDeclarationsAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationsAccess().getVariableDeclarationsAssignment_0_1()); 

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
    // $ANTLR end "rule__Declarations__Group_0__1__Impl"


    // $ANTLR start "rule__Declarations__Group_1__0"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1153:1: rule__Declarations__Group_1__0 : rule__Declarations__Group_1__0__Impl rule__Declarations__Group_1__1 ;
    public final void rule__Declarations__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1157:1: ( rule__Declarations__Group_1__0__Impl rule__Declarations__Group_1__1 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1158:2: rule__Declarations__Group_1__0__Impl rule__Declarations__Group_1__1
            {
            pushFollow(FOLLOW_rule__Declarations__Group_1__0__Impl_in_rule__Declarations__Group_1__02320);
            rule__Declarations__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declarations__Group_1__1_in_rule__Declarations__Group_1__02323);
            rule__Declarations__Group_1__1();

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
    // $ANTLR end "rule__Declarations__Group_1__0"


    // $ANTLR start "rule__Declarations__Group_1__0__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1165:1: rule__Declarations__Group_1__0__Impl : ( 'OUTPUT' ) ;
    public final void rule__Declarations__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1169:1: ( ( 'OUTPUT' ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1170:1: ( 'OUTPUT' )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1170:1: ( 'OUTPUT' )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1171:1: 'OUTPUT'
            {
             before(grammarAccess.getDeclarationsAccess().getOUTPUTKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__Declarations__Group_1__0__Impl2351); 
             after(grammarAccess.getDeclarationsAccess().getOUTPUTKeyword_1_0()); 

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
    // $ANTLR end "rule__Declarations__Group_1__0__Impl"


    // $ANTLR start "rule__Declarations__Group_1__1"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1184:1: rule__Declarations__Group_1__1 : rule__Declarations__Group_1__1__Impl ;
    public final void rule__Declarations__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1188:1: ( rule__Declarations__Group_1__1__Impl )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1189:2: rule__Declarations__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Declarations__Group_1__1__Impl_in_rule__Declarations__Group_1__12382);
            rule__Declarations__Group_1__1__Impl();

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
    // $ANTLR end "rule__Declarations__Group_1__1"


    // $ANTLR start "rule__Declarations__Group_1__1__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1195:1: rule__Declarations__Group_1__1__Impl : ( ( rule__Declarations__VariableDeclarationsAssignment_1_1 ) ) ;
    public final void rule__Declarations__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1199:1: ( ( ( rule__Declarations__VariableDeclarationsAssignment_1_1 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1200:1: ( ( rule__Declarations__VariableDeclarationsAssignment_1_1 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1200:1: ( ( rule__Declarations__VariableDeclarationsAssignment_1_1 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1201:1: ( rule__Declarations__VariableDeclarationsAssignment_1_1 )
            {
             before(grammarAccess.getDeclarationsAccess().getVariableDeclarationsAssignment_1_1()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1202:1: ( rule__Declarations__VariableDeclarationsAssignment_1_1 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1202:2: rule__Declarations__VariableDeclarationsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Declarations__VariableDeclarationsAssignment_1_1_in_rule__Declarations__Group_1__1__Impl2409);
            rule__Declarations__VariableDeclarationsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationsAccess().getVariableDeclarationsAssignment_1_1()); 

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
    // $ANTLR end "rule__Declarations__Group_1__1__Impl"


    // $ANTLR start "rule__Declarations__Group_2__0"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1216:1: rule__Declarations__Group_2__0 : rule__Declarations__Group_2__0__Impl rule__Declarations__Group_2__1 ;
    public final void rule__Declarations__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1220:1: ( rule__Declarations__Group_2__0__Impl rule__Declarations__Group_2__1 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1221:2: rule__Declarations__Group_2__0__Impl rule__Declarations__Group_2__1
            {
            pushFollow(FOLLOW_rule__Declarations__Group_2__0__Impl_in_rule__Declarations__Group_2__02443);
            rule__Declarations__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declarations__Group_2__1_in_rule__Declarations__Group_2__02446);
            rule__Declarations__Group_2__1();

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
    // $ANTLR end "rule__Declarations__Group_2__0"


    // $ANTLR start "rule__Declarations__Group_2__0__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1228:1: rule__Declarations__Group_2__0__Impl : ( 'LOCAL' ) ;
    public final void rule__Declarations__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1232:1: ( ( 'LOCAL' ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1233:1: ( 'LOCAL' )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1233:1: ( 'LOCAL' )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1234:1: 'LOCAL'
            {
             before(grammarAccess.getDeclarationsAccess().getLOCALKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__Declarations__Group_2__0__Impl2474); 
             after(grammarAccess.getDeclarationsAccess().getLOCALKeyword_2_0()); 

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
    // $ANTLR end "rule__Declarations__Group_2__0__Impl"


    // $ANTLR start "rule__Declarations__Group_2__1"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1247:1: rule__Declarations__Group_2__1 : rule__Declarations__Group_2__1__Impl ;
    public final void rule__Declarations__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1251:1: ( rule__Declarations__Group_2__1__Impl )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1252:2: rule__Declarations__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Declarations__Group_2__1__Impl_in_rule__Declarations__Group_2__12505);
            rule__Declarations__Group_2__1__Impl();

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
    // $ANTLR end "rule__Declarations__Group_2__1"


    // $ANTLR start "rule__Declarations__Group_2__1__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1258:1: rule__Declarations__Group_2__1__Impl : ( ( rule__Declarations__VariableDeclarationsAssignment_2_1 ) ) ;
    public final void rule__Declarations__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1262:1: ( ( ( rule__Declarations__VariableDeclarationsAssignment_2_1 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1263:1: ( ( rule__Declarations__VariableDeclarationsAssignment_2_1 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1263:1: ( ( rule__Declarations__VariableDeclarationsAssignment_2_1 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1264:1: ( rule__Declarations__VariableDeclarationsAssignment_2_1 )
            {
             before(grammarAccess.getDeclarationsAccess().getVariableDeclarationsAssignment_2_1()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1265:1: ( rule__Declarations__VariableDeclarationsAssignment_2_1 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1265:2: rule__Declarations__VariableDeclarationsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Declarations__VariableDeclarationsAssignment_2_1_in_rule__Declarations__Group_2__1__Impl2532);
            rule__Declarations__VariableDeclarationsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationsAccess().getVariableDeclarationsAssignment_2_1()); 

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
    // $ANTLR end "rule__Declarations__Group_2__1__Impl"


    // $ANTLR start "rule__Declarations__Group_3__0"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1279:1: rule__Declarations__Group_3__0 : rule__Declarations__Group_3__0__Impl rule__Declarations__Group_3__1 ;
    public final void rule__Declarations__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1283:1: ( rule__Declarations__Group_3__0__Impl rule__Declarations__Group_3__1 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1284:2: rule__Declarations__Group_3__0__Impl rule__Declarations__Group_3__1
            {
            pushFollow(FOLLOW_rule__Declarations__Group_3__0__Impl_in_rule__Declarations__Group_3__02566);
            rule__Declarations__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declarations__Group_3__1_in_rule__Declarations__Group_3__02569);
            rule__Declarations__Group_3__1();

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
    // $ANTLR end "rule__Declarations__Group_3__0"


    // $ANTLR start "rule__Declarations__Group_3__0__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1291:1: rule__Declarations__Group_3__0__Impl : ( 'DEFINITION' ) ;
    public final void rule__Declarations__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1295:1: ( ( 'DEFINITION' ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1296:1: ( 'DEFINITION' )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1296:1: ( 'DEFINITION' )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1297:1: 'DEFINITION'
            {
             before(grammarAccess.getDeclarationsAccess().getDEFINITIONKeyword_3_0()); 
            match(input,21,FOLLOW_21_in_rule__Declarations__Group_3__0__Impl2597); 
             after(grammarAccess.getDeclarationsAccess().getDEFINITIONKeyword_3_0()); 

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
    // $ANTLR end "rule__Declarations__Group_3__0__Impl"


    // $ANTLR start "rule__Declarations__Group_3__1"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1310:1: rule__Declarations__Group_3__1 : rule__Declarations__Group_3__1__Impl ;
    public final void rule__Declarations__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1314:1: ( rule__Declarations__Group_3__1__Impl )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1315:2: rule__Declarations__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Declarations__Group_3__1__Impl_in_rule__Declarations__Group_3__12628);
            rule__Declarations__Group_3__1__Impl();

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
    // $ANTLR end "rule__Declarations__Group_3__1"


    // $ANTLR start "rule__Declarations__Group_3__1__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1321:1: rule__Declarations__Group_3__1__Impl : ( ( rule__Declarations__DefinitionsAssignment_3_1 ) ) ;
    public final void rule__Declarations__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1325:1: ( ( ( rule__Declarations__DefinitionsAssignment_3_1 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1326:1: ( ( rule__Declarations__DefinitionsAssignment_3_1 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1326:1: ( ( rule__Declarations__DefinitionsAssignment_3_1 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1327:1: ( rule__Declarations__DefinitionsAssignment_3_1 )
            {
             before(grammarAccess.getDeclarationsAccess().getDefinitionsAssignment_3_1()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1328:1: ( rule__Declarations__DefinitionsAssignment_3_1 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1328:2: rule__Declarations__DefinitionsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Declarations__DefinitionsAssignment_3_1_in_rule__Declarations__Group_3__1__Impl2655);
            rule__Declarations__DefinitionsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationsAccess().getDefinitionsAssignment_3_1()); 

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
    // $ANTLR end "rule__Declarations__Group_3__1__Impl"


    // $ANTLR start "rule__Declarations__Group_4__0"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1342:1: rule__Declarations__Group_4__0 : rule__Declarations__Group_4__0__Impl rule__Declarations__Group_4__1 ;
    public final void rule__Declarations__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1346:1: ( rule__Declarations__Group_4__0__Impl rule__Declarations__Group_4__1 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1347:2: rule__Declarations__Group_4__0__Impl rule__Declarations__Group_4__1
            {
            pushFollow(FOLLOW_rule__Declarations__Group_4__0__Impl_in_rule__Declarations__Group_4__02689);
            rule__Declarations__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declarations__Group_4__1_in_rule__Declarations__Group_4__02692);
            rule__Declarations__Group_4__1();

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
    // $ANTLR end "rule__Declarations__Group_4__0"


    // $ANTLR start "rule__Declarations__Group_4__0__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1354:1: rule__Declarations__Group_4__0__Impl : ( 'INITIALIZATION' ) ;
    public final void rule__Declarations__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1358:1: ( ( 'INITIALIZATION' ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1359:1: ( 'INITIALIZATION' )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1359:1: ( 'INITIALIZATION' )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1360:1: 'INITIALIZATION'
            {
             before(grammarAccess.getDeclarationsAccess().getINITIALIZATIONKeyword_4_0()); 
            match(input,22,FOLLOW_22_in_rule__Declarations__Group_4__0__Impl2720); 
             after(grammarAccess.getDeclarationsAccess().getINITIALIZATIONKeyword_4_0()); 

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
    // $ANTLR end "rule__Declarations__Group_4__0__Impl"


    // $ANTLR start "rule__Declarations__Group_4__1"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1373:1: rule__Declarations__Group_4__1 : rule__Declarations__Group_4__1__Impl ;
    public final void rule__Declarations__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1377:1: ( rule__Declarations__Group_4__1__Impl )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1378:2: rule__Declarations__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Declarations__Group_4__1__Impl_in_rule__Declarations__Group_4__12751);
            rule__Declarations__Group_4__1__Impl();

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
    // $ANTLR end "rule__Declarations__Group_4__1"


    // $ANTLR start "rule__Declarations__Group_4__1__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1384:1: rule__Declarations__Group_4__1__Impl : ( ( rule__Declarations__InitialisationsAssignment_4_1 ) ) ;
    public final void rule__Declarations__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1388:1: ( ( ( rule__Declarations__InitialisationsAssignment_4_1 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1389:1: ( ( rule__Declarations__InitialisationsAssignment_4_1 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1389:1: ( ( rule__Declarations__InitialisationsAssignment_4_1 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1390:1: ( rule__Declarations__InitialisationsAssignment_4_1 )
            {
             before(grammarAccess.getDeclarationsAccess().getInitialisationsAssignment_4_1()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1391:1: ( rule__Declarations__InitialisationsAssignment_4_1 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1391:2: rule__Declarations__InitialisationsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Declarations__InitialisationsAssignment_4_1_in_rule__Declarations__Group_4__1__Impl2778);
            rule__Declarations__InitialisationsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationsAccess().getInitialisationsAssignment_4_1()); 

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
    // $ANTLR end "rule__Declarations__Group_4__1__Impl"


    // $ANTLR start "rule__Declarations__Group_5__0"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1405:1: rule__Declarations__Group_5__0 : rule__Declarations__Group_5__0__Impl rule__Declarations__Group_5__1 ;
    public final void rule__Declarations__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1409:1: ( rule__Declarations__Group_5__0__Impl rule__Declarations__Group_5__1 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1410:2: rule__Declarations__Group_5__0__Impl rule__Declarations__Group_5__1
            {
            pushFollow(FOLLOW_rule__Declarations__Group_5__0__Impl_in_rule__Declarations__Group_5__02812);
            rule__Declarations__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declarations__Group_5__1_in_rule__Declarations__Group_5__02815);
            rule__Declarations__Group_5__1();

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
    // $ANTLR end "rule__Declarations__Group_5__0"


    // $ANTLR start "rule__Declarations__Group_5__0__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1417:1: rule__Declarations__Group_5__0__Impl : ( 'TRANSITION [' ) ;
    public final void rule__Declarations__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1421:1: ( ( 'TRANSITION [' ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1422:1: ( 'TRANSITION [' )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1422:1: ( 'TRANSITION [' )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1423:1: 'TRANSITION ['
            {
             before(grammarAccess.getDeclarationsAccess().getTRANSITIONKeyword_5_0()); 
            match(input,23,FOLLOW_23_in_rule__Declarations__Group_5__0__Impl2843); 
             after(grammarAccess.getDeclarationsAccess().getTRANSITIONKeyword_5_0()); 

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
    // $ANTLR end "rule__Declarations__Group_5__0__Impl"


    // $ANTLR start "rule__Declarations__Group_5__1"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1436:1: rule__Declarations__Group_5__1 : rule__Declarations__Group_5__1__Impl rule__Declarations__Group_5__2 ;
    public final void rule__Declarations__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1440:1: ( rule__Declarations__Group_5__1__Impl rule__Declarations__Group_5__2 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1441:2: rule__Declarations__Group_5__1__Impl rule__Declarations__Group_5__2
            {
            pushFollow(FOLLOW_rule__Declarations__Group_5__1__Impl_in_rule__Declarations__Group_5__12874);
            rule__Declarations__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declarations__Group_5__2_in_rule__Declarations__Group_5__12877);
            rule__Declarations__Group_5__2();

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
    // $ANTLR end "rule__Declarations__Group_5__1"


    // $ANTLR start "rule__Declarations__Group_5__1__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1448:1: rule__Declarations__Group_5__1__Impl : ( ( rule__Declarations__TransitionsAssignment_5_1 ) ) ;
    public final void rule__Declarations__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1452:1: ( ( ( rule__Declarations__TransitionsAssignment_5_1 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1453:1: ( ( rule__Declarations__TransitionsAssignment_5_1 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1453:1: ( ( rule__Declarations__TransitionsAssignment_5_1 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1454:1: ( rule__Declarations__TransitionsAssignment_5_1 )
            {
             before(grammarAccess.getDeclarationsAccess().getTransitionsAssignment_5_1()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1455:1: ( rule__Declarations__TransitionsAssignment_5_1 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1455:2: rule__Declarations__TransitionsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Declarations__TransitionsAssignment_5_1_in_rule__Declarations__Group_5__1__Impl2904);
            rule__Declarations__TransitionsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationsAccess().getTransitionsAssignment_5_1()); 

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
    // $ANTLR end "rule__Declarations__Group_5__1__Impl"


    // $ANTLR start "rule__Declarations__Group_5__2"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1465:1: rule__Declarations__Group_5__2 : rule__Declarations__Group_5__2__Impl ;
    public final void rule__Declarations__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1469:1: ( rule__Declarations__Group_5__2__Impl )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1470:2: rule__Declarations__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Declarations__Group_5__2__Impl_in_rule__Declarations__Group_5__22934);
            rule__Declarations__Group_5__2__Impl();

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
    // $ANTLR end "rule__Declarations__Group_5__2"


    // $ANTLR start "rule__Declarations__Group_5__2__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1476:1: rule__Declarations__Group_5__2__Impl : ( ']' ) ;
    public final void rule__Declarations__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1480:1: ( ( ']' ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1481:1: ( ']' )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1481:1: ( ']' )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1482:1: ']'
            {
             before(grammarAccess.getDeclarationsAccess().getRightSquareBracketKeyword_5_2()); 
            match(input,24,FOLLOW_24_in_rule__Declarations__Group_5__2__Impl2962); 
             after(grammarAccess.getDeclarationsAccess().getRightSquareBracketKeyword_5_2()); 

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
    // $ANTLR end "rule__Declarations__Group_5__2__Impl"


    // $ANTLR start "rule__VarDecl__Group__0"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1501:1: rule__VarDecl__Group__0 : rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1 ;
    public final void rule__VarDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1505:1: ( rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1506:2: rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__0__Impl_in_rule__VarDecl__Group__02999);
            rule__VarDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__1_in_rule__VarDecl__Group__03002);
            rule__VarDecl__Group__1();

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
    // $ANTLR end "rule__VarDecl__Group__0"


    // $ANTLR start "rule__VarDecl__Group__0__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1513:1: rule__VarDecl__Group__0__Impl : ( ( rule__VarDecl__VariableNameAssignment_0 ) ) ;
    public final void rule__VarDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1517:1: ( ( ( rule__VarDecl__VariableNameAssignment_0 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1518:1: ( ( rule__VarDecl__VariableNameAssignment_0 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1518:1: ( ( rule__VarDecl__VariableNameAssignment_0 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1519:1: ( rule__VarDecl__VariableNameAssignment_0 )
            {
             before(grammarAccess.getVarDeclAccess().getVariableNameAssignment_0()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1520:1: ( rule__VarDecl__VariableNameAssignment_0 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1520:2: rule__VarDecl__VariableNameAssignment_0
            {
            pushFollow(FOLLOW_rule__VarDecl__VariableNameAssignment_0_in_rule__VarDecl__Group__0__Impl3029);
            rule__VarDecl__VariableNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclAccess().getVariableNameAssignment_0()); 

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
    // $ANTLR end "rule__VarDecl__Group__0__Impl"


    // $ANTLR start "rule__VarDecl__Group__1"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1530:1: rule__VarDecl__Group__1 : rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2 ;
    public final void rule__VarDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1534:1: ( rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1535:2: rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__1__Impl_in_rule__VarDecl__Group__13059);
            rule__VarDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__2_in_rule__VarDecl__Group__13062);
            rule__VarDecl__Group__2();

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
    // $ANTLR end "rule__VarDecl__Group__1"


    // $ANTLR start "rule__VarDecl__Group__1__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1542:1: rule__VarDecl__Group__1__Impl : ( ':' ) ;
    public final void rule__VarDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1546:1: ( ( ':' ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1547:1: ( ':' )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1547:1: ( ':' )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1548:1: ':'
            {
             before(grammarAccess.getVarDeclAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__VarDecl__Group__1__Impl3090); 
             after(grammarAccess.getVarDeclAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__VarDecl__Group__1__Impl"


    // $ANTLR start "rule__VarDecl__Group__2"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1561:1: rule__VarDecl__Group__2 : rule__VarDecl__Group__2__Impl ;
    public final void rule__VarDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1565:1: ( rule__VarDecl__Group__2__Impl )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1566:2: rule__VarDecl__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__2__Impl_in_rule__VarDecl__Group__23121);
            rule__VarDecl__Group__2__Impl();

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
    // $ANTLR end "rule__VarDecl__Group__2"


    // $ANTLR start "rule__VarDecl__Group__2__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1572:1: rule__VarDecl__Group__2__Impl : ( ( rule__VarDecl__ValueSetAssignment_2 ) ) ;
    public final void rule__VarDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1576:1: ( ( ( rule__VarDecl__ValueSetAssignment_2 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1577:1: ( ( rule__VarDecl__ValueSetAssignment_2 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1577:1: ( ( rule__VarDecl__ValueSetAssignment_2 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1578:1: ( rule__VarDecl__ValueSetAssignment_2 )
            {
             before(grammarAccess.getVarDeclAccess().getValueSetAssignment_2()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1579:1: ( rule__VarDecl__ValueSetAssignment_2 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1579:2: rule__VarDecl__ValueSetAssignment_2
            {
            pushFollow(FOLLOW_rule__VarDecl__ValueSetAssignment_2_in_rule__VarDecl__Group__2__Impl3148);
            rule__VarDecl__ValueSetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclAccess().getValueSetAssignment_2()); 

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
    // $ANTLR end "rule__VarDecl__Group__2__Impl"


    // $ANTLR start "rule__Subrange__Group__0"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1595:1: rule__Subrange__Group__0 : rule__Subrange__Group__0__Impl rule__Subrange__Group__1 ;
    public final void rule__Subrange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1599:1: ( rule__Subrange__Group__0__Impl rule__Subrange__Group__1 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1600:2: rule__Subrange__Group__0__Impl rule__Subrange__Group__1
            {
            pushFollow(FOLLOW_rule__Subrange__Group__0__Impl_in_rule__Subrange__Group__03184);
            rule__Subrange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subrange__Group__1_in_rule__Subrange__Group__03187);
            rule__Subrange__Group__1();

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
    // $ANTLR end "rule__Subrange__Group__0"


    // $ANTLR start "rule__Subrange__Group__0__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1607:1: rule__Subrange__Group__0__Impl : ( '[' ) ;
    public final void rule__Subrange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1611:1: ( ( '[' ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1612:1: ( '[' )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1612:1: ( '[' )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1613:1: '['
            {
             before(grammarAccess.getSubrangeAccess().getLeftSquareBracketKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Subrange__Group__0__Impl3215); 
             after(grammarAccess.getSubrangeAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__Subrange__Group__0__Impl"


    // $ANTLR start "rule__Subrange__Group__1"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1626:1: rule__Subrange__Group__1 : rule__Subrange__Group__1__Impl rule__Subrange__Group__2 ;
    public final void rule__Subrange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1630:1: ( rule__Subrange__Group__1__Impl rule__Subrange__Group__2 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1631:2: rule__Subrange__Group__1__Impl rule__Subrange__Group__2
            {
            pushFollow(FOLLOW_rule__Subrange__Group__1__Impl_in_rule__Subrange__Group__13246);
            rule__Subrange__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subrange__Group__2_in_rule__Subrange__Group__13249);
            rule__Subrange__Group__2();

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
    // $ANTLR end "rule__Subrange__Group__1"


    // $ANTLR start "rule__Subrange__Group__1__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1638:1: rule__Subrange__Group__1__Impl : ( ( rule__Subrange__LowerBoundAssignment_1 ) ) ;
    public final void rule__Subrange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1642:1: ( ( ( rule__Subrange__LowerBoundAssignment_1 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1643:1: ( ( rule__Subrange__LowerBoundAssignment_1 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1643:1: ( ( rule__Subrange__LowerBoundAssignment_1 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1644:1: ( rule__Subrange__LowerBoundAssignment_1 )
            {
             before(grammarAccess.getSubrangeAccess().getLowerBoundAssignment_1()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1645:1: ( rule__Subrange__LowerBoundAssignment_1 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1645:2: rule__Subrange__LowerBoundAssignment_1
            {
            pushFollow(FOLLOW_rule__Subrange__LowerBoundAssignment_1_in_rule__Subrange__Group__1__Impl3276);
            rule__Subrange__LowerBoundAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubrangeAccess().getLowerBoundAssignment_1()); 

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
    // $ANTLR end "rule__Subrange__Group__1__Impl"


    // $ANTLR start "rule__Subrange__Group__2"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1655:1: rule__Subrange__Group__2 : rule__Subrange__Group__2__Impl rule__Subrange__Group__3 ;
    public final void rule__Subrange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1659:1: ( rule__Subrange__Group__2__Impl rule__Subrange__Group__3 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1660:2: rule__Subrange__Group__2__Impl rule__Subrange__Group__3
            {
            pushFollow(FOLLOW_rule__Subrange__Group__2__Impl_in_rule__Subrange__Group__23306);
            rule__Subrange__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subrange__Group__3_in_rule__Subrange__Group__23309);
            rule__Subrange__Group__3();

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
    // $ANTLR end "rule__Subrange__Group__2"


    // $ANTLR start "rule__Subrange__Group__2__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1667:1: rule__Subrange__Group__2__Impl : ( '..' ) ;
    public final void rule__Subrange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1671:1: ( ( '..' ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1672:1: ( '..' )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1672:1: ( '..' )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1673:1: '..'
            {
             before(grammarAccess.getSubrangeAccess().getFullStopFullStopKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__Subrange__Group__2__Impl3337); 
             after(grammarAccess.getSubrangeAccess().getFullStopFullStopKeyword_2()); 

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
    // $ANTLR end "rule__Subrange__Group__2__Impl"


    // $ANTLR start "rule__Subrange__Group__3"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1686:1: rule__Subrange__Group__3 : rule__Subrange__Group__3__Impl rule__Subrange__Group__4 ;
    public final void rule__Subrange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1690:1: ( rule__Subrange__Group__3__Impl rule__Subrange__Group__4 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1691:2: rule__Subrange__Group__3__Impl rule__Subrange__Group__4
            {
            pushFollow(FOLLOW_rule__Subrange__Group__3__Impl_in_rule__Subrange__Group__33368);
            rule__Subrange__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subrange__Group__4_in_rule__Subrange__Group__33371);
            rule__Subrange__Group__4();

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
    // $ANTLR end "rule__Subrange__Group__3"


    // $ANTLR start "rule__Subrange__Group__3__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1698:1: rule__Subrange__Group__3__Impl : ( ( rule__Subrange__UpperBoundAssignment_3 ) ) ;
    public final void rule__Subrange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1702:1: ( ( ( rule__Subrange__UpperBoundAssignment_3 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1703:1: ( ( rule__Subrange__UpperBoundAssignment_3 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1703:1: ( ( rule__Subrange__UpperBoundAssignment_3 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1704:1: ( rule__Subrange__UpperBoundAssignment_3 )
            {
             before(grammarAccess.getSubrangeAccess().getUpperBoundAssignment_3()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1705:1: ( rule__Subrange__UpperBoundAssignment_3 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1705:2: rule__Subrange__UpperBoundAssignment_3
            {
            pushFollow(FOLLOW_rule__Subrange__UpperBoundAssignment_3_in_rule__Subrange__Group__3__Impl3398);
            rule__Subrange__UpperBoundAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSubrangeAccess().getUpperBoundAssignment_3()); 

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
    // $ANTLR end "rule__Subrange__Group__3__Impl"


    // $ANTLR start "rule__Subrange__Group__4"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1715:1: rule__Subrange__Group__4 : rule__Subrange__Group__4__Impl ;
    public final void rule__Subrange__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1719:1: ( rule__Subrange__Group__4__Impl )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1720:2: rule__Subrange__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Subrange__Group__4__Impl_in_rule__Subrange__Group__43428);
            rule__Subrange__Group__4__Impl();

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
    // $ANTLR end "rule__Subrange__Group__4"


    // $ANTLR start "rule__Subrange__Group__4__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1726:1: rule__Subrange__Group__4__Impl : ( ']' ) ;
    public final void rule__Subrange__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1730:1: ( ( ']' ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1731:1: ( ']' )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1731:1: ( ']' )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1732:1: ']'
            {
             before(grammarAccess.getSubrangeAccess().getRightSquareBracketKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__Subrange__Group__4__Impl3456); 
             after(grammarAccess.getSubrangeAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__Subrange__Group__4__Impl"


    // $ANTLR start "rule__Initialisation__Group__0"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1755:1: rule__Initialisation__Group__0 : rule__Initialisation__Group__0__Impl rule__Initialisation__Group__1 ;
    public final void rule__Initialisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1759:1: ( rule__Initialisation__Group__0__Impl rule__Initialisation__Group__1 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1760:2: rule__Initialisation__Group__0__Impl rule__Initialisation__Group__1
            {
            pushFollow(FOLLOW_rule__Initialisation__Group__0__Impl_in_rule__Initialisation__Group__03497);
            rule__Initialisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Initialisation__Group__1_in_rule__Initialisation__Group__03500);
            rule__Initialisation__Group__1();

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
    // $ANTLR end "rule__Initialisation__Group__0"


    // $ANTLR start "rule__Initialisation__Group__0__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1767:1: rule__Initialisation__Group__0__Impl : ( ( rule__Initialisation__VariableAssignment_0 ) ) ;
    public final void rule__Initialisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1771:1: ( ( ( rule__Initialisation__VariableAssignment_0 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1772:1: ( ( rule__Initialisation__VariableAssignment_0 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1772:1: ( ( rule__Initialisation__VariableAssignment_0 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1773:1: ( rule__Initialisation__VariableAssignment_0 )
            {
             before(grammarAccess.getInitialisationAccess().getVariableAssignment_0()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1774:1: ( rule__Initialisation__VariableAssignment_0 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1774:2: rule__Initialisation__VariableAssignment_0
            {
            pushFollow(FOLLOW_rule__Initialisation__VariableAssignment_0_in_rule__Initialisation__Group__0__Impl3527);
            rule__Initialisation__VariableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInitialisationAccess().getVariableAssignment_0()); 

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
    // $ANTLR end "rule__Initialisation__Group__0__Impl"


    // $ANTLR start "rule__Initialisation__Group__1"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1784:1: rule__Initialisation__Group__1 : rule__Initialisation__Group__1__Impl rule__Initialisation__Group__2 ;
    public final void rule__Initialisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1788:1: ( rule__Initialisation__Group__1__Impl rule__Initialisation__Group__2 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1789:2: rule__Initialisation__Group__1__Impl rule__Initialisation__Group__2
            {
            pushFollow(FOLLOW_rule__Initialisation__Group__1__Impl_in_rule__Initialisation__Group__13557);
            rule__Initialisation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Initialisation__Group__2_in_rule__Initialisation__Group__13560);
            rule__Initialisation__Group__2();

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
    // $ANTLR end "rule__Initialisation__Group__1"


    // $ANTLR start "rule__Initialisation__Group__1__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1796:1: rule__Initialisation__Group__1__Impl : ( '=' ) ;
    public final void rule__Initialisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1800:1: ( ( '=' ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1801:1: ( '=' )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1801:1: ( '=' )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1802:1: '='
            {
             before(grammarAccess.getInitialisationAccess().getEqualsSignKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__Initialisation__Group__1__Impl3588); 
             after(grammarAccess.getInitialisationAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Initialisation__Group__1__Impl"


    // $ANTLR start "rule__Initialisation__Group__2"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1815:1: rule__Initialisation__Group__2 : rule__Initialisation__Group__2__Impl rule__Initialisation__Group__3 ;
    public final void rule__Initialisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1819:1: ( rule__Initialisation__Group__2__Impl rule__Initialisation__Group__3 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1820:2: rule__Initialisation__Group__2__Impl rule__Initialisation__Group__3
            {
            pushFollow(FOLLOW_rule__Initialisation__Group__2__Impl_in_rule__Initialisation__Group__23619);
            rule__Initialisation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Initialisation__Group__3_in_rule__Initialisation__Group__23622);
            rule__Initialisation__Group__3();

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
    // $ANTLR end "rule__Initialisation__Group__2"


    // $ANTLR start "rule__Initialisation__Group__2__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1827:1: rule__Initialisation__Group__2__Impl : ( ( rule__Initialisation__ValueAssignment_2 ) ) ;
    public final void rule__Initialisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1831:1: ( ( ( rule__Initialisation__ValueAssignment_2 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1832:1: ( ( rule__Initialisation__ValueAssignment_2 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1832:1: ( ( rule__Initialisation__ValueAssignment_2 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1833:1: ( rule__Initialisation__ValueAssignment_2 )
            {
             before(grammarAccess.getInitialisationAccess().getValueAssignment_2()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1834:1: ( rule__Initialisation__ValueAssignment_2 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1834:2: rule__Initialisation__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Initialisation__ValueAssignment_2_in_rule__Initialisation__Group__2__Impl3649);
            rule__Initialisation__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInitialisationAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__Initialisation__Group__2__Impl"


    // $ANTLR start "rule__Initialisation__Group__3"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1844:1: rule__Initialisation__Group__3 : rule__Initialisation__Group__3__Impl ;
    public final void rule__Initialisation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1848:1: ( rule__Initialisation__Group__3__Impl )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1849:2: rule__Initialisation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Initialisation__Group__3__Impl_in_rule__Initialisation__Group__33679);
            rule__Initialisation__Group__3__Impl();

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
    // $ANTLR end "rule__Initialisation__Group__3"


    // $ANTLR start "rule__Initialisation__Group__3__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1855:1: rule__Initialisation__Group__3__Impl : ( ';' ) ;
    public final void rule__Initialisation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1859:1: ( ( ';' ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1860:1: ( ';' )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1860:1: ( ';' )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1861:1: ';'
            {
             before(grammarAccess.getInitialisationAccess().getSemicolonKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__Initialisation__Group__3__Impl3707); 
             after(grammarAccess.getInitialisationAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__Initialisation__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1882:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1886:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1887:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__03746);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__03749);
            rule__Transition__Group__1();

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
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1894:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__TransitionNumerAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1898:1: ( ( ( rule__Transition__TransitionNumerAssignment_0 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1899:1: ( ( rule__Transition__TransitionNumerAssignment_0 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1899:1: ( ( rule__Transition__TransitionNumerAssignment_0 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1900:1: ( rule__Transition__TransitionNumerAssignment_0 )
            {
             before(grammarAccess.getTransitionAccess().getTransitionNumerAssignment_0()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1901:1: ( rule__Transition__TransitionNumerAssignment_0 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1901:2: rule__Transition__TransitionNumerAssignment_0
            {
            pushFollow(FOLLOW_rule__Transition__TransitionNumerAssignment_0_in_rule__Transition__Group__0__Impl3776);
            rule__Transition__TransitionNumerAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTransitionNumerAssignment_0()); 

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
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1911:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1915:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1916:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__13806);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__13809);
            rule__Transition__Group__2();

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
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1923:1: rule__Transition__Group__1__Impl : ( ':' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1927:1: ( ( ':' ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1928:1: ( ':' )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1928:1: ( ':' )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1929:1: ':'
            {
             before(grammarAccess.getTransitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Transition__Group__1__Impl3837); 
             after(grammarAccess.getTransitionAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1942:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1946:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1947:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__23868);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__23871);
            rule__Transition__Group__3();

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
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1954:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__GuardsAssignment_2 )* ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1958:1: ( ( ( rule__Transition__GuardsAssignment_2 )* ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1959:1: ( ( rule__Transition__GuardsAssignment_2 )* )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1959:1: ( ( rule__Transition__GuardsAssignment_2 )* )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1960:1: ( rule__Transition__GuardsAssignment_2 )*
            {
             before(grammarAccess.getTransitionAccess().getGuardsAssignment_2()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1961:1: ( rule__Transition__GuardsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1961:2: rule__Transition__GuardsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Transition__GuardsAssignment_2_in_rule__Transition__Group__2__Impl3898);
            	    rule__Transition__GuardsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGuardsAssignment_2()); 

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
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1971:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1975:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1976:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__33929);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__33932);
            rule__Transition__Group__4();

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
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1983:1: rule__Transition__Group__3__Impl : ( '-->' ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1987:1: ( ( '-->' ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1988:1: ( '-->' )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1988:1: ( '-->' )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:1989:1: '-->'
            {
             before(grammarAccess.getTransitionAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__Transition__Group__3__Impl3960); 
             after(grammarAccess.getTransitionAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_3()); 

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
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2002:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2006:1: ( rule__Transition__Group__4__Impl )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2007:2: rule__Transition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__43991);
            rule__Transition__Group__4__Impl();

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
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2013:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__AssignmentsAssignment_4 )* ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2017:1: ( ( ( rule__Transition__AssignmentsAssignment_4 )* ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2018:1: ( ( rule__Transition__AssignmentsAssignment_4 )* )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2018:1: ( ( rule__Transition__AssignmentsAssignment_4 )* )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2019:1: ( rule__Transition__AssignmentsAssignment_4 )*
            {
             before(grammarAccess.getTransitionAccess().getAssignmentsAssignment_4()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2020:1: ( rule__Transition__AssignmentsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2020:2: rule__Transition__AssignmentsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Transition__AssignmentsAssignment_4_in_rule__Transition__Group__4__Impl4018);
            	    rule__Transition__AssignmentsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getAssignmentsAssignment_4()); 

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
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Guard__Group__0"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2040:1: rule__Guard__Group__0 : rule__Guard__Group__0__Impl rule__Guard__Group__1 ;
    public final void rule__Guard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2044:1: ( rule__Guard__Group__0__Impl rule__Guard__Group__1 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2045:2: rule__Guard__Group__0__Impl rule__Guard__Group__1
            {
            pushFollow(FOLLOW_rule__Guard__Group__0__Impl_in_rule__Guard__Group__04059);
            rule__Guard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guard__Group__1_in_rule__Guard__Group__04062);
            rule__Guard__Group__1();

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
    // $ANTLR end "rule__Guard__Group__0"


    // $ANTLR start "rule__Guard__Group__0__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2052:1: rule__Guard__Group__0__Impl : ( ( rule__Guard__VariableAssignment_0 ) ) ;
    public final void rule__Guard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2056:1: ( ( ( rule__Guard__VariableAssignment_0 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2057:1: ( ( rule__Guard__VariableAssignment_0 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2057:1: ( ( rule__Guard__VariableAssignment_0 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2058:1: ( rule__Guard__VariableAssignment_0 )
            {
             before(grammarAccess.getGuardAccess().getVariableAssignment_0()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2059:1: ( rule__Guard__VariableAssignment_0 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2059:2: rule__Guard__VariableAssignment_0
            {
            pushFollow(FOLLOW_rule__Guard__VariableAssignment_0_in_rule__Guard__Group__0__Impl4089);
            rule__Guard__VariableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGuardAccess().getVariableAssignment_0()); 

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
    // $ANTLR end "rule__Guard__Group__0__Impl"


    // $ANTLR start "rule__Guard__Group__1"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2069:1: rule__Guard__Group__1 : rule__Guard__Group__1__Impl rule__Guard__Group__2 ;
    public final void rule__Guard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2073:1: ( rule__Guard__Group__1__Impl rule__Guard__Group__2 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2074:2: rule__Guard__Group__1__Impl rule__Guard__Group__2
            {
            pushFollow(FOLLOW_rule__Guard__Group__1__Impl_in_rule__Guard__Group__14119);
            rule__Guard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guard__Group__2_in_rule__Guard__Group__14122);
            rule__Guard__Group__2();

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
    // $ANTLR end "rule__Guard__Group__1"


    // $ANTLR start "rule__Guard__Group__1__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2081:1: rule__Guard__Group__1__Impl : ( '=' ) ;
    public final void rule__Guard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2085:1: ( ( '=' ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2086:1: ( '=' )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2086:1: ( '=' )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2087:1: '='
            {
             before(grammarAccess.getGuardAccess().getEqualsSignKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__Guard__Group__1__Impl4150); 
             after(grammarAccess.getGuardAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Guard__Group__1__Impl"


    // $ANTLR start "rule__Guard__Group__2"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2100:1: rule__Guard__Group__2 : rule__Guard__Group__2__Impl ;
    public final void rule__Guard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2104:1: ( rule__Guard__Group__2__Impl )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2105:2: rule__Guard__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Guard__Group__2__Impl_in_rule__Guard__Group__24181);
            rule__Guard__Group__2__Impl();

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
    // $ANTLR end "rule__Guard__Group__2"


    // $ANTLR start "rule__Guard__Group__2__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2111:1: rule__Guard__Group__2__Impl : ( ( rule__Guard__ValueAssignment_2 ) ) ;
    public final void rule__Guard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2115:1: ( ( ( rule__Guard__ValueAssignment_2 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2116:1: ( ( rule__Guard__ValueAssignment_2 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2116:1: ( ( rule__Guard__ValueAssignment_2 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2117:1: ( rule__Guard__ValueAssignment_2 )
            {
             before(grammarAccess.getGuardAccess().getValueAssignment_2()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2118:1: ( rule__Guard__ValueAssignment_2 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2118:2: rule__Guard__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Guard__ValueAssignment_2_in_rule__Guard__Group__2__Impl4208);
            rule__Guard__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGuardAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__Guard__Group__2__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2134:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2138:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2139:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__04244);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__04247);
            rule__Assignment__Group__1();

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
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2146:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__VariableAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2150:1: ( ( ( rule__Assignment__VariableAssignment_0 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2151:1: ( ( rule__Assignment__VariableAssignment_0 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2151:1: ( ( rule__Assignment__VariableAssignment_0 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2152:1: ( rule__Assignment__VariableAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getVariableAssignment_0()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2153:1: ( rule__Assignment__VariableAssignment_0 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2153:2: rule__Assignment__VariableAssignment_0
            {
            pushFollow(FOLLOW_rule__Assignment__VariableAssignment_0_in_rule__Assignment__Group__0__Impl4274);
            rule__Assignment__VariableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getVariableAssignment_0()); 

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
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2163:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2167:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2168:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__14304);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__14307);
            rule__Assignment__Group__2();

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
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2175:1: rule__Assignment__Group__1__Impl : ( '\\'=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2179:1: ( ( '\\'=' ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2180:1: ( '\\'=' )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2180:1: ( '\\'=' )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2181:1: '\\'='
            {
             before(grammarAccess.getAssignmentAccess().getApostropheEqualsSignKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__Assignment__Group__1__Impl4335); 
             after(grammarAccess.getAssignmentAccess().getApostropheEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2194:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2198:1: ( rule__Assignment__Group__2__Impl )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2199:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__24366);
            rule__Assignment__Group__2__Impl();

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
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2205:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2209:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2210:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2210:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2211:1: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2212:1: ( rule__Assignment__ValueAssignment_2 )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2212:2: rule__Assignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Assignment__ValueAssignment_2_in_rule__Assignment__Group__2__Impl4393);
            rule__Assignment__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__Context__ContextNameAssignment_0"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2229:1: rule__Context__ContextNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Context__ContextNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2233:1: ( ( RULE_STRING ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2234:1: ( RULE_STRING )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2234:1: ( RULE_STRING )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2235:1: RULE_STRING
            {
             before(grammarAccess.getContextAccess().getContextNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Context__ContextNameAssignment_04434); 
             after(grammarAccess.getContextAccess().getContextNameSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Context__ContextNameAssignment_0"


    // $ANTLR start "rule__Context__BodyAssignment_2"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2244:1: rule__Context__BodyAssignment_2 : ( ruleBody ) ;
    public final void rule__Context__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2248:1: ( ( ruleBody ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2249:1: ( ruleBody )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2249:1: ( ruleBody )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2250:1: ruleBody
            {
             before(grammarAccess.getContextAccess().getBodyBodyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBody_in_rule__Context__BodyAssignment_24465);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getContextAccess().getBodyBodyParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Context__BodyAssignment_2"


    // $ANTLR start "rule__Body__TypesAssignment_1"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2259:1: rule__Body__TypesAssignment_1 : ( ruleTypeDeclaration ) ;
    public final void rule__Body__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2263:1: ( ( ruleTypeDeclaration ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2264:1: ( ruleTypeDeclaration )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2264:1: ( ruleTypeDeclaration )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2265:1: ruleTypeDeclaration
            {
             before(grammarAccess.getBodyAccess().getTypesTypeDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeDeclaration_in_rule__Body__TypesAssignment_14496);
            ruleTypeDeclaration();

            state._fsp--;

             after(grammarAccess.getBodyAccess().getTypesTypeDeclarationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Body__TypesAssignment_1"


    // $ANTLR start "rule__Body__ModuleAssignment_2"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2274:1: rule__Body__ModuleAssignment_2 : ( ruleModuleDeclaration ) ;
    public final void rule__Body__ModuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2278:1: ( ( ruleModuleDeclaration ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2279:1: ( ruleModuleDeclaration )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2279:1: ( ruleModuleDeclaration )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2280:1: ruleModuleDeclaration
            {
             before(grammarAccess.getBodyAccess().getModuleModuleDeclarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleModuleDeclaration_in_rule__Body__ModuleAssignment_24527);
            ruleModuleDeclaration();

            state._fsp--;

             after(grammarAccess.getBodyAccess().getModuleModuleDeclarationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Body__ModuleAssignment_2"


    // $ANTLR start "rule__TypeDeclaration__TypeNameAssignment_0"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2289:1: rule__TypeDeclaration__TypeNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__TypeDeclaration__TypeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2293:1: ( ( RULE_STRING ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2294:1: ( RULE_STRING )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2294:1: ( RULE_STRING )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2295:1: RULE_STRING
            {
             before(grammarAccess.getTypeDeclarationAccess().getTypeNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TypeDeclaration__TypeNameAssignment_04558); 
             after(grammarAccess.getTypeDeclarationAccess().getTypeNameSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__TypeDeclaration__TypeNameAssignment_0"


    // $ANTLR start "rule__TypeDeclaration__TypeValuesAssignment_2"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2304:1: rule__TypeDeclaration__TypeValuesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TypeDeclaration__TypeValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2308:1: ( ( RULE_STRING ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2309:1: ( RULE_STRING )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2309:1: ( RULE_STRING )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2310:1: RULE_STRING
            {
             before(grammarAccess.getTypeDeclarationAccess().getTypeValuesSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TypeDeclaration__TypeValuesAssignment_24589); 
             after(grammarAccess.getTypeDeclarationAccess().getTypeValuesSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__TypeDeclaration__TypeValuesAssignment_2"


    // $ANTLR start "rule__ModuleDeclaration__ModuleNameAssignment_0"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2319:1: rule__ModuleDeclaration__ModuleNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ModuleDeclaration__ModuleNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2323:1: ( ( RULE_STRING ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2324:1: ( RULE_STRING )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2324:1: ( RULE_STRING )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2325:1: RULE_STRING
            {
             before(grammarAccess.getModuleDeclarationAccess().getModuleNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ModuleDeclaration__ModuleNameAssignment_04620); 
             after(grammarAccess.getModuleDeclarationAccess().getModuleNameSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ModuleDeclaration__ModuleNameAssignment_0"


    // $ANTLR start "rule__ModuleDeclaration__ModuleAssignment_2"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2334:1: rule__ModuleDeclaration__ModuleAssignment_2 : ( ruleModule ) ;
    public final void rule__ModuleDeclaration__ModuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2338:1: ( ( ruleModule ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2339:1: ( ruleModule )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2339:1: ( ruleModule )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2340:1: ruleModule
            {
             before(grammarAccess.getModuleDeclarationAccess().getModuleModuleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleModule_in_rule__ModuleDeclaration__ModuleAssignment_24651);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleDeclarationAccess().getModuleModuleParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ModuleDeclaration__ModuleAssignment_2"


    // $ANTLR start "rule__Module__DeclarationAssignment_1"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2349:1: rule__Module__DeclarationAssignment_1 : ( ruleDeclarations ) ;
    public final void rule__Module__DeclarationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2353:1: ( ( ruleDeclarations ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2354:1: ( ruleDeclarations )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2354:1: ( ruleDeclarations )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2355:1: ruleDeclarations
            {
             before(grammarAccess.getModuleAccess().getDeclarationDeclarationsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDeclarations_in_rule__Module__DeclarationAssignment_14682);
            ruleDeclarations();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getDeclarationDeclarationsParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Module__DeclarationAssignment_1"


    // $ANTLR start "rule__Declarations__VariableDeclarationsAssignment_0_1"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2364:1: rule__Declarations__VariableDeclarationsAssignment_0_1 : ( ruleVarDecl ) ;
    public final void rule__Declarations__VariableDeclarationsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2368:1: ( ( ruleVarDecl ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2369:1: ( ruleVarDecl )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2369:1: ( ruleVarDecl )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2370:1: ruleVarDecl
            {
             before(grammarAccess.getDeclarationsAccess().getVariableDeclarationsVarDeclParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleVarDecl_in_rule__Declarations__VariableDeclarationsAssignment_0_14713);
            ruleVarDecl();

            state._fsp--;

             after(grammarAccess.getDeclarationsAccess().getVariableDeclarationsVarDeclParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Declarations__VariableDeclarationsAssignment_0_1"


    // $ANTLR start "rule__Declarations__VariableDeclarationsAssignment_1_1"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2379:1: rule__Declarations__VariableDeclarationsAssignment_1_1 : ( ruleVarDecl ) ;
    public final void rule__Declarations__VariableDeclarationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2383:1: ( ( ruleVarDecl ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2384:1: ( ruleVarDecl )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2384:1: ( ruleVarDecl )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2385:1: ruleVarDecl
            {
             before(grammarAccess.getDeclarationsAccess().getVariableDeclarationsVarDeclParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleVarDecl_in_rule__Declarations__VariableDeclarationsAssignment_1_14744);
            ruleVarDecl();

            state._fsp--;

             after(grammarAccess.getDeclarationsAccess().getVariableDeclarationsVarDeclParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Declarations__VariableDeclarationsAssignment_1_1"


    // $ANTLR start "rule__Declarations__VariableDeclarationsAssignment_2_1"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2394:1: rule__Declarations__VariableDeclarationsAssignment_2_1 : ( ruleVarDecl ) ;
    public final void rule__Declarations__VariableDeclarationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2398:1: ( ( ruleVarDecl ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2399:1: ( ruleVarDecl )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2399:1: ( ruleVarDecl )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2400:1: ruleVarDecl
            {
             before(grammarAccess.getDeclarationsAccess().getVariableDeclarationsVarDeclParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleVarDecl_in_rule__Declarations__VariableDeclarationsAssignment_2_14775);
            ruleVarDecl();

            state._fsp--;

             after(grammarAccess.getDeclarationsAccess().getVariableDeclarationsVarDeclParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Declarations__VariableDeclarationsAssignment_2_1"


    // $ANTLR start "rule__Declarations__DefinitionsAssignment_3_1"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2409:1: rule__Declarations__DefinitionsAssignment_3_1 : ( ruleDefinition ) ;
    public final void rule__Declarations__DefinitionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2413:1: ( ( ruleDefinition ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2414:1: ( ruleDefinition )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2414:1: ( ruleDefinition )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2415:1: ruleDefinition
            {
             before(grammarAccess.getDeclarationsAccess().getDefinitionsDefinitionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleDefinition_in_rule__Declarations__DefinitionsAssignment_3_14806);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDeclarationsAccess().getDefinitionsDefinitionParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Declarations__DefinitionsAssignment_3_1"


    // $ANTLR start "rule__Declarations__InitialisationsAssignment_4_1"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2424:1: rule__Declarations__InitialisationsAssignment_4_1 : ( ruleInitialisation ) ;
    public final void rule__Declarations__InitialisationsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2428:1: ( ( ruleInitialisation ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2429:1: ( ruleInitialisation )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2429:1: ( ruleInitialisation )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2430:1: ruleInitialisation
            {
             before(grammarAccess.getDeclarationsAccess().getInitialisationsInitialisationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleInitialisation_in_rule__Declarations__InitialisationsAssignment_4_14837);
            ruleInitialisation();

            state._fsp--;

             after(grammarAccess.getDeclarationsAccess().getInitialisationsInitialisationParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Declarations__InitialisationsAssignment_4_1"


    // $ANTLR start "rule__Declarations__TransitionsAssignment_5_1"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2439:1: rule__Declarations__TransitionsAssignment_5_1 : ( ruleTransition ) ;
    public final void rule__Declarations__TransitionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2443:1: ( ( ruleTransition ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2444:1: ( ruleTransition )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2444:1: ( ruleTransition )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2445:1: ruleTransition
            {
             before(grammarAccess.getDeclarationsAccess().getTransitionsTransitionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleTransition_in_rule__Declarations__TransitionsAssignment_5_14868);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getDeclarationsAccess().getTransitionsTransitionParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Declarations__TransitionsAssignment_5_1"


    // $ANTLR start "rule__VarDecl__VariableNameAssignment_0"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2454:1: rule__VarDecl__VariableNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__VarDecl__VariableNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2458:1: ( ( RULE_STRING ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2459:1: ( RULE_STRING )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2459:1: ( RULE_STRING )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2460:1: RULE_STRING
            {
             before(grammarAccess.getVarDeclAccess().getVariableNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__VarDecl__VariableNameAssignment_04899); 
             after(grammarAccess.getVarDeclAccess().getVariableNameSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__VarDecl__VariableNameAssignment_0"


    // $ANTLR start "rule__VarDecl__ValueSetAssignment_2"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2469:1: rule__VarDecl__ValueSetAssignment_2 : ( ruleValueSet ) ;
    public final void rule__VarDecl__ValueSetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2473:1: ( ( ruleValueSet ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2474:1: ( ruleValueSet )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2474:1: ( ruleValueSet )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2475:1: ruleValueSet
            {
             before(grammarAccess.getVarDeclAccess().getValueSetValueSetParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleValueSet_in_rule__VarDecl__ValueSetAssignment_24930);
            ruleValueSet();

            state._fsp--;

             after(grammarAccess.getVarDeclAccess().getValueSetValueSetParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__VarDecl__ValueSetAssignment_2"


    // $ANTLR start "rule__Scalar__NameAssignment"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2484:1: rule__Scalar__NameAssignment : ( RULE_STRING ) ;
    public final void rule__Scalar__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2488:1: ( ( RULE_STRING ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2489:1: ( RULE_STRING )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2489:1: ( RULE_STRING )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2490:1: RULE_STRING
            {
             before(grammarAccess.getScalarAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Scalar__NameAssignment4961); 
             after(grammarAccess.getScalarAccess().getNameSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Scalar__NameAssignment"


    // $ANTLR start "rule__Subrange__LowerBoundAssignment_1"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2499:1: rule__Subrange__LowerBoundAssignment_1 : ( RULE_INT ) ;
    public final void rule__Subrange__LowerBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2503:1: ( ( RULE_INT ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2504:1: ( RULE_INT )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2504:1: ( RULE_INT )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2505:1: RULE_INT
            {
             before(grammarAccess.getSubrangeAccess().getLowerBoundINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Subrange__LowerBoundAssignment_14992); 
             after(grammarAccess.getSubrangeAccess().getLowerBoundINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Subrange__LowerBoundAssignment_1"


    // $ANTLR start "rule__Subrange__UpperBoundAssignment_3"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2514:1: rule__Subrange__UpperBoundAssignment_3 : ( RULE_INT ) ;
    public final void rule__Subrange__UpperBoundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2518:1: ( ( RULE_INT ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2519:1: ( RULE_INT )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2519:1: ( RULE_INT )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2520:1: RULE_INT
            {
             before(grammarAccess.getSubrangeAccess().getUpperBoundINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Subrange__UpperBoundAssignment_35023); 
             after(grammarAccess.getSubrangeAccess().getUpperBoundINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Subrange__UpperBoundAssignment_3"


    // $ANTLR start "rule__Initialisation__VariableAssignment_0"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2529:1: rule__Initialisation__VariableAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Initialisation__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2533:1: ( ( RULE_STRING ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2534:1: ( RULE_STRING )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2534:1: ( RULE_STRING )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2535:1: RULE_STRING
            {
             before(grammarAccess.getInitialisationAccess().getVariableSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Initialisation__VariableAssignment_05054); 
             after(grammarAccess.getInitialisationAccess().getVariableSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Initialisation__VariableAssignment_0"


    // $ANTLR start "rule__Initialisation__ValueAssignment_2"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2544:1: rule__Initialisation__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Initialisation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2548:1: ( ( RULE_STRING ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2549:1: ( RULE_STRING )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2549:1: ( RULE_STRING )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2550:1: RULE_STRING
            {
             before(grammarAccess.getInitialisationAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Initialisation__ValueAssignment_25085); 
             after(grammarAccess.getInitialisationAccess().getValueSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Initialisation__ValueAssignment_2"


    // $ANTLR start "rule__Transition__TransitionNumerAssignment_0"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2559:1: rule__Transition__TransitionNumerAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Transition__TransitionNumerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2563:1: ( ( RULE_STRING ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2564:1: ( RULE_STRING )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2564:1: ( RULE_STRING )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2565:1: RULE_STRING
            {
             before(grammarAccess.getTransitionAccess().getTransitionNumerSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Transition__TransitionNumerAssignment_05116); 
             after(grammarAccess.getTransitionAccess().getTransitionNumerSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Transition__TransitionNumerAssignment_0"


    // $ANTLR start "rule__Transition__GuardsAssignment_2"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2574:1: rule__Transition__GuardsAssignment_2 : ( ruleGuard ) ;
    public final void rule__Transition__GuardsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2578:1: ( ( ruleGuard ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2579:1: ( ruleGuard )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2579:1: ( ruleGuard )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2580:1: ruleGuard
            {
             before(grammarAccess.getTransitionAccess().getGuardsGuardParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGuard_in_rule__Transition__GuardsAssignment_25147);
            ruleGuard();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getGuardsGuardParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Transition__GuardsAssignment_2"


    // $ANTLR start "rule__Transition__AssignmentsAssignment_4"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2589:1: rule__Transition__AssignmentsAssignment_4 : ( ruleAssignment ) ;
    public final void rule__Transition__AssignmentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2593:1: ( ( ruleAssignment ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2594:1: ( ruleAssignment )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2594:1: ( ruleAssignment )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2595:1: ruleAssignment
            {
             before(grammarAccess.getTransitionAccess().getAssignmentsAssignmentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAssignment_in_rule__Transition__AssignmentsAssignment_45178);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getAssignmentsAssignmentParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Transition__AssignmentsAssignment_4"


    // $ANTLR start "rule__Guard__VariableAssignment_0"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2604:1: rule__Guard__VariableAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Guard__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2608:1: ( ( RULE_STRING ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2609:1: ( RULE_STRING )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2609:1: ( RULE_STRING )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2610:1: RULE_STRING
            {
             before(grammarAccess.getGuardAccess().getVariableSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Guard__VariableAssignment_05209); 
             after(grammarAccess.getGuardAccess().getVariableSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Guard__VariableAssignment_0"


    // $ANTLR start "rule__Guard__ValueAssignment_2"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2619:1: rule__Guard__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Guard__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2623:1: ( ( RULE_STRING ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2624:1: ( RULE_STRING )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2624:1: ( RULE_STRING )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2625:1: RULE_STRING
            {
             before(grammarAccess.getGuardAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Guard__ValueAssignment_25240); 
             after(grammarAccess.getGuardAccess().getValueSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Guard__ValueAssignment_2"


    // $ANTLR start "rule__Assignment__VariableAssignment_0"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2634:1: rule__Assignment__VariableAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Assignment__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2638:1: ( ( RULE_STRING ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2639:1: ( RULE_STRING )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2639:1: ( RULE_STRING )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2640:1: RULE_STRING
            {
             before(grammarAccess.getAssignmentAccess().getVariableSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Assignment__VariableAssignment_05271); 
             after(grammarAccess.getAssignmentAccess().getVariableSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Assignment__VariableAssignment_0"


    // $ANTLR start "rule__Assignment__ValueAssignment_2"
    // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2649:1: rule__Assignment__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2653:1: ( ( RULE_STRING ) )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2654:1: ( RULE_STRING )
            {
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2654:1: ( RULE_STRING )
            // ../org.xtext.tesis.sal.ui/src-gen/org/xtext/tesis/ui/contentassist/antlr/internal/InternalSAL.g:2655:1: RULE_STRING
            {
             before(grammarAccess.getAssignmentAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Assignment__ValueAssignment_25302); 
             after(grammarAccess.getAssignmentAccess().getValueSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Assignment__ValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleContext_in_entryRuleContext61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContext68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__0_in_ruleContext94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__0_in_ruleBody154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDeclaration_in_entryRuleTypeDeclaration181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDeclaration188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDeclaration__Group__0_in_ruleTypeDeclaration214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleDeclaration_in_entryRuleModuleDeclaration241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleDeclaration248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleDeclaration__Group__0_in_ruleModuleDeclaration274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0_in_ruleModule334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarations_in_entryRuleDeclarations361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarations368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarations__Alternatives_in_ruleDeclarations394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_entryRuleVarDecl421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDecl428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__0_in_ruleVarDecl454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueSet_in_entryRuleValueSet481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueSet488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueSet__Alternatives_in_ruleValueSet514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalar_in_entryRuleScalar541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScalar548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scalar__NameAssignment_in_ruleScalar574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubrange_in_entryRuleSubrange601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubrange608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subrange__Group__0_in_ruleSubrange634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDefinition695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialisation_in_entryRuleInitialisation723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitialisation730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initialisation__Group__0_in_ruleInitialisation756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuard850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__0_in_ruleGuard876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0_in_ruleAssignment936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarations__Group_0__0_in_rule__Declarations__Alternatives972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarations__Group_1__0_in_rule__Declarations__Alternatives990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarations__Group_2__0_in_rule__Declarations__Alternatives1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarations__Group_3__0_in_rule__Declarations__Alternatives1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarations__Group_4__0_in_rule__Declarations__Alternatives1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarations__Group_5__0_in_rule__Declarations__Alternatives1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalar_in_rule__ValueSet__Alternatives1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubrange_in_rule__ValueSet__Alternatives1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__0__Impl_in_rule__Context__Group__01142 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Context__Group__1_in_rule__Context__Group__01145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__ContextNameAssignment_0_in_rule__Context__Group__0__Impl1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__1__Impl_in_rule__Context__Group__11202 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Context__Group__2_in_rule__Context__Group__11205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Context__Group__1__Impl1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__2__Impl_in_rule__Context__Group__21264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__BodyAssignment_2_in_rule__Context__Group__2__Impl1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__0__Impl_in_rule__Body__Group__01327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Body__Group__1_in_rule__Body__Group__01330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Body__Group__0__Impl1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__1__Impl_in_rule__Body__Group__11389 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Body__Group__2_in_rule__Body__Group__11392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__TypesAssignment_1_in_rule__Body__Group__1__Impl1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__2__Impl_in_rule__Body__Group__21449 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Body__Group__3_in_rule__Body__Group__21452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__ModuleAssignment_2_in_rule__Body__Group__2__Impl1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__3__Impl_in_rule__Body__Group__31509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Body__Group__3__Impl1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDeclaration__Group__0__Impl_in_rule__TypeDeclaration__Group__01576 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__TypeDeclaration__Group__1_in_rule__TypeDeclaration__Group__01579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDeclaration__TypeNameAssignment_0_in_rule__TypeDeclaration__Group__0__Impl1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDeclaration__Group__1__Impl_in_rule__TypeDeclaration__Group__11636 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TypeDeclaration__Group__2_in_rule__TypeDeclaration__Group__11639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__TypeDeclaration__Group__1__Impl1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDeclaration__Group__2__Impl_in_rule__TypeDeclaration__Group__21698 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__TypeDeclaration__Group__3_in_rule__TypeDeclaration__Group__21701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDeclaration__TypeValuesAssignment_2_in_rule__TypeDeclaration__Group__2__Impl1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDeclaration__Group__3__Impl_in_rule__TypeDeclaration__Group__31758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TypeDeclaration__Group__3__Impl1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleDeclaration__Group__0__Impl_in_rule__ModuleDeclaration__Group__01825 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ModuleDeclaration__Group__1_in_rule__ModuleDeclaration__Group__01828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleDeclaration__ModuleNameAssignment_0_in_rule__ModuleDeclaration__Group__0__Impl1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleDeclaration__Group__1__Impl_in_rule__ModuleDeclaration__Group__11885 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ModuleDeclaration__Group__2_in_rule__ModuleDeclaration__Group__11888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ModuleDeclaration__Group__1__Impl1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleDeclaration__Group__2__Impl_in_rule__ModuleDeclaration__Group__21947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleDeclaration__ModuleAssignment_2_in_rule__ModuleDeclaration__Group__2__Impl1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__02010 = new BitSet(new long[]{0x0000000000FC0000L});
    public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__02013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Module__Group__0__Impl2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__12072 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Module__Group__2_in_rule__Module__Group__12075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__DeclarationAssignment_1_in_rule__Module__Group__1__Impl2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__22132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Module__Group__2__Impl2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarations__Group_0__0__Impl_in_rule__Declarations__Group_0__02197 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Declarations__Group_0__1_in_rule__Declarations__Group_0__02200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Declarations__Group_0__0__Impl2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarations__Group_0__1__Impl_in_rule__Declarations__Group_0__12259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarations__VariableDeclarationsAssignment_0_1_in_rule__Declarations__Group_0__1__Impl2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarations__Group_1__0__Impl_in_rule__Declarations__Group_1__02320 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Declarations__Group_1__1_in_rule__Declarations__Group_1__02323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Declarations__Group_1__0__Impl2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarations__Group_1__1__Impl_in_rule__Declarations__Group_1__12382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarations__VariableDeclarationsAssignment_1_1_in_rule__Declarations__Group_1__1__Impl2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarations__Group_2__0__Impl_in_rule__Declarations__Group_2__02443 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Declarations__Group_2__1_in_rule__Declarations__Group_2__02446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Declarations__Group_2__0__Impl2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarations__Group_2__1__Impl_in_rule__Declarations__Group_2__12505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarations__VariableDeclarationsAssignment_2_1_in_rule__Declarations__Group_2__1__Impl2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarations__Group_3__0__Impl_in_rule__Declarations__Group_3__02566 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Declarations__Group_3__1_in_rule__Declarations__Group_3__02569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Declarations__Group_3__0__Impl2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarations__Group_3__1__Impl_in_rule__Declarations__Group_3__12628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarations__DefinitionsAssignment_3_1_in_rule__Declarations__Group_3__1__Impl2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarations__Group_4__0__Impl_in_rule__Declarations__Group_4__02689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Declarations__Group_4__1_in_rule__Declarations__Group_4__02692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Declarations__Group_4__0__Impl2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarations__Group_4__1__Impl_in_rule__Declarations__Group_4__12751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarations__InitialisationsAssignment_4_1_in_rule__Declarations__Group_4__1__Impl2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarations__Group_5__0__Impl_in_rule__Declarations__Group_5__02812 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Declarations__Group_5__1_in_rule__Declarations__Group_5__02815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Declarations__Group_5__0__Impl2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarations__Group_5__1__Impl_in_rule__Declarations__Group_5__12874 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Declarations__Group_5__2_in_rule__Declarations__Group_5__12877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarations__TransitionsAssignment_5_1_in_rule__Declarations__Group_5__1__Impl2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarations__Group_5__2__Impl_in_rule__Declarations__Group_5__22934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Declarations__Group_5__2__Impl2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__0__Impl_in_rule__VarDecl__Group__02999 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__1_in_rule__VarDecl__Group__03002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__VariableNameAssignment_0_in_rule__VarDecl__Group__0__Impl3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__1__Impl_in_rule__VarDecl__Group__13059 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__2_in_rule__VarDecl__Group__13062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__VarDecl__Group__1__Impl3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__2__Impl_in_rule__VarDecl__Group__23121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__ValueSetAssignment_2_in_rule__VarDecl__Group__2__Impl3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subrange__Group__0__Impl_in_rule__Subrange__Group__03184 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Subrange__Group__1_in_rule__Subrange__Group__03187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Subrange__Group__0__Impl3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subrange__Group__1__Impl_in_rule__Subrange__Group__13246 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Subrange__Group__2_in_rule__Subrange__Group__13249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subrange__LowerBoundAssignment_1_in_rule__Subrange__Group__1__Impl3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subrange__Group__2__Impl_in_rule__Subrange__Group__23306 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Subrange__Group__3_in_rule__Subrange__Group__23309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Subrange__Group__2__Impl3337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subrange__Group__3__Impl_in_rule__Subrange__Group__33368 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Subrange__Group__4_in_rule__Subrange__Group__33371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subrange__UpperBoundAssignment_3_in_rule__Subrange__Group__3__Impl3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subrange__Group__4__Impl_in_rule__Subrange__Group__43428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Subrange__Group__4__Impl3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initialisation__Group__0__Impl_in_rule__Initialisation__Group__03497 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Initialisation__Group__1_in_rule__Initialisation__Group__03500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initialisation__VariableAssignment_0_in_rule__Initialisation__Group__0__Impl3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initialisation__Group__1__Impl_in_rule__Initialisation__Group__13557 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Initialisation__Group__2_in_rule__Initialisation__Group__13560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Initialisation__Group__1__Impl3588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initialisation__Group__2__Impl_in_rule__Initialisation__Group__23619 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Initialisation__Group__3_in_rule__Initialisation__Group__23622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initialisation__ValueAssignment_2_in_rule__Initialisation__Group__2__Impl3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initialisation__Group__3__Impl_in_rule__Initialisation__Group__33679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Initialisation__Group__3__Impl3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__03746 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__03749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__TransitionNumerAssignment_0_in_rule__Transition__Group__0__Impl3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__13806 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__13809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Transition__Group__1__Impl3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__23868 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__23871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__GuardsAssignment_2_in_rule__Transition__Group__2__Impl3898 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__33929 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__33932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Transition__Group__3__Impl3960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__43991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__AssignmentsAssignment_4_in_rule__Transition__Group__4__Impl4018 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Guard__Group__0__Impl_in_rule__Guard__Group__04059 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Guard__Group__1_in_rule__Guard__Group__04062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__VariableAssignment_0_in_rule__Guard__Group__0__Impl4089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__1__Impl_in_rule__Guard__Group__14119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Guard__Group__2_in_rule__Guard__Group__14122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Guard__Group__1__Impl4150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__2__Impl_in_rule__Guard__Group__24181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__ValueAssignment_2_in_rule__Guard__Group__2__Impl4208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__04244 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__04247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__VariableAssignment_0_in_rule__Assignment__Group__0__Impl4274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__14304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__14307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Assignment__Group__1__Impl4335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__24366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ValueAssignment_2_in_rule__Assignment__Group__2__Impl4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Context__ContextNameAssignment_04434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_rule__Context__BodyAssignment_24465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDeclaration_in_rule__Body__TypesAssignment_14496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleDeclaration_in_rule__Body__ModuleAssignment_24527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TypeDeclaration__TypeNameAssignment_04558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TypeDeclaration__TypeValuesAssignment_24589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ModuleDeclaration__ModuleNameAssignment_04620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_rule__ModuleDeclaration__ModuleAssignment_24651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarations_in_rule__Module__DeclarationAssignment_14682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_rule__Declarations__VariableDeclarationsAssignment_0_14713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_rule__Declarations__VariableDeclarationsAssignment_1_14744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_rule__Declarations__VariableDeclarationsAssignment_2_14775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__Declarations__DefinitionsAssignment_3_14806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialisation_in_rule__Declarations__InitialisationsAssignment_4_14837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__Declarations__TransitionsAssignment_5_14868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__VarDecl__VariableNameAssignment_04899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueSet_in_rule__VarDecl__ValueSetAssignment_24930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Scalar__NameAssignment4961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Subrange__LowerBoundAssignment_14992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Subrange__UpperBoundAssignment_35023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Initialisation__VariableAssignment_05054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Initialisation__ValueAssignment_25085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Transition__TransitionNumerAssignment_05116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_rule__Transition__GuardsAssignment_25147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__Transition__AssignmentsAssignment_45178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Guard__VariableAssignment_05209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Guard__ValueAssignment_25240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Assignment__VariableAssignment_05271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Assignment__ValueAssignment_25302 = new BitSet(new long[]{0x0000000000000002L});

}