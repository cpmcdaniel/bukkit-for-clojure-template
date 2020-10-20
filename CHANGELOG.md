# Change Log
All notable changes to this project will be documented in this file. This change log follows the conventions of [keepachangelog.com](http://keepachangelog.com/).

## Unreleased

## 0.1.3
### Changed
- Hyphens in class name are now removed. 
- Template behaves consistently for both `appid` and `groupid/appid` arguments.
- .*ignore file sources have been renamed to drop the `.` from the front. The
  template now renames them appropriately. Prior to this change, these files 
  weren't being included in the jar file, or, in the case of .hgignore, weren't even being included in the repository.

## 0.1.2
### Added
- Have to add `:jar-inclusions` to allow .gitignore and .hgignore files to be included.

## 0.1.1
### Changed
- Trying to get lein release tasks working.

## 0.1.0
- Initial release.

