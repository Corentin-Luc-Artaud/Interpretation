/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.si5.smarthome.am.shome.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.unice.polytech.si5.smarthome.am.shome.ide.contentassist.antlr.internal.InternalShomeParser;
import fr.unice.polytech.si5.smarthome.am.shome.services.ShomeGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ShomeParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ShomeGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ShomeGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getHomeAccess().getGroup(), "rule__Home__Group__0");
			builder.put(grammarAccess.getSubjectAccess().getGroup(), "rule__Subject__Group__0");
			builder.put(grammarAccess.getSubjectAccess().getGroup_5(), "rule__Subject__Group_5__0");
			builder.put(grammarAccess.getActorAccess().getGroup(), "rule__Actor__Group__0");
			builder.put(grammarAccess.getOccurenceAccess().getGroup(), "rule__Occurence__Group__0");
			builder.put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
			builder.put(grammarAccess.getConditionAccess().getGroup_4(), "rule__Condition__Group_4__0");
			builder.put(grammarAccess.getHomeTimeStampAccess().getGroup(), "rule__HomeTimeStamp__Group__0");
			builder.put(grammarAccess.getEventAccess().getGroup(), "rule__Event__Group__0");
			builder.put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
			builder.put(grammarAccess.getHomeAccess().getOwnedSubjectsAssignment_3(), "rule__Home__OwnedSubjectsAssignment_3");
			builder.put(grammarAccess.getHomeAccess().getOwnedSubjectsAssignment_4(), "rule__Home__OwnedSubjectsAssignment_4");
			builder.put(grammarAccess.getHomeAccess().getOwnedActorsAssignment_5(), "rule__Home__OwnedActorsAssignment_5");
			builder.put(grammarAccess.getHomeAccess().getOwnedActorsAssignment_6(), "rule__Home__OwnedActorsAssignment_6");
			builder.put(grammarAccess.getHomeAccess().getOwnedEventsAssignment_7(), "rule__Home__OwnedEventsAssignment_7");
			builder.put(grammarAccess.getHomeAccess().getOwnedEventsAssignment_8(), "rule__Home__OwnedEventsAssignment_8");
			builder.put(grammarAccess.getHomeAccess().getOwnedConditionsAssignment_9(), "rule__Home__OwnedConditionsAssignment_9");
			builder.put(grammarAccess.getHomeAccess().getOwnedConditionsAssignment_10(), "rule__Home__OwnedConditionsAssignment_10");
			builder.put(grammarAccess.getHomeAccess().getOwnedOccurencesAssignment_11(), "rule__Home__OwnedOccurencesAssignment_11");
			builder.put(grammarAccess.getHomeAccess().getOwnedOccurencesAssignment_12(), "rule__Home__OwnedOccurencesAssignment_12");
			builder.put(grammarAccess.getSubjectAccess().getNameAssignment_1(), "rule__Subject__NameAssignment_1");
			builder.put(grammarAccess.getSubjectAccess().getOwnedActionsAssignment_4(), "rule__Subject__OwnedActionsAssignment_4");
			builder.put(grammarAccess.getSubjectAccess().getOwnedActionsAssignment_5_1(), "rule__Subject__OwnedActionsAssignment_5_1");
			builder.put(grammarAccess.getActorAccess().getNameAssignment_2(), "rule__Actor__NameAssignment_2");
			builder.put(grammarAccess.getOccurenceAccess().getOwnedTimeAssignment_0(), "rule__Occurence__OwnedTimeAssignment_0");
			builder.put(grammarAccess.getOccurenceAccess().getEventAssignment_2(), "rule__Occurence__EventAssignment_2");
			builder.put(grammarAccess.getConditionAccess().getEventAssignment_1(), "rule__Condition__EventAssignment_1");
			builder.put(grammarAccess.getConditionAccess().getActionsAssignment_3(), "rule__Condition__ActionsAssignment_3");
			builder.put(grammarAccess.getConditionAccess().getActionsAssignment_4_1(), "rule__Condition__ActionsAssignment_4_1");
			builder.put(grammarAccess.getHomeTimeStampAccess().getHourAssignment_0(), "rule__HomeTimeStamp__HourAssignment_0");
			builder.put(grammarAccess.getHomeTimeStampAccess().getMinAssignment_2(), "rule__HomeTimeStamp__MinAssignment_2");
			builder.put(grammarAccess.getHomeTimeStampAccess().getSecAssignment_4(), "rule__HomeTimeStamp__SecAssignment_4");
			builder.put(grammarAccess.getEventAccess().getNameAssignment_1(), "rule__Event__NameAssignment_1");
			builder.put(grammarAccess.getEventAccess().getActorAssignment_3(), "rule__Event__ActorAssignment_3");
			builder.put(grammarAccess.getEventAccess().getActionAssignment_5(), "rule__Event__ActionAssignment_5");
			builder.put(grammarAccess.getActionAccess().getNameAssignment_1(), "rule__Action__NameAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ShomeGrammarAccess grammarAccess;

	@Override
	protected InternalShomeParser createParser() {
		InternalShomeParser result = new InternalShomeParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ShomeGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ShomeGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
