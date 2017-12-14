package net.heyzeer0.wrp.profiles;

import com.jagrosh.discordipc.IPCClient;
import com.jagrosh.discordipc.entities.DiscordBuild;
import com.jagrosh.discordipc.entities.RichPresence;

import java.time.OffsetDateTime;

/**
 * Created by HeyZeer0 on 14/12/2017.
 * Copyright © HeyZeer0 - 2016
 */
public class RichProfile {

    IPCClient client;
    boolean ready;

    public RichProfile(long id, DiscordBuild build) throws Exception {
        client = new IPCClient(id);
        client.connect(build);

        ready = true;
    }

    public void stopRichPresence() {
        client.sendRichPresence(null);
    }

    public void updateRichPresence(String state, String details, OffsetDateTime date) {
        client.sendRichPresence(new RichPresence(state, details, date, null, "wynn", null, null, null, null, 1, 1, null, null, null, false));
    }

    public boolean isReady() {
        return ready;
    }

}
