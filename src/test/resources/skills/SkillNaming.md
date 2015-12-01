# Skill Naming

Users enter skills into the system in different cases. We want the tool to normalise the cases.

## Examples

* '[Continuous integration](- "#skill")' is changed into '[Continuous Integration](- "?=normalise(#skill)")'
* '[java](- "#skill")' is changed into '[Java](- "?=normalise(#skill)")'
* '[IBM](- "#skill")' is changed into '[IBM](- "?=normalise(#skill)")'







* '[java](- "#skill")' is changed into '[Java](- "?=normalise(#skill)")'
* '[java](- "#skill")' is [changed](- "#result=normalise(#skill)") into '[Java](- "?=#result")'


* '[java](- "#result=normalise(#TEXT)")' is changed into '[Java](- "?=#result")'

## Examples as a table

When I enter the following skills, they are displayed as shown.

|[_norm_][] [Entered][]| [Displayed][]        |
|----------------------|----------------------|
|Continuous integration|Continuous Integration|
|java                  |Java                  |
|IBM                   |IBM                   |

[Entered]:   - "#skill"
[_norm_]:    - "#result=normalise(#skill)"
[Displayed]: - "?=#result"
