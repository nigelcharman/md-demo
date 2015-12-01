# Specifications - Spec01

We want the application to accept a word as an input and normalise its case such that the first letter is in upper case, followed by the other letters in smaller case. If there are 2 or more words entered, separated by a whitespace, the same convention would apply on all the words. However, if all the letters in a word are in capital case, the word shouldn't be changed.

## Examples - Basic Style

* '[Continuous integration](- "#skill")' is changed into '[Continuous Integration](- "?=normalise(#skill)")'
* '[java](- "#skill")' is changed into '[Java](- "?=normalise(#skill)")'
* '[IBM](- "#skill")' is changed into '[IBM](- "?=normalise(#skill)")'
* '[IBM websphere](- "#skill")' is changed into '[IBM Websphere](- "?=normalise(#skill)")'


## Examples - Advanced Styles

* '[java](- "#skill")' is changed into '[Java](- "?=normalise(#skill)")'
* '[java](- "#skill")' is [changed](- "#result=normalise(#skill)") into '[Java](- "?=#result")
* '[java](- "#result=normalise(#TEXT)")' is changed into '[Java](- "?=#result")'

## Examples - Table Style

|[_norm_][] [Entered][]| [Displayed][]        |
|----------------------|----------------------|
|Continuous integration|Continuous Integration|
|java                  |Java                  |
|IBM                   |IBM                   |
|IBM websphere         |IBM Websphere         |

[Entered]:   - "#skill"
[_norm_]:    - "#result=normalise(#skill)"
[Displayed]: - "?=#result"
