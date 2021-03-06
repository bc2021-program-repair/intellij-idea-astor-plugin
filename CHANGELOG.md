<!-- Keep a Changelog guide -> https://keepachangelog.com -->

# IntelliJ Idea Astor Plugin ChangeLog

## [Unreleased]
## [0.3.7]
- Resolve lagging
- Colorful logging

## [0.3.6]
- Large zip file support

## [0.3.5]
- Zip project
- Disable line wrap
- Colored logging level

## [0.3.4]
- Simplify cleaning code step

## [0.3.3]
- Null pointer bugfix

## [0.3.2]
- Configuration
- Indicates solution availability
## [0.3.1]
- Apply new proto structure

## [0.3.0]
- Removed astor submodule 
- Use new backend
- Bugfixes
## [0.2.4]
### Changes
- Better logging

## [0.2.3]
### Changes
- Use PSI to reformat code
- Show diff after astor
- Small bugfixes

## [0.2.2]
### Added
- Code references builder and tests

## [0.2.1]
### Added
- Show diff

### Problems
- Comments missing from repaired code
- Unnecessary full class name
- Unreserved code format


## [0.2.0]
### Changes
- Icon for tool window 
- Reformatting patches
- Various bugfixes

## [0.1.8]
### Added
- Logging forwarding
- Multithreading
- Separate gRPC without direct dependency on astor
- Load result config

## [0.1.7]
### Added
- Text panel
- Unfinished stdout streaming

## [0.1.6]
### Changes
- use gRPC
- use the latest IDEA and java 11

## [0.1.5]
### Problems
- no javax.tools.ToolProvider.getSystemJavaCompiler in JRE
### Fixes
- java_home error from astor
### Added
- full arguments

## [0.1.4]
### Added
- Extract jreVersion
- Autodetect gradle/maven and fill in arguments for astor
- Dependencies on core plugins

## [0.1.3]
### Fixed
- Chose a proper set of IDEA and JDK
- Download proper source in download_idea.sh

### Added
- Read basic config from IDEA

## [0.1.2]
### Fixed
- GitHub action
### Added
- Added Astor menu item

## [0.1.1]
### Fixed
- pluginUntilBuild does not include 2021.1.2

## [0.1.0]
### Added
- Initialize project


