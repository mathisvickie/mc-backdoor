# mc-backdoor
PoC minecraft backdoor plugin

Simple Proof of concept backdoor plugin for minecraft server that should show all admins that drag & dropping shit in /plugins/ folder is same stupid as downloading and running random unsigned binary file. In this case the backdoor consist only of in-game priviledge escalation, any user knowing token _#aExFvSdqIOelF!_ will be able to execute arbitrary console command (giving any items including bedrock to break economy, editing NBT of items to create OP 32K stuff, up to banning players from server). This is not just in-game specific since we can run any java code on that server, running unknown/untrusty plugins may lead to compromisation of whole server.

Since i lost source code and all stuff around it, i just have this binary. You should download java decompiler to see source, its not a big deal: whole plugin has around 10 lines
