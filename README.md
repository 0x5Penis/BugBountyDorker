# Bug Bounty Dorker

How to use addons:

name: name of the addon \
searchOperators: "dorks" that this addon will contain \
searchEngine: the search engine this addon will use (Example: https://www.google.com/search?q=) \
siteSearchOperator: what to use to find sites (Example: site:google.com)

```
{
  "addons": [
    {
      "name": "Example",
      "searchOperators": "inurl: Example",
      "searchEngine": "https://www.google.com/search?q=",
      "siteSearchOperator": "site:"
    },
    {
      "name": "test1",
      "searchOperators": "test21",
      "searchEngine": "test21",
      "siteSearchOperator": "test21"
    }
  ]
}
```
Bug Bounty Dorker ignores plugins named `example.json`. \
parent json object that contains the addons must be called "addons" \
one plugin and one example plugin comes with Bug Bounty Dorker in the releases section
