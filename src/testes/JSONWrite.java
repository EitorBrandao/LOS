package testes;

public List<String> getValuesForGivenKey(String jsonArrayStr, String key) {
    JSONArray jsonArray = new JSONArray(jsonArrayStr);
    return IntStream.range(0, jsonArray.length())
      .mapToObj(index -> ((JSONObject)jsonArray.get(index)).optString(key))
      .collect(Collectors.toList());
}
