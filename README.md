# bukkit-for-clojure

A Leiningen template for creating [Bukkit](https://bukkit.org/) plugins in [Clojure](https://clojure.org).

## Links

- [Bukkt4Clojure plugin](FIXME) - A Bukkit plugin providing the Clojure
  runtime and library for dependent plugins so they don't have to bother with including these. Also
  provides an abstract base class for your Clojure plugin. Go here to download the plugin.
- [Bukkit4Clojure project](https://github.com/cpmcdaniel/Bukkit4Clojure) - The source code for the 
  Bukkit4Clojure base plugin. Also home to the documentation for Clojure plugin developers.
- [SpigotMC](https://www.spigotmc.org/) - A modified Minecraft server (and community) based on 
  CraftBukkit. The server APIs and docs are here. This is one option for you to run your own
  Minecraft server (and test your plugins).
- [PaperMC](https://papermc.io/) - Built on top of Spigot (compatible with Spigot plugins) with
  performance improvements and an easy-to-use installer. Bukkit API docs are also availavble here.
  This is another option for running your own server and testing your plugins.

## Usage

```bash
$ lein new bukkit-for-clojure myplugin
```

This will create a project in a directory called `myplugin`. See the [Bukkit4Clojure](https://github.com/cpmcdaniel/Bukkit4Clojure)
docs for your next steps.

## License

```
MIT License

Copyright (c) 2020 Craig McDaniel

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```