# wctool

Build Your Own wc Tool

This challenge is to build your own version of the Unix command line tool wc!

The Unix command line tools are a great metaphor for good software engineering and they follow the Unix Philosophies of:

Writing simple parts connected by clean interfaces - each tool does just one thing and provides a simple CLI that handles text input from either files or file streams.
Design programs to be connected to other programs - each tool can be easily connected to other tools to create incredibly powerful compositions.
Following these philosophies has made the simple unix command line tools some of the most widely used software engineering tools - allowing us to create very complex text data processing pipelines from simple command line tools. There’s even a Coursera course on Linux and Bash for Data Engineering.

You can read more about the Unix Philosophy in the excellent book The Art of Unix Programming.

Challenge from [Coding Challenges](https://codingchallenges.fyi/challenges/challenge-wc)

## Usage

- All info: 
`lein run -m wctool.core test/wctool/resources/test.txt`

- -c command
`lein run -m wctool.core -c test/wctool/resources/test.txt`

- -l command
`lein run -m wctool.core -l test/wctool/resources/test.txt`

- -w command
`lein run -m wctool.core -w test/wctool/resources/test.txt`

- -m command
`lein run -m wctool.core -m test/wctool/resources/test.txt`

## License

Copyright © 2024 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
