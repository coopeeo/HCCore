package com.hackclub.hccore.playermessages;

import static net.kyori.adventure.text.minimessage.MiniMessage.miniMessage;

import net.kyori.adventure.text.Component;

public class RulesMessage {

  final static String minimsgSource = """
      <b><red>Hack Club Anarchy Server Rules</red></b>
      <b>1.</b> Hacked clients are allowed
            
      <b>2.</b> We will patch stuff when we can
            
      <b>3.</b> Duping is allowed but will be patched prob</red>
            
      <b>4.</b> You shall still abide by the <u><click:open_url:'https://hackclub.com/conduct/'><hover:show_text:'Open in Browser'>Hack Club Code of Conduct</hover></click></u>.""";

  public static Component get() {
    return miniMessage().deserialize(minimsgSource);
  }
}
