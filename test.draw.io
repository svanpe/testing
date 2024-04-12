<mxfile host="app.diagrams.net" modified="2024-04-12T00:00:00Z" agent="5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.9999.999 Safari/537.36" etag="ZjX2wmra1pJ7IK2qX7Fm" version="13.9.3" type="google">
  <diagram name="Page-1" id="d-8bMc2e_3NRfHXPcc-N">
    <mxGraphModel dx="1440" dy="829" grid="1" gridSize="10" guides="1" tooltips="1" connect="1" arrows="1" fold="1" page="1" pageScale="1" pageWidth="827" pageHeight="1169" math="0" shadow="0">
      <root>
        <mxCell id="0"/>
        <mxCell id="1" parent="0"/>
        <mxCell id="5" parent="1">
          <mxGeometry x="160" y="80" width="120" height="60" as="geometry"/>
        </mxCell>
        <mxCell id="6" value="Type de données" style="shape=parallelogram;perimeter=parallelogramPerimeter;" vertex="1" parent="1">
          <mxGeometry x="40" y="40" width="120" height="60" as="geometry"/>
        </mxCell>
        <mxCell id="2" parent="1"/>
        <mxCell id="3" parent="1"/>
        <mxCell id="4" parent="1"/>
        <mxCell id="7" value="Structurées" style="shape=rectangle;rounded=1;" vertex="1" parent="1">
          <mxGeometry x="110" y="150" width="80" height="40" as="geometry"/>
        </mxCell>
        <mxCell id="8" value="(Non structurées)" style="shape=ellipse;" vertex="1" parent="1">
          <mxGeometry x="300" y="150" width="120" height="40" as="geometry"/>
        </mxCell>
        <mxCell id="9" value="Volume de données" style="shape=parallelogram;perimeter=parallelogramPerimeter;" vertex="1" parent="1">
          <mxGeometry x="40" y="220" width="120" height="60" as="geometry"/>
        </mxCell>
        <mxCell id="10" value="Besoins de scalabilité" style="shape=parallelogram;perimeter=parallelogramPerimeter;" vertex="1" parent="1">
          <mxGeometry x="40" y="330" width="120" height="60" as="geometry"/>
        </mxCell>
        <mxCell id="11" value="Nature des requêtes" style="shape=parallelogram;perimeter=parallelogramPerimeter;" vertex="1" parent="1">
          <mxGeometry x="40" y="430" width="120" height="60" as="geometry"/>
        </mxCell>
        <mxCell id="12" value="Modèle de cohérence" style="shape=parallelogram;perimeter=parallelogramPerimeter;" vertex="1" parent="1">
          <mxGeometry x="40" y="530" width="120" height="60" as="geometry"/>
        </mxCell>
        <mxCell id="13" value="Concurrence" style="shape=parallelogram;perimeter=parallelogramPerimeter;" vertex="1" parent="1">
          <mxGeometry x="40" y="630" width="120" height="60" as="geometry"/>
        </mxCell>
        <mxCell id="14" value="Budget" style="shape=parallelogram;perimeter=parallelogramPerimeter;" vertex="1" parent="1">
          <mxGeometry x="40" y="730" width="120" height="60" as="geometry"/>
        </mxCell>
        <mxCell id="15" value="Choix de la base de données" style="shape=rectangle;rounded=1;" vertex="1" parent="1">
          <mxGeometry x="150" y="840" width="200" height="40" as="geometry"/>
        </mxCell>
        <mxCell id="16" value="Petits volumes, lecture intensive : SQLite, PostgreSQL\nMoyens à grands volumes, scalabilité horizontale : MySQL, PostgreSQL (avec partitionnement), MongoDB\nForte cohérence, faible concurrence : MySQL, PostgreSQL\nCohérence éventuelle, forte concurrence : Apache Cassandra, MongoDB\nBudget élevé : Oracle, Microsoft SQL Server" style="text;html=1;align=center;" vertex="1" parent="1">
          <mxGeometry x="20" y="170" width="250" height="160" as="geometry"/>
        </mxCell>
        <mxCell id="17" value="Faible à moyen volume, nature de requêtes variée : MongoDB, Couchbase\nGrand volume, nature de requêtes variée : MongoDB, Apache Cassandra\nBesoins de scalabilité horizontale : MongoDB, Apache Cassandra\nBudget élevé : Amazon DynamoDB, Google Bigtable" style="text;html=1;align=center;" vertex="1" parent="1">
          <mxGeometry x="20" y="280" width="250" height="160" as="geometry"/>
        </mxCell>
        <mxCell id="18" value="Recherche et analyse de texte : Elasticsearch\nAnalyse de données vectorielles : Apache Solr, Faiss\nAnalyse de données géospatiales : Elasticsearch, PostGIS" style="text;html=1;align=center;" vertex="1" parent="1">
          <mxGeometry x="20" y="590" width="250" height="130" as="geometry"/>
        </mxCell>
      </mxGraphModel>
    </diagram>
</mxfile>
