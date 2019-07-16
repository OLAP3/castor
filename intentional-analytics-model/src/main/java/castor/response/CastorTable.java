package castor.response;

import algorithm.AlgorithmOne;
import olap.CellSet;
import result.HeaderTree;

import java.util.List;

/**
 * This class gather all information needed to display a table of the output of {@link AlgorithmOne AlgorithmOne}.
 * If you want to display.
 *
 * @see CastorJsonResponse
 */
public class CastorTable {

    /**
     * MDX query that produce the result (in {@link AlgorithmOne#compute(CellSet, CellSet) AlgorithmOne.compute(&hellip)}
     * it's the query that have produced cellSetNew).
     */
    private String query;

    /**
     * Cells value matrix of the MDX query result. <br/>
     * Must be the same size as {@link CastorTable#significanceScores significanceScores} matrix,
     * {@link CastorTable#surpriseScores surpriseScores} matrix and {@link CastorTable#clusters clusters} matrix.
     */
    private Double[][] data;

    /**
     * Row headers of the MDX query result.
     */
    private HeaderTree rowHeaders;

    /**
     * Columns headers of the MDX query result
     */
    private HeaderTree columnHeaders;

    /**
     * List of coordinates of all the highlighted cells. A coordinate is a list of integer like [rowIndex, columnIndex]
     * for 2D coordinates.
     */
    private List<List<Integer>> highlightedCellPositions;

    /**
     * Cells significance score matrix. <br/>
     * Must be the same size as {@link CastorTable#data data} matrix, {@link CastorTable#surpriseScores surpriseScores} matrix and
     * {@link CastorTable#clusters clusters} matrix.
     */
    private Double[][] significanceScores;

    /**
     * Cells surprise score matrix. <br/>
     * Must be the same size as {@link CastorTable#data data} matrix, {@link CastorTable#significanceScores significanceScores}
     * matrix and {@link CastorTable#clusters clusters} matrix.
     */
    private Double[][] surpriseScores;

    /**
     * Cells cluster matrix. Integer value match the cluster number <br/>
     * Must be the same size as {@link CastorTable#data data} matrix, {@link CastorTable#significanceScores significanceScores}
     * matrix and {@link CastorTable#surpriseScores surpriseScores} matrix.
     */
    private Integer[][] clusters;

    public CastorTable(String query, Double[][] data, HeaderTree rowHeaders, HeaderTree columnHeaders, List<List<Integer>> highlightedCellPositions, Double[][] significanceScores, Double[][] surpriseScores) {
        this.query = query;
        this.data = data;
        this.rowHeaders = rowHeaders;
        this.columnHeaders = columnHeaders;
        this.highlightedCellPositions = highlightedCellPositions;
        this.significanceScores = significanceScores;
        this.surpriseScores = surpriseScores;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Integer[][] getClusters() {
        return clusters;
    }

    public void setClusters(Integer[][] clusters) {
        this.clusters = clusters;
    }

    public HeaderTree getRowHeaders() {
        return rowHeaders;
    }

    public void setRowHeaders(HeaderTree rowHeaders) {
        this.rowHeaders = rowHeaders;
    }

    public HeaderTree getColumnHeaders() {
        return columnHeaders;
    }

    public void setColumnHeaders(HeaderTree columnHeaders) {
        this.columnHeaders = columnHeaders;
    }

    public Double[][] getData() {
        return data;
    }

    public void setData(Double[][] data) {
        this.data = data;
    }

    public List<List<Integer>> getHighlightedCellPositions() {
        return highlightedCellPositions;
    }

    public void setHighlightedCellPositions(List<List<Integer>> highlightedCellPositions) {
        this.highlightedCellPositions = highlightedCellPositions;
    }

    public Double[][] getSignificanceScores() {
        return significanceScores;
    }

    public void setSignificanceScores(Double[][] significanceScores) {
        this.significanceScores = significanceScores;
    }

    public Double[][] getSurpriseScores() {
        return surpriseScores;
    }

    public void setSurpriseScores(Double[][] surpriseScores) {
        this.surpriseScores = surpriseScores;
    }
}
