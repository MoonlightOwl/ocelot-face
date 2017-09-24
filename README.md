# { Ocelot.Online }
Ocelot is an Opencomputers emulator in your browser.

You don't need the Minecraft installation with OpenComputers modpack.
You don't need to download and install any programs. You even don't need Java.

All that you need is a relatively modern browser and the Internet access.

This repository contains Ocelot.Online frontend.

## Build JS scripts
```sh
$ sbt
> fullOptJS
```
This command will generate two JS files:
`./target/scala-2.12/ocelot-face-opt.js` and
`./target/scala-2.12/ocelot-face-jsdeps.min.js`.

You must add these files to your `ocelot-back` distribution,
along with updated `index` page template (if needed).
